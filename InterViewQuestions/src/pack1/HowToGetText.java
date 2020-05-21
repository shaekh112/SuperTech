package pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToGetText extends BaseClass {
	
	@Test
	public void getText() {
		driver.get("https://facebook.com");
		
		String text=driver.findElement(By.linkText("Create a Page")).getText();
		System.out.println("Text is : "+text);
		
	}

}
