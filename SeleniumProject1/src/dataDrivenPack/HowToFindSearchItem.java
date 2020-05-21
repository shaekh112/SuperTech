package dataDrivenPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testngUse.BaseClass;

public class HowToFindSearchItem extends BaseClass{
		
		@Test
		public void googleSearch() throws InterruptedException {
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Bangladesh");
			Thread.sleep(4000);
			List<WebElement>searchlist=driver.findElements(By.xpath("/html/body/div[7]/div"));
			System.out.println("Total Items : "+searchlist.size());
			
			for(int i=0; i<searchlist.size(); i=i+1) {
				System.out.println(i+". "+searchlist.get(i).getText());
			}
			Thread.sleep(4000);
	
		}
}
