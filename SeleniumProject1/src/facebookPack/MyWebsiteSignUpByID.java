package facebookPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWebsiteSignUpByID {

	public static void main(String[] args) { 
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDrivers\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("file:///C:/ITTraining/MyWebSite.html"); 
		driver.findElement(By.id("F")).sendKeys("Shaekh");
		
		driver.findElement(By.id("LN")).sendKeys("Ahamed");
		
		driver.findElement(By.id("EM")).sendKeys("shaekh123@gmail.com");
		
		driver.findElement(By.id("CEM")).sendKeys("shaekh123@gmail.com");
		
		driver.findElement(By.id("PW")).sendKeys("123456");
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(10);
		
		Select dayselect=new Select(driver.findElement(By.id("day")));
		dayselect.selectByValue("12");
		
		Select yearselect=new Select(driver.findElement(By.id("year")));
		yearselect.selectByVisibleText("1999");

	}

}
