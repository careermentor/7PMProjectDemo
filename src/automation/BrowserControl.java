package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl 
{

	WebDriver driver;
	
	@Test
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
		
		
		driver= new ChromeDriver(); //launch your chrome browser
		
		
		//driver.get("https://www.facebook.com/");  //pass the url
		driver.navigate().to("https://thetestingworld.com/testings/");   //pass the url  //60 secs default wait time
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		
		//driver.findElement(By.id("email")).clear(); 
		
		//driver.get("https://www.google.com/");  //pass the url
	
		
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		
		//WebElement gender = driver.findElement(By.name("sex"));
		//Select gen = new Select(gender);
		
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("India");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Goa"));
		
		st.selectByVisibleText("Telangana");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Karimnagar"));
		
		ct.selectByVisibleText("Hyderabad");
		
		
		
		//gen.selectByIndex(2);
		//gen.selectByValue("1");
		
		
		
		
		
		driver.findElement(By.name("terms")).click();
		
		//driver.findElement(By.xpath("//a[text()='Read Detail']")).click();
		
		
		/*
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.close();  //close the single window (current window)
		driver.quit();
		*/
	}
}
