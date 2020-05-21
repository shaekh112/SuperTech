package manualtoAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class ManualTestConvertToAutomation extends BaseClass{
	
	@Test(description = "Test Case TC001")
	public void VerifyTitile() {
		driver.get("file:///C:/ITTraining/MyWebSite.html");
		String expectedTitle="This is My Website";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(description = "Test Case TC002")
	public void VerifyScrollText() {
		driver.get("file:///C:/ITTraining/MyWebSite.html");
		String expectedScrollText="This is my Website";
		String actualScrollText=driver.findElement(By.xpath("/html/body/marquee/font/h1")).getText();
		
		Assert.assertEquals(actualScrollText, expectedScrollText);
	}
	@Test(description = "Login form fill up")
	public void loginFormtest() {
		
		
	}
	
	
	

}
