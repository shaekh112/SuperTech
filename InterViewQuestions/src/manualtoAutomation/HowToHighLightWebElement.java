package manualtoAutomation;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHighLightWebElement extends BaseClass {
	
	@Test
	public void HighLightWebElement() throws InterruptedException, IOException {
        driver.get("file:///C:/ITTraining/MyWebSite.html");
		WebElement fname=driver.findElement(By.id("F"));
		fname.sendKeys("shaekh");
		//WebElement fname=driver.findElement(By.id("FN"));
		//fname.sendKeys("Alim");
		Thread.sleep(5000);
		
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:2px; dotted red;');", fname);
		
		Thread.sleep(5000);
		File f=fname.getScreenshotAs(OutputType.FILE);
		//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("‪C:\\ITTraining\\ScreenShot"));
		
		
	
	

		
	}
}	


