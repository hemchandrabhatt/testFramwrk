package com.selenium.POM;

import org.testng.annotations.Test;

public class AppTest{
	@Test
	public void test() throws InterruptedException{
		BaseClass baseObj=new BaseClass();
		baseObj.openBrowser("FireFox", "http://hemchandrabhatt.com/");
		Thread.sleep(10000);
		baseObj.openBrowser("Chrome", "http://seleniumwebdriver.org/");
	}
}