package testScenarios;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.medicareSignupPage;

public class signupPageTest extends Driver {
	@Test
	public void SignUpPageOperation() throws Exception
	{
		extentTest = extent.startTest("SignUpPage");

		medicareSignupPage obj4=PageFactory.initElements(driver,medicareSignupPage.class);
		
		
       

		obj4.clicksignuppge();
		obj4.enterfirstName();
		obj4.enterlastName();
		obj4.enteremail();
		obj4.entercontactNumber();
		obj4.enterpassword();
		obj4.enterconfirmPassword();
		obj4.clicksubmit();
		obj4.enteraddrOne();
		obj4.enteraddrTwo();
		obj4.entercity();
		obj4.enterposCode();
		obj4.enterstate();
		obj4.entercountry();
		obj4.clicknxtconfirm();
		obj4.clickconfirmBtn();
	
		

	}
}
