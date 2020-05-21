package dataDrivenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngUse.BaseClass;

public class DataDriverFrameWorkMyWebsite extends BaseClass{
	
	@Test(dataProvider = "myWebsiteData")
	public void mywebsiteSignUp(String FName, String LName, String Email, String ConEmail, String pass,
			String MN, String DY, String YR) throws InterruptedException {
		
		driver.get("file:///C:/ITTraining/MyWebSite.html"); 
		driver.findElement(By.id("F")).sendKeys(FName);
		
		driver.findElement(By.id("LN")).sendKeys(LName);
		
		driver.findElement(By.id("EM")).sendKeys(Email);
		
		driver.findElement(By.id("CEM")).sendKeys(ConEmail);
		
		driver.findElement(By.id("PW")).sendKeys(pass);
		
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText(MN);
		
		Select dayselect=new Select(driver.findElement(By.id("day")));
		dayselect.selectByVisibleText(DY);
		
		Select yearselect=new Select(driver.findElement(By.id("year")));
		yearselect.selectByVisibleText(YR);
		Thread.sleep(4000);

	}
	@DataProvider(name="myWebsiteData")
	public Object[][] getData(){
		return new Object[][]{
			{"Alim", "Masurul", "alim123@gmail.com", "alim123@gmail.com","alim123","May","10", "1997"},
			{"Shaekh","Ahamed","shaekh123@gmail.com","shaekh123@gmail.com","shaekh123","Jul","12","2002"},
			{"Mohammed","Mahin","mahin123@gmail.com","mahin123@gmail.com","mahin123","Jun","15","2005"},
			{"Alim", "Masurul", "alim123@gmail.com", "alim123@gmail.com","alim123","May","10", "1997"},
			{"Shaekh","Ahamed","shaekh123@gmail.com","shaekh123@gmail.com","shaekh123","Jul","12","2002"},
			{"Mohammed","Mahin","mahin123@gmail.com","mahin123@gmail.com","mahin123","Jun","15","2005"},
			{"Alim", "Masurul", "alim123@gmail.com", "alim123@gmail.com","alim123","May","10", "1997"},
			{"Shaekh","Ahamed","shaekh123@gmail.com","shaekh123@gmail.com","shaekh123","Jul","12","2002"},
			{"Mohammed","Mahin","mahin123@gmail.com","mahin123@gmail.com","mahin123","Jun","15","2005"},

		};
	}
	

}
