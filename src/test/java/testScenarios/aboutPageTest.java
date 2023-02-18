package testScenarios;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import PageObject.medicareAboutPage;

public class aboutPageTest extends Driver {
	@Test
	public void aboutPageOperation() throws Exception
	{
		extentTest = extent.startTest("AboutPage");

		medicareAboutPage obj5=PageFactory.initElements(driver,medicareAboutPage.class);
		
		
        obj5.navigateAbout();
		
		

	}
}
