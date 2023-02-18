package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testScenarios.Driver;

public class medicareSignupPage extends Driver {
WebDriver driver;
	
	public medicareSignupPage(WebDriver driver ) {
		this.driver= driver;
	}
	@FindBy (xpath="//li[@id='signup']")
	 WebElement signuppgebtn;
	
	@FindBy (xpath="//input[@id='firstName']")
	 WebElement firstName;
	
	
	@FindBy (xpath ="//input[@id='lastName']")
	 WebElement lastName;
	
	@FindBy (xpath ="//input[@id='email']")
	 WebElement email;
	
	@FindBy (xpath ="//input[@id='contactNumber']")
	 WebElement contactNumber;
	
	@FindBy (xpath ="//input[@id='password']")
	 WebElement password;
	
	@FindBy (xpath ="//button[@type='submit']")
		WebElement submit;
	
	@FindBy (xpath ="//input[@id='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='addressLineOne']") WebElement addrOne;
	@FindBy(xpath="//input[@id='addressLineTwo']") WebElement addrTwo;
	@FindBy(xpath="//input[@id='city']") WebElement city;
	@FindBy(xpath="//input[@id='postalCode']") WebElement posCode;
	@FindBy(xpath="//input[@id='state']") WebElement state;
	@FindBy(xpath="//input[@id='country']") WebElement country;
	@FindBy(xpath="//button[@name='_eventId_confirm']") WebElement nxtconfirm;
	
	@FindBy(xpath="//a[text()='Confirm']") WebElement confirmBtn;
	
	
	
	
	public void clicksignuppge() throws InterruptedException {
		signuppgebtn.click();
		Thread.sleep(4000);
		log.info("Click on signup page button");
	}
	
	public void enterfirstName() throws InterruptedException{
		firstName.click();
		firstName.sendKeys("HANVITH");
		Thread.sleep(4000);
		log.info("Enter firstName");
		
	}
//Enter the Password using Excel File		
	public void enterlastName() throws InterruptedException{
		
		lastName.click();
		lastName.sendKeys("M");
		log.info("Enter lastName");
		Thread.sleep(3000);
	}
	
public void enteremail() throws InterruptedException{
		
	email.click();
	email.sendKeys("hanvith12345@gmail.com");
		log.info("Enter email");
		Thread.sleep(3000);
	}

public void entercontactNumber() throws InterruptedException{
	
	contactNumber.click();
	contactNumber.sendKeys("777777777");
	log.info("Enter contactNumber");
	Thread.sleep(3000);
}

public void enterpassword() throws InterruptedException{
	
	password.click();
	password.sendKeys("123456");
	log.info("Enter password");
	Thread.sleep(3000);
}

public void enterconfirmPassword() throws InterruptedException{
	
	confirmPassword.click();
	confirmPassword.sendKeys("123456");
	log.info("Enter confirmPassword");
	Thread.sleep(3000);
}

//Click on Sign-in button	
	public void clicksubmit() throws InterruptedException {
		submit.click();
		Thread.sleep(4000);
		log.info("Click on submit button");
	}
	public void enteraddrOne() throws InterruptedException{
		
		addrOne.click();
		addrOne.sendKeys("shhdjvdj");
		log.info("Enter addrOne");
		Thread.sleep(3000);
	}
	
	public void enteraddrTwo() throws InterruptedException{
		
		addrTwo.click();
		addrTwo.sendKeys("smhfvksajf");
		log.info("Enter confirmPassword");
		Thread.sleep(3000);
	}
	
	public void entercity() throws InterruptedException{
		
		city.click();
		city.sendKeys("bangalore");
		log.info("Enter city");
		Thread.sleep(3000);
	}
	
	public void enterposCode() throws InterruptedException{
		
		posCode.click();
		posCode.sendKeys("573103");
		log.info("Enter posCode");
		Thread.sleep(3000);
	}
	
	public void enterstate() throws InterruptedException{
		
		state.click();
		state.sendKeys("karnataka");
		log.info("Enter state");
		Thread.sleep(3000);
	}
	
	public void entercountry() throws InterruptedException{
		
		country.click();
		country.sendKeys("INDIA");
		log.info("Enter country");
		Thread.sleep(3000);
	}
	
	public void clicknxtconfirm() throws InterruptedException {
		nxtconfirm.click();
		Thread.sleep(4000);
		log.info("Click on nxtconfirm");
	}
	public void clickconfirmBtn() throws InterruptedException {
		confirmBtn.click();
		Thread.sleep(4000);
		log.info("Click on confirmBtn");
	}



}
