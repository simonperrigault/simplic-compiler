package lang;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lang.ast.ErrorMessage;
import lang.ast.FuncDecl;
import lang.ast.Program;

/**
 * This is a parameterized test: one test case is generated for each input
 * file found in TEST_DIRECTORY. Input files should have the ".in" extension.
 */
@RunWith(Parameterized.class)
public class TestCallGraph {
    /** Directory where the test input files are stored. */
    private static final File TEST_DIRECTORY = new File("testfiles/callgraph");

    private final String filename;
    public TestCallGraph(String testFile) {
        filename = testFile;
    }

    @Test public void runTest() throws Exception {
        Program program = (Program) Util.parse(new File(TEST_DIRECTORY, filename));
        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        for (FuncDecl f : program.getFuncDeclList()) {
            for (FuncDecl called : f.functionCalls()) {
                sb.append("  "+ f.getFuncName().getID() + " -> " + called.getFuncName().getID() + ";\n");
            }
        }
        sb.append("}\n");
        for (FuncDecl f : program.getFuncDeclList()) {
            sb.append(f.getFuncName().getID() + " can reach: { ");
            for (FuncDecl reachable : f.reachable()) {
                sb.append(reachable.getFuncName().getID() + " ");
            }
            sb.append("}\n");
        }
        String actual = sb.toString();
        Util.compareOutput(actual,
                new File(TEST_DIRECTORY, Util.changeExtension(filename, ".out")),
                new File(TEST_DIRECTORY, Util.changeExtension(filename, ".expected")));
    }

    @Parameters(name = "{0}")
    public static Iterable<Object[]> getTests() {
        return Util.getTestParameters(TEST_DIRECTORY, ".in");
    }
}
