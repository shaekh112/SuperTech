package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToHandleAlert extends BaseClass{
	
	@Test(priority=0)
	public void ShowConfirmBox() throws InterruptedException {
		//driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		
		driver.findElement(By.id("btnConfirm")).click();
		
		Thread.sleep(4000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text is : "+alt.getText());
		alt.accept();
		//alt.dismiss();
	}
	@Test(priority=1)
	public void ShowAlert() throws InterruptedException {
		//driver.get("file:///C:/ITTraining/WebSite/SuperTech.html");
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text is : "+alt.getText());
		alt.accept();
		
	}
	@Test(priority=2)
	public void showpromt() throws InterruptedException {
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert Text is : "+alt.getText());
		alt.sendKeys("***********Alim************");
		Thread.sleep(5000);
		alt.accept();
	}
	
	
	

}
