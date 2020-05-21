package testngUse;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyWebsite2 extends BaseClass{
	
	@Test(priority=0)
	public void openUrl() {
		driver.get("file:///C:/ITTraining/MyWebSite.html"); 
	}
	@Test(priority=1)
	public void enterFirstName() {
		driver.findElement(By.id("F")).sendKeys("Shaekh");
	}
	@Test(priority=2)
	public void enterLastname() {
		
		driver.findElement(By.id("LN")).sendKeys("Ahamed");
	}
	@Test(priority=3)
	public void enterEmail() {	
		driver.findElement(By.id("EM")).sendKeys("shaekh123@gmail.com");
	}
	@Test(priority=4)
	public void enterConfirmEmail() {
	driver.findElement(By.id("CEM")).sendKeys("shaekh123@gmail.com");
	}
	@Test(priority=5)
	public void enterPassword() {
		driver.findElement(By.id("PW")).sendKeys("123456");
	}
	@Test(priority=6)
	public void selectMonth() {
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByIndex(10);
	}
	@Test(priority=7)
	public void SelectDay() {
		Select dayselect=new Select(driver.findElement(By.id("day")));
		dayselect.selectByValue("12");
	}
	@Test(priority=8)
	public void SelectYear() {
		Select yearselect=new Select(driver.findElement(By.id("year")));
		yearselect.selectByVisibleText("1999");
	}


}
