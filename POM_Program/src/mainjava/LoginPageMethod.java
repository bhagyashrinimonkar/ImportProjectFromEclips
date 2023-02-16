package mainjava;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testprogram.BaseTest;

public class LoginPageMethod  extends BaseTest {  // BaseClass = browser + Basetest = variables

	//all the locator of the page 
	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtloginpage ;
	
	
	//initialization of variable or locator here 
	public LoginPageMethod(WebDriver driver) {      // driver is in basetest class ..we want here to 
		this.driver = driver;                                         //initailize variable so 
	    PageFactory.initElements(driver , this);    //pagefactory  is class havin initelement method to initialize locator of page 
	                                               //also help if buid is login class then driver also in login class
	    
	}
	/**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-06
	 * @discription - in this test method use to verify login page title
	 * @parameter return - string                                            //this help when code is old then new coder understand the code purpuse
	 */
	
	// methods require to perform test step
	public String titleofloginpage() {
		return txtloginpage.getText();
	}
	
	
}
