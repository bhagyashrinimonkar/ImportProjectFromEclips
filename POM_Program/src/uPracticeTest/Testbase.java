package uPracticeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import uPracticeJava.Classbase;
import uPracticeJava.Method_loginpage;

public class Testbase extends Classbase {
	
	@BeforeClass
	public static void main(String[]args)  {
        WebDriverManager.chromedriver().setup();
		 dri = new ChromeDriver();
	     dri.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     dri.manage().window().maximize();
	     dri.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	     
	}
	@BeforeClass
	public void object() {
		loginobj = new Method_loginpage(dri);
	     
	     
	}
}
