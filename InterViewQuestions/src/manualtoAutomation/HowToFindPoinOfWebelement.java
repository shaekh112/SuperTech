package manualtoAutomation;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToFindPoinOfWebelement extends BaseClass {
	
  @Test
public void FindPoinOfWebelement() {
	  driver.get("file:///C:/ITTraining/MyWebSite.html");
		
		Point p=driver.findElement(By.id("F")).getLocation();
		
		int X=p.x;
		int Y=p.y;
		System.out.println("Point is : ("+X+" , "+Y+")");
		System.out.println("X : "+p.x+" Y: "+p.y);
		
		
	}
	

}

  

