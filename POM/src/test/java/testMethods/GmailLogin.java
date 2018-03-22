package testMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GmailLogin {
	WebDriver driver;
	
  @Test
  public void openGmailUrl() throws InterruptedException {
	  driver.get("https://accounts.google.com/");
	  driver.manage().window().maximize();
	 WebElement username= driver.findElement(By.id("identifierId"));
	 username.clear();
	 Thread.sleep(1000);
	 username.sendKeys("hem.bhatt1787b@gmail.com");
	 driver.findElement(By.className("CwaK9")).click();
	 
	 Thread.sleep(10000);
	 
	 WebElement password= driver.findElement(By.className("Xb9hP"));
	 username.clear();
	 Thread.sleep(1000);
	 username.sendKeys("nAINITAL@171987");
	 driver.findElement(By.className("CwaK9")).click();
	 
	 Actions act = new Actions(driver);
	
	 WebDriverWait wait = new WebDriverWait(driver,10);
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
	 
	 
	 
	 
  }
  @BeforeSuite
	public void beforeSuite() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\jar libraries\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void afterSuite() {

		// driver.quit();
	}

}
