package manualtoAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToFindDimensionWebelement extends BaseClass {
	@Test
	public void FindDimensionWebelement() { 
	driver.get("file:///C:/ITTraining/MyWebSite.html");
	int height=driver.findElement(By.id("F")).getRect().height;
	int width=driver.findElement(By.id("F")).getRect().width;
	System.out.println("Height is : "+height+"  Width is : "+width);
	
	//System.out.println("Height is: " +height+" width is: "+width);
	//int h=driver.findElement(By.xpath("/html/body/div/div[1]/img")).getRect().height;
	//int w=driver.findElement(By.xpath("/html/body/div/div[1]/img")).getRect().width;
	
	//System.out.println("Height is : "+h+"  Width is : "+w);
	
}



}



