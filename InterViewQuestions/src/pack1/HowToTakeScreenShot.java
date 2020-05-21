package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToTakeScreenShot extends BaseClass {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void takingScreenShot() throws InterruptedException, IOException {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Shaekh");
		
		Thread.sleep(3000);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\ITTraining\\ScreenShot\\Facebook.png"));
		
	}
	

}
