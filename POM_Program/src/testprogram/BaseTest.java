package testprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.LoginPageMethod;

public class BaseTest extends BaseClass {

	@BeforeClass
	public void initialbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void ObjectMethod() {
		loginPageMethod = new LoginPageMethod(driver);
	}
	
//	@AfterClass
//	public void QuitEnviroment() {
//		driver.quit();
//	}
	
	}

