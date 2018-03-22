package testMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CommonPrograms {
	WebDriver driver;

	@Test
	public void f() {

		System.out.println("This is first test case");
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.id("lst-ib"));
		element1.sendKeys("selenium");
		element1.submit();
	}

	@Test
	public void testCase2() {

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
