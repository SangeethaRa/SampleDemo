package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.FacebookRegistrationPage;
import com.SeleniumUtility.SeleniumUtil;

public class FacebookRegTestCase extends Library {

	FacebookRegistrationPage RPage;
	SeleniumUtil util;
	
	@BeforeClass
	//Launchapplicaiton
	public void stratUp() throws IOException {
		launchApplication();
	}
	
	@Test
	public void registration() {
		RPage=new FacebookRegistrationPage(driver);
		RPage.Registration("aaa", "bbb",  "09808900", "xya", 4, "6", 1997, false);
				
	}
	
   @AfterClass
      public void close() {
	   this.quit();
   }
}
