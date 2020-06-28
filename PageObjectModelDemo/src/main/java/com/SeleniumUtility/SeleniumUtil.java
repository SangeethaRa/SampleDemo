package com.SeleniumUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtil {
	
	WebDriver driver;
	public SeleniumUtil(WebDriver driver) {
		this.driver=driver;
		
	}

	public void screenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
	public void getTitle() {
		
		System.out.println(driver.getTitle());
		
	}
public void dropdown(String locator2,String value) {
		
		Select dropdown=new Select(driver.findElement(By.xpath(locator2)));
				dropdown.selectByVisibleText(value);

}

}
