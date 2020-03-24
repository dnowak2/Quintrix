package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage extends PageObject
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void navigateHome() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		String url = "https://www.etsy.com/";
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String currentUrl = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl, url);
	}

	public void signIn()
	{
		WebElement signIn = driver.findElement(By.xpath("//button[contains(.,'Sign in')]"));
		signIn.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement emailTextField = driver.findElement(By.id("join_neu_email_field"));
		WebElement passwordTextField = driver.findElement(By.id("join_neu_password_field"));
		WebElement signInButton = driver.findElement(By.name("submit_attempt"));
		
		emailTextField.sendKeys("dn8overflow444@gmail.com");
		passwordTextField.sendKeys("R1uby2019");
		signInButton.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public String userPage()
	{
		driver.navigate().to("https://www.etsy.com/people/u2efeeyh?ref=hdr");
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/div[1]/h1"));
		return userName.getAttribute("innerText");
	}
	
}
