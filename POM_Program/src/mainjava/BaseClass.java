package mainjava;

import org.openqa.selenium.WebDriver;


public abstract class BaseClass {    // no one create object to that class so we use abstract

	public static WebDriver driver;   // driver use throghout the project
	protected LoginPageMethod loginPageMethod ;     // after extend class in outside package then only used
	
}
