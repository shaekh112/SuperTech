package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandleSubmenu extends BaseClass{
	
	@Test
	public void SubmenuHandling() throws InterruptedException {
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		
		WebElement SM=driver.findElement(By.linkText("Social Media"));
		
		Actions act=new Actions(driver);
		act.moveToElement(SM).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Google")).click();
		
		Thread.sleep(4000);
	}
	
}
