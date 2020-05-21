package dataDrivenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MywebsiteParameter {
		protected static WebDriver driver;

		@BeforeTest
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "file:///C:/ITTraining/MyWebsite/MyWebSite.html");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}	

		@Test
		@Parameters({"FName","LName", "Email","PWord","Mon","DY", "YR"})
		
		public void mywebsitesignup(String FName, String LName, String Email, String PWord, 
				String Mon, String DY, String YR) throws InterruptedException {
			
			driver.get("file:///C:/ITTraining/MyWebsite/MyWebSite.html");
			driver.findElement(By.xpath("html/body/div/div[2]/form/input[1]")).sendKeys(FName);
			driver.findElement(By.id("LN")).sendKeys(LName);
			driver.findElement(By.id("EM")).sendKeys(Email);
			
			driver.findElement(By.id("PW")).sendKeys(PWord);
			
			
			Select monthselect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[1]")));
			monthselect.selectByVisibleText(Mon);
			Select dayselect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[2]")));
			dayselect.selectByVisibleText(DY);
			Select yearselect=new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/select[3]")));
			yearselect.selectByVisibleText(YR);
			Thread.sleep(4000);
			
			driver.close();
			
		}
		

	}



