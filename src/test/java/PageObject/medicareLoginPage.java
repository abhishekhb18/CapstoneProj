package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testScenarios.Driver;

public class medicareLoginPage extends Driver {
	WebDriver driver;
	
	public medicareLoginPage(WebDriver driver ) {
		this.driver= driver;
	}
	@FindBy (xpath="//a[text()='Login Here']")
	 WebElement loginpgebtn;
	
	@FindBy (xpath="//input[@id='username']")
	 WebElement userName;
	
	
	@FindBy (xpath ="//input[@id='password']")
	 WebElement password;
	
	@FindBy (xpath ="//input[@value='Login']")
		WebElement signIn;
	
	
	public void clickloginpge() throws InterruptedException {
		loginpgebtn.click();
		Thread.sleep(4000);
		log.info("Click on login page button");
	}
	
	public void enterUserName(String Name) throws InterruptedException{
		userName.click();
		userName.sendKeys(Name);
		Thread.sleep(4000);
		log.info("Enter UserName");
		
	}
//Enter the Password using Excel File		
	public void enterPassword(String pass) throws InterruptedException{
		
		password.click();
		password.sendKeys(pass);
		log.info("Enter Password");
		Thread.sleep(3000);
	}

//Click on Sign-in button	
	public void clickSignIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(4000);
		log.info("Click on Sign-in button");
	}
	



}
