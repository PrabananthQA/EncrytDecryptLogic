package qa.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qa.pages.LoginPage;
import qa.selenium.PreAndPost;

public class TrivagoTest extends PreAndPost {
	@BeforeTest
	public void beforeTest() {
		testCaseName = "S20-84";
		testDescription = "Automation For New Payment";
		nodes = "Test";
		authors = "Prabananth";
		category = "Testing";		
	}
	@Test
	public void Test01Trivago() {
		new LoginPage(driver)
		.DismissCookies()
		.ClickLoginButton()
		.EnterUserName()
		.EnterPassword("Qwerty#33")
		.Login();
	}
}
