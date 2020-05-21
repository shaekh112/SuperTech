package Test;





import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basepake.BaseClass;
import page.BNGpage;
import page.BNSpage;


public class BNGPageTest<SubmitPage> extends BaseClass {
	@Test
	public void bnsSignup() throws InterruptedException {
		
		BNGpage bnsp=(BNGpage) PageFactory.initElements(driver, BNGpage.class);
		driver.get("file:///C:/ITTraining/MyWebsite/MyWebSite.html");
		bnsp.enterFirstName("Mashurul");
		
		bnsp.enterLastName("Alim");
		bnsp.enterEmail("alim123@gmail.com");
		bnsp.enterPassword("alim123");
		bnsp.enterPhoneNumber("2036580716");
		bnsp.selectMonth("May");
		bnsp.selectDay("10");
		bnsp.selectYear("2003");
		bnsp.clickOnMalebutton();
		bnsp.clickOnDLcheckbox();
		bnsp.clickOnSubmitbutton();
		Thread.sleep(4000);
	
	}

}



