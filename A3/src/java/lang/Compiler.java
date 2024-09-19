package lang;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import lang.ast.Program;
import lang.ast.LangParser;
import lang.ast.LangScanner;

/**
 * Computes the maximum statement nesting depth for a Calc program.
 */
public class Compiler {
            
        public static Object CodeProber_parse(String[] args) throws Throwable {
            return parse(args);
        }
    
        public static Program parse(String[] args) throws IOException, beaver.Parser.Exception {
            String filename = args[args.length - 1]; // Assumes filename is the last argument
            LangScanner scanner = new LangScanner(new FileReader(filename));
            LangParser parser = new LangParser();
            Program program = (Program) parser.parse(scanner);
            return program;
        }
    
        public static void main(String[] args) {
        try {
            if (args.length != 1) {
                System.err.println(
                        "You must specify a source file on the command line!");
                System.exit(1);
                return;
            }
            Program program = parse(args);
            System.out.println("MSN : " + MSNVisitor.result(program));
            program.prettyPrint(System.out);
            // System.out.println("Found interactive statement(s): " + CheckInteractiveVisitor.result(program));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Unexpected I/O exception. Perhaps permission problems?");
            e.printStackTrace();
            System.exit(1);
        } catch (beaver.Parser.Exception e) {
            System.out.println("Parsing failed!");
            e.printStackTrace();
            System.exit(1);
        }
    }
}

