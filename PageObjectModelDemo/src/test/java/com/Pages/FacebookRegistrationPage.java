package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationPage {

	WebDriver driver;
	@FindBy(name="firstname")
	WebElement firstnameElement;
	@FindBy(name="lastname")
	WebElement lastnameelemet;
	@FindBy(name="reg_email__")
	WebElement mobilenumberelement;
	@FindBy(name="reg_passwd__")
	WebElement newpasswordelement;
	@FindBy(id="day")
	WebElement dayDropdownWebElement;
	Select dayDropdownSelect;
	@FindBy(id="month")
	WebElement monthdropdownWebElement;
	Select monthDropDownSelect;
	@FindBy(id="year")
	WebElement yeardropdownWebElement;
	Select yeardropdownSelect;
	@FindBy(xpath="//*[@id='u_0_11']/span[1]/label")
	WebElement genderFemaleElement;
	@FindBy(xpath="//*[@id='u_0_11']/span[2]/label")
	WebElement genderMaleElement;
	@FindBy(id="websubmit")
	WebElement signupelement;
	

	public FacebookRegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		dayDropdownSelect = new Select(dayDropdownWebElement);
		monthDropDownSelect=new Select(dayDropdownWebElement);
		yeardropdownSelect=new Select(yeardropdownWebElement);
	}
	
	public void Registration(String firstname,String lastname,String mobilenumber,String newpassword,int day,String month, int year,Boolean isMale ) {
		firstnameElement.sendKeys(firstname);
		lastnameelemet.sendKeys(lastname);
		mobilenumberelement.sendKeys(mobilenumber);
		newpasswordelement.sendKeys(newpassword);
		String dayText = Integer.toString(day);
		System.out.println(dayText);
		dayDropdownSelect.selectByValue(dayText);
		monthDropDownSelect.selectByValue(month);
		yeardropdownSelect.selectByValue(Integer.toString(year));
		if (isMale) {
			genderMaleElement.click();
		} else {
			genderFemaleElement.click();
		
		}
	}
}
