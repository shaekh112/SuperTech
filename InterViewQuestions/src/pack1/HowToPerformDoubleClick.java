package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToPerformDoubleClick extends BaseClass{
	
	@Test
	public void doubleClick() throws InterruptedException {
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"fullbody\"]/button[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(dc).doubleClick().build().perform();
		Thread.sleep(3000);
		
	}

}
