package testngUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	protected static  WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDrivers\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().window().maximize();
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
