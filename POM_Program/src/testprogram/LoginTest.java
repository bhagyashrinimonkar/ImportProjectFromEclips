package testprogram;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import mainjava.BaseClass;

public class LoginTest extends BaseTest {

	@Test (priority = 1 , groups = "sanity")
	public void VerifyTitleOfPage() {
		// loginobj = new LoginPageMethod(driver);    // constructor of loginmethod object here created so ... constructor initialize
		                                             // we can create object in seprate method in basetest
	  String VerifyTitleOfPage = loginPageMethod.titleofloginpage();
	  SoftAssert soft = new SoftAssert();
		soft.assertEquals(VerifyTitleOfPage, "Login");
		System.out.println("bhagya");    
		soft.assertAll();	  
	
	  
	}
    
}
