package Test;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basepake.BaseClass;
import page.GooglePage;
import page.SuperTechPage;

public class superTechPageTest extends BaseClass {
	
	@Test(priority=0)
	public void SuperTech() throws InterruptedException {
		SuperTechPage stp=PageFactory.initElements(driver, SuperTechPage.class);
		
		driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		stp.mouseHover();
		
		stp.clickOnGoogle();
		System.out.println("+++++++++++++++++++++++");
		ArrayList<String>googletab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(googletab.get(1));
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void googleTest() throws InterruptedException {
	GooglePage gop=PageFactory.initElements(driver, GooglePage.class);
	gop.enterSearchItem("New Yourk");
	
	Thread.sleep(4000);
	ArrayList<String>supertab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(supertab.get(0));
	}	
	@Test(priority=2)
	public void iframeTest() throws InterruptedException {
		SuperTechPage stp=PageFactory.initElements(driver, SuperTechPage.class);
		stp.enterEiframeFName("Alim");
		stp.clickOnDownload();
		Thread.sleep(4000);
	}
		
	

}



