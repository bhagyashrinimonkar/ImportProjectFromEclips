package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testprogram.basetest11;


public class Loginpage11 extends basetest11 {
   
	//for all locators 
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement loginlocator ;
	
	//initialize locator 
	public Loginpage11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * @author bhagya
	 * @date 2023-2-06
	 * @discription
	 */
	//method 
	public String logintext() {
		return loginlocator.getText();
	}
	
	
}
