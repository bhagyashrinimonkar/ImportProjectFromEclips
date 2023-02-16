package uPracticeTest;

import org.testng.annotations.Test;

public class Test_loginpage extends Testbase{

	@Test
	public void testpage() {
		loginobj.id();
		loginobj.pas();
		loginobj.click();
	}
}
