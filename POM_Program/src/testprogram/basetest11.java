package testprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.Loginpage11;
import mainjava.baseclass11;

public class basetest11 extends baseclass11 {

	@BeforeClass
	public void initialbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		
	}
	@BeforeClass
	public void objectmethods() {
		loginpage11 = new Loginpage11(driver);
	}
	@AfterClass
	public void teardownenv() {
		driver.quit();
	}
}
