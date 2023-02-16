package uPracticeJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uPracticeTest.Testbase;

public class Method_loginpage extends Testbase{
	//locator 
	@FindBy(name = "username")
	WebElement usrname ;
	@FindBy(name = "password")
	WebElement pass ;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbu ;
	
	//constructor
	public Method_loginpage(WebDriver dri) {
		this.dri = dri ;
		PageFactory.initElements(dri, this);
	}
	//step method 
	public void id() {
		usrname.sendKeys("Admin");
	}
	public void pas() {
		pass.sendKeys("admin123");
}
	public void click() {
		loginbu.click();
	}
}
	
	
	
	
	
	
	
	
