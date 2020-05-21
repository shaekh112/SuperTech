package testngUse;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyWebsite extends BaseClass{
	
	

	
	@Test
	public void mywebsiteSignUp() throws InterruptedException {
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
		Thread.sleep(3000);

	}
	@Test
	public void mywebsiteSignUp1() throws InterruptedException {
		driver.get("file:///C:/ITTraining/MyWebSite.html"); 
		driver.findElement(By.id("F")).sendKeys("Alim");
		
		driver.findElement(By.id("LN")).sendKeys("Masurul");
		
		driver.findElement(By.id("EM")).sendKeys("shaekh123@gmail.com");
		
		driver.findElement(By.id("CEM")).sendKeys("shaekh123@gmail.com");
		
		driver.findElement(By.id("PW")).sendKeys("123456");
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(10);
		
		Select dayselect=new Select(driver.findElement(By.id("day")));
		dayselect.selectByValue("12");
		
		Select yearselect=new Select(driver.findElement(By.id("year")));
		yearselect.selectByVisibleText("1999");
		Thread.sleep(4000);

	}


}
