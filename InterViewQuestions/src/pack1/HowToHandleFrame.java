package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandleFrame extends BaseClass{

	@Test
	public void IframeHandling() throws InterruptedException {
		driver.get("file:///C:/ITTraining/WebSite/WebSite/SuperTech.html");
		
		List<WebElement>iframeList=driver.findElements(By.tagName("iframe"));
		System.out.println("Total iFrame : "+iframeList.size());
		
		//Typing in first frame
		driver.switchTo().frame(0);
		//driver.switchTo().frame("LoginForm");
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"fullbody\"]/iframe[1]")));
		driver.findElement(By.name("first_name")).sendKeys("Alim");
		//Thread.sleep(4000);
		
		//Return to main frame
		//driver.switchTo().defaultContent();
		
		//Typing in second frame
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("Selenium");
		
		//driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/a")).click();
		
		
		Thread.sleep(4000);
		
	}
}
