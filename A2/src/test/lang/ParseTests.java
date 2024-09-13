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
	public void correct3() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct3.in");
	}
	@Test
	public void correct4() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct4.in");
	}
	@Test
	public void correct5() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct5.in");
	}
	@Test
	public void correct6() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct6.in");
	}
	@Test
	public void correct7() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct7.in");
	}
	@Test
	public void correct8() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct8.in");
	}
	@Test
	public void correct9() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct9.in");
	}
	@Test
	public void correct10() {
		Util.testValidSyntax(TEST_DIRECTORY, "correct10.in");
	}

	@Test
	public void correctPdf() {
		Util.testValidSyntax(TEST_DIRECTORY, "correctPdf.in");
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
	@Test
	public void error4() {
		Util.testSyntaxError(TEST_DIRECTORY, "error4.in");
	}
	@Test
	public void error5() {
		Util.testSyntaxError(TEST_DIRECTORY, "error5.in");
	}
	@Test
	public void error6() {
		Util.testSyntaxError(TEST_DIRECTORY, "error6.in");
	}
	@Test
	public void error7() {
		Util.testSyntaxError(TEST_DIRECTORY, "error7.in");
	}
	@Test
	public void error8() {
		Util.testSyntaxError(TEST_DIRECTORY, "error8.in");
	}
	@Test
	public void error9() {
		Util.testSyntaxError(TEST_DIRECTORY, "error9.in");
	}
}
