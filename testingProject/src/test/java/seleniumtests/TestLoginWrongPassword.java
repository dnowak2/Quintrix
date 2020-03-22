package seleniumtests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestLoginWrongPassword {

	private WebDriver driver;
	@Test
	public void navigateHome() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		String url = "https://www.etsy.com/";
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String currentUrl = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl, url);
	}
	@Test
	public void signIn() {
		WebElement signIn = driver.findElement(By.xpath("//button[contains(.,'Sign in')]"));
		signIn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement emailTextField = driver.findElement(By.id("join_neu_email_field"));
		WebElement passwordTextField = driver.findElement(By.id("join_neu_password_field"));
		WebElement signInButton = driver.findElement(By.name("submit_attempt"));
		
		emailTextField.sendKeys("dn8overflow444@gmail.com");
		passwordTextField.sendKeys("wrongpassword");
		signInButton.click();
		
		WebElement passwordError = driver.findElement(By.id("aria-join_neu_password_field-error"));
		Assert.assertTrue(passwordError.isEnabled());
	}

}