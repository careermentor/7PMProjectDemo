package automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KyyboardMouseControl 
{

	WebDriver driver;
	
	
	

	
	@Test
	public void handleFrames() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
		driver= new ChromeDriver(); //launch your chrome browser
		driver.get("https://demoqa.com/frames");
		
		System.out.println( driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.screenshotResult(driver,"handleFrames");
	}
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
		driver= new ChromeDriver(); //launch your chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.screenshotResult(driver,"handleAlerts");
	}
	
	@Test(enabled=false)
	public void mousecontrol()
	{
		WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
		driver= new ChromeDriver(); //launch your chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).perform();
		
		//ctrl+click
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		driver.switchTo().window(win1);
		
		
		
		
	}
	
	@Test(enabled=false)
	public void kyeboardcontrol()
	{
		WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
		driver= new ChromeDriver(); //launch your chrome browser
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
//		act.sendKeys("modisantosh@gmail.com").perform();
		
	//	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1234").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
	}
	
}
