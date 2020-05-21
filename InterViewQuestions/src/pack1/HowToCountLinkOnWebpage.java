package pack1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class HowToCountLinkOnWebpage extends BaseClass {
	
	@Test
	public void linkCounting() throws IOException {
		//driver.get("file:///C:/ITTraining/MyWebSite.html");
		driver.get("http://www.dsebd.org/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int totalLink=links.size();
		
		System.out.println("Total Links are : "+totalLink);
		
		File f=new File("C:\\ITTraining\\ListOfLink.docs");
		FileWriter fw=new FileWriter(f);
		@SuppressWarnings("resource")
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int i=0; i<totalLink; i=i+1) {
			
		System.out.println(i+". "+links.get(i).getAttribute("href")+"=====Link Text are>> "+links.get(i).getText());
		
		bw.write(i+". "+links.get(i).getAttribute("href")+"=====link text are>> "+ links.get(i).getText());
		bw.newLine();
		bw.flush();
		}
	
		
	}

}
