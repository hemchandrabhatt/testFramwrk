package com.selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	WebDriver driver;
	public void openBrowser(String broserType, String url){
		System.setProperty("webdriver.gecko.driver",
				"E:\\jar libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		if(broserType=="FireFox"){
			driver =new FirefoxDriver();
			driver.get(url);
		}
		if(broserType=="Chrome"){
			driver =new ChromeDriver();
			driver.get(url);
		}
	}
	

}
