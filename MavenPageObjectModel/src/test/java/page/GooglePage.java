package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	
	@FindBy(name="q")
	WebElement serachbox;
	public void enterSearchItem(String item) {
		serachbox.sendKeys(item);
	}

}
