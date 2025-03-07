package RameshSwarnkarAutomation.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import RameshSwarnkarAutomation.TestComponents.BaseTest;
import RameshSwarnkarAutomation.TestComponents.Retry;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups = {"Error handling"})
	public void loginErrorValidations() throws InterruptedException, IOException {

		landingPage.loginToApplication("ramesh.swarnkar123@gmail.com", "Password1");
		// System.out.println(landingPage.getLoginErrorMessage());
		Assert.assertEquals(landingPage.getLoginErrorMessage(), "Incorrect email or password.");
		System.out.println("I am first error validation method");
		takeScreenshot("loginErrorValidations", driver);
	}

	@Test
	public void secondErrorValidation() {
	//testing CICD integration
		System.out.println("I am second error validation method");
	}
}
