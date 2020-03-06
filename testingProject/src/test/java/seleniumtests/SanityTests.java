package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTests 
{
	@Test
	public void CanLaunchWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.etsy.com/";
		
		driver.navigate().to(url);
		
		String currentUrl = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl, url);
	}
}
