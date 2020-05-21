package facebookPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDrivers\\chromedriver.exe");
		
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Alim");
	
		driver.findElement(By.name("lastname")).sendKeys("mashurul");
		
		driver.findElement(By.name("reg_email__")).sendKeys("shaekh11@yahoo.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shaekh11@yahoo.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc123");
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(8);
		
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByValue("22");
		
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText("1986");
		
		driver.findElement(By.id("u_0_7")).click();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
