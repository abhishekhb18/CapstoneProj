package testScenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import Excel.ExcelRead;
import PageObject.medicareLoginPage;
public class loginPageTest extends Driver{
	@Test
	public void loginPageOperation() throws Exception
	{
		extentTest = extent.startTest("LoginPage");

		medicareLoginPage obj3=PageFactory.initElements(driver,medicareLoginPage.class);
		
		ExcelRead er = new ExcelRead();
        String username = er.getUsername();
        String password = er.getPassword();
        obj3.clickloginpge();
		obj3.enterUserName(username);
		obj3.enterPassword(password);
		obj3.clickSignIn();
		

	}
}
