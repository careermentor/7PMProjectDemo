package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
		
		
		driver= new ChromeDriver(); //launch your chrome browser
		
		String ExpectedURL = "https://www.facebook.com/";
		
		
		driver.get(ExpectedURL);  //pass the url
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		String ExpTitle= "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		
		System.out.println(ActTitle);
		
		Assert.assertEquals(ActTitle, ExpTitle);
		
	}
	
	@AfterMethod
	public void closebrowsr()
	{
		driver.close();
		
	}
	
	
	
	
	
	@Test(enabled=false)
	public void loginFunctionality()
	{
		
		
		String ExpUsernameField="Email address or phone number";
		String ActUsernameField = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUsernameField);
		
		Assert.assertEquals(ActUsernameField, ExpUsernameField);
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		
		String ExpPassField = "Password";
		String ActPassField = driver.findElement(By.name("pass")).getAttribute("placeholder");
		
		System.out.println(ActPassField);
		
		Assert.assertEquals(ActPassField, ExpPassField);
		
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		
		String ExpLoginButton = "Log in";
		String ActLoginButton = driver.findElement(By.name("login")).getText();
		
		System.out.println(ActLoginButton);
		
		Assert.assertEquals(ActLoginButton, ExpLoginButton);
		
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
		Point accountloc = driver.findElement(By.xpath("//a[text()='Create new account']")).getLocation();
			
		System.out.println(accountloc);
		
		//System.out.println(driver.getPageSource());
		
	}
	
	
	@Test(enabled=true)
	public void signupFunctionality() throws Exception
	{
		
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Thread.sleep(2000);  //waiting time
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		boolean status = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
		System.out.println(status);
		
		//driver.findElement(By.name("websubmit")).click();
		
		
	
	}
	
}
