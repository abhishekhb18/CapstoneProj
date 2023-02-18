package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testScenarios.Driver;

public class medicareAboutPage extends Driver {
WebDriver driver;
	
	public medicareAboutPage(WebDriver driver ) {
		this.driver= driver;
	}
	@FindBy(xpath="//a[text()='About']") WebElement aboutLink;
	
	
	public void navigateAbout() {
		log.info("Clicking about button");
		aboutLink.click();
	}
	
}
