package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import basePack.BaseClass;

public class howToFindSearchItem extends BaseClass{
	@Test
	public void Weatherservice() throws InterruptedException {
	driver.get("");
	driver.findElement(By.name("q")).sendKeys("Bangladesh");
	Thread.sleep(4000);
	List<WebElement>searchlist=driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li"));
	System.out.println("Total Items : "+searchlist.size());
	
	for(int i=0; i<searchlist.size(); i=i+1) {
		System.out.println(i+". "+searchlist.get(i).getText());
	}
	Thread.sleep(4000);
}
}
