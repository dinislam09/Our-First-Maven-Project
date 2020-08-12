package com.osa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selenium {
	WebDriver dr;
	
	@FindBy(xpath="/html/body/div[1]/div") WebElement javaQuestion;
	@FindBy(xpath="/html/body/div[2]/div[1]/center/h1") WebElement allTopic;
	@FindBy(xpath="/html/body/div[2]/div[1]/ul/li[1]/a") WebElement forum;
	@FindBy(xpath="//a[text()='Java']") WebElement java;
	@FindBy(xpath="//a[text()='Selenium']") WebElement selenium;
	@FindBy(xpath="/html/body/div[2]/div[1]/ul/li[4]/a") WebElement donotClik;
	@FindBy(xpath="//a[text()='JUnit']") WebElement jUnit;
	@FindBy(xpath="//a[text()=' TestNG']") WebElement testNG;
	@FindBy(xpath="//a[text()='Cucumber']") WebElement cucumber;
	@FindBy(xpath="//a[text()='API']") WebElement api;               //pagefactory concept
	@FindBy(xpath="//a[text()='Jenkin']") WebElement jenkin;
	@FindBy(xpath="//a[text()='Agile']") WebElement agile;
	@FindBy(xpath="//a[text()='Behavioral']") WebElement behavioral;
	@FindBy(xpath="//a[text()='Log4J']") WebElement log4J;
	@FindBy(xpath="//a[text()='Logout']") WebElement logout;
	
public selenium(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
}

public Junit clickOnJunit() {
	jUnit.click();
	return new Junit(dr);
}
}
