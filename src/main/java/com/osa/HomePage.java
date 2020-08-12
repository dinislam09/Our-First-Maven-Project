package com.osa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@class='navbar-brand']") WebElement osalogo;
	@FindBy(xpath="//span[text()='Email']") WebElement osaemail;
	@FindBy(xpath="//span[@class='ion-ios-paper-plane']")WebElement emailLogo;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/span[2]") WebElement osainfo;
	@FindBy(xpath="//span[text()='Call']") WebElement osaphone;
	@FindBy(xpath="+347 837 7586") WebElement number;
	@FindBy(xpath="//span[@class='ion-ios-call']")WebElement callLogo;
	@FindBy(xpath="//span[text()='Working Hours']") WebElement workinghour;
	@FindBy(xpath="//span[text()='Every Day (9am - 9pm)']")WebElement everyday;
	@FindBy(xpath="//span[@class='ion-ios-time']") WebElement workinghourLogo;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[2]/div/div[3]/div[2]/span[2]") WebElement osaeveryday;
	@FindBy(xpath="//button[@class='navbar-toggler']") WebElement osamanu;
	@FindBy(xpath="//input[@class='text']") WebElement searchbox;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[1]/a") WebElement osahome;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[1]/a") WebElement osaabout;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[3]/a") WebElement osatraining;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[4]/a") WebElement osaservice;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[5]/a") WebElement osablog;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[6]/a") WebElement osacontact;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[7]/a") WebElement osaforumlogin;
	@FindBy(xpath="/html/body/section[2]/div/div/div[1]/div/h2") WebElement osafreeconsulting;
	@FindBy(id="fName") WebElement osafirstname;
	@FindBy(id="lName") WebElement osalastname;               //pagefactory concept
	@FindBy(id="topic") WebElement osaprofessionaltraining;
	@FindBy(id="phone") WebElement phone;
	@FindBy(id="email") WebElement email;
	@FindBy(id="message") WebElement message;
	@FindBy(id="/html/body/section[2]/div/div/div[1]/div/form/div[7]/button") WebElement requestquote;
	
	
	
	WebDriver dr;
	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void urlVarify() {
		dr.get("http://www.osaconsultingtech.com/");
		String expectUrl="http://www.osaconsultingtech.com/";
		String actualUrl=dr.getCurrentUrl();
		
		if(expectUrl.equals(actualUrl)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public ForumLoginPage clickOnForumLogin() {
		
		osaforumlogin.click();
		return new ForumLoginPage(dr); 
	}
	

}
