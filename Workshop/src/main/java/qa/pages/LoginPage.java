package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.selenium.PreAndPost;

public class LoginPage extends PreAndPost {
	public LoginPage(EventFiringWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage DismissCookies() {
		WebElement X = locateElement("class", "banner-close-button");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(X));
		clickWithNoSnap(X);
		return this;
	}

	public LoginPage ClickLoginButton() {
		WebElement LoginButton = locateElement("xpath", "//li[@class='globalNav__actions__login']");
		clickWithNoSnap(LoginButton);
		return this;
	}
	public LoginPage EnterUserName() {
		WebElement UserIDfield = locateElement("id", "username");
		UserIDfield.sendKeys("PrabaTest");
		String UserID = UserIDfield.getAttribute("value");
		if(UserID.contains("PrabaTest")) {
			System.out.println("Correct UserID and it is"+UserID);
		}
		else {
			System.out.println("Incorrect UserID");
		}
		return this;
	}
	public LoginPage EnterPassword(String Password) {
		WebElement pwdfield = locateElement("id", "password");
		String pwd = pwdfield.getAttribute("value");
		System.out.println("User entered password as"+pwd );
		return this;
	}
	public LoginPage Login() {
		clickWithNoSnap(locateElement("xpath", "//button[text()='Log in']"));
		return this;
	}

	public LoginPage EnterNdaysasCheckout(int days)  {
		for(int i=0;i<=days;i++) {
			clickWithNoSnap(locateElement("xpath", "//div[contains(@class,'calendar-button-wrapper--checkout')]//button[contains(@class,'calendar-button-chevron--next')]"));
		}
		return this;
	}

	public LoginPage MemberDetails() {
		clickWithNoSnap(locateElement("xpath", "//span[text()='1 Room']"));
		return this;
	}
	public LoginPage NoofChildren(int nchild) {
		for(int i=0;i<=nchild;i++) {
			clickWithNoSnap(locateElement("xpath", "//button[@data-role='addChild']"));
		}
		return this;
	}
	public LoginPage SelectChild1age(String age) {
		WebElement chage = locateElement("xpath", "//select[@data-id='0']//option[text()='"+age+"']");
		clickWithNoSnap(chage);
		System.out.println(chage);
		return this;
	}
	public LoginPage Apply() {
		clickWithNoSnap(locateElement("xpath", "//button[text()='Apply']"));
		return this;
	}
	public LoginPage clickSearch() {
		clickWithNoSnap(locateElement("xpath", "//span[text()='Search']"));
		return this;
	}
	public LoginPage RouteVerify() {
		String title = driver.getTitle();
		if(title.contains("PriceRange") ) {
			System.out.println("Success");
		}
		else {
			System.out.println("Check it");
		}
		return this;

	}
}