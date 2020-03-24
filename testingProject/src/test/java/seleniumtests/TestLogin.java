package seleniumtests;

import pagefactory.LoginPage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestLogin {

	private WebDriver driver;
	@Test
	public void signIn() {
		LoginPage page = new LoginPage(driver);
		page.navigateHome();
		page.signIn();
		Assert.assertEquals(page.userPage(), "David");
	}

}
