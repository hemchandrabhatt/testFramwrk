package com.selenium.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public void test(){
		System.setProperty("webdriver.gecko.driver",
				"E:\\jar libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		// Put an Implicit wait,
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
