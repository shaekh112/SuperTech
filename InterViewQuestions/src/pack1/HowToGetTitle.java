package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToGetTitle extends BaseClass{
	@Test
	public void getTitle() {
		driver.get("https://facebook.com");
		
		String title=driver.getTitle();
		System.out.println("Title is : "+title);
		
		String expectedTitle="Facebook - Log In or Sign Up";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
