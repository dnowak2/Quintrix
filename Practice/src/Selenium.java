import org.openqa.selenium.WebDriver;

public class Selenium 
{
	public void user_opens_google_search() 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\davidnowak\\Downloads\\chromedriver.exe");
		WebDriver browser = new SafariDriver();
		browser.navigate().to("https://www.google.com");
		// WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
		browser.close();
	}

}
