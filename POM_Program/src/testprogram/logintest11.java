package testprogram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest11 extends basetest11 {

	@Test
	public void Verifylogin() {
		String Verifylogin = loginpage11.logintext();
		Assert.assertEquals(Verifylogin, "Login");
	}
	@Test 
	public void gitpractice() {
		Assert.assertEquals(false, false);
	}
	
	@Test 
	public void testFeatureBranch() {
		Assert.assertEquals(false, false);
	}
}
