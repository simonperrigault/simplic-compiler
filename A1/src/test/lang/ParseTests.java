package lang;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.fail;

public class ParseTests {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles");

	@Test public void assignmentTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "assignment.in");
	}

	@Test public void not_assignTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "not_assign.in");
	}

	@Test public void forTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "for.in");
	}

	@Test public void ifTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "if.in");
	}

	@Test public void if_notTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "if_not.in");
	}

	@Test public void imbricatedIfTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "imbricatedIf.in");
	}

	@Test public void allTest() {
		Util.testValidSyntax(TEST_DIRECTORY, "all.in");
	}

	@Test public void errAssignmentTest() {
		Util.testSyntaxError(TEST_DIRECTORY, "errAssignment.in");
	}

	@Test public void errScanningTest() {
		Util.testSyntaxError(TEST_DIRECTORY, "errScanning.in");
	}

	@Test public void errParsingTest() {
		Util.testSyntaxError(TEST_DIRECTORY, "errParsing.in");
	}
}
