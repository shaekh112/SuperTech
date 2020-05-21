package pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToUploadFile extends BaseClass{
	
	@Test
	public void fileUpload() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fullbody\"]/div[4]/form[1]/input")).sendKeys("C:\\ITTraining\\WebSite\\Requirements.xlsx");
		Thread.sleep(4000);
	}

}
