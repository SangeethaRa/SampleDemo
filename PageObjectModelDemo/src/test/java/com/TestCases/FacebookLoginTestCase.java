package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.FacebookLoginPage;
import com.SeleniumUtility.SeleniumUtil;


public class FacebookLoginTestCase extends Library {
	FacebookLoginPage lpage;
	SeleniumUtil util;
	@BeforeClass
	public void stratUp() throws IOException {
		launchApplication();
		
	}
	@Test
	public void login() {
		lpage=new FacebookLoginPage(driver);
		lpage.login("sravanthi","abc1");
		
		
	}
	@AfterClass
	public void close() throws IOException {
		util = new SeleniumUtil(driver);
		util.screenshot("src/test/resources/Screenshots/facebook.png");
		quit();
		
	}

}
