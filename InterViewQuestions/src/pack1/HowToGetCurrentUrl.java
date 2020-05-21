package pack1;

import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToGetCurrentUrl extends BaseClass{
	
	@Test
	public void getCurrentUrl() {
		driver.get("https://facebook.com");
		
		String url=driver.getCurrentUrl();
		System.out.println("Current Url is : "+url);
	}

}
