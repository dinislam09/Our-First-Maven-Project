package com.osa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junit {
	WebDriver dr;
	@FindBy(xpath="//a[text()=' TestNG']") WebElement testNG;    //pagefactory concept
	
	public Junit(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
public cucamber clickOnTestNG() {
	testNG.click();
	return new cucamber(dr);
}
	
	
}
