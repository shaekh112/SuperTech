package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basepake.BaseClass;
import page.BNSpage;

public class BNSPageTest extends BaseClass {
	
	@Test
	public void bnsSignup() throws InterruptedException {
		
		BNSpage bnsp=PageFactory.initElements(driver, BNSpage.class);
		driver.get("file:///C:/ITTraining/BNS.html");
		bnsp.enterFirstName("Mashurul");
		
		bnsp.enterLastName("Alim");
		bnsp.enterEmail("alim123@gmail.com");
		bnsp.enterPassword("alim123");
		bnsp.enterPhoneNumber("2036580716");
		bnsp.selectMonth("May");
		bnsp.selectDay("10");
		bnsp.selectYear("2003");
		bnsp.clickOnMalebutton();
		
		bnsp.clickOnSubmitbutton();
		Thread.sleep(4000);
	
	}

}



