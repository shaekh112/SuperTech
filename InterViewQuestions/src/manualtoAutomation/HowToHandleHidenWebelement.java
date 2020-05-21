package manualtoAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandleHidenWebelement extends BaseClass{
	@Test
	public void HandleHidenWebelement() throws InterruptedException {
      driver.get("file:///C:/ITTraining/MyWebSite.html");
		
		
		List<WebElement>fname=driver.findElements(By.id("F"));
		int count=fname.size();
		
		for(int i=0; i<count; i=i+1) {
			WebElement ele=fname.get(i);
			Point p=ele.getLocation();
			System.out.println(" Point is : "+p.x+" "+p.y);
			int x=ele.getLocation().getX();
			if( x!=0 ) {
				ele.sendKeys("Shaekh");
				break;
			}
		}
		
		Thread.sleep(5000);
	}
	}


