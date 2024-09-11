package lang;

import java.beans.Transient;
import java.io.File;

import org.junit.Test;

public class ParseTests {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/parser");

	@Test
	public void correct1() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct1.in");
	}
	@Test
	public void correct2() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct2.in");
	}

	@Test
	public void error1() {
		Util.testSyntaxError(TEST_DIRECTORY, "error1.in");
	}
	@Test
	public void error2() {
		Util.testSyntaxError(TEST_DIRECTORY, "error2.in");
	}
	@Test
	public void error3() {
		Util.testSyntaxError(TEST_DIRECTORY, "error3.in");
	}
}
