package com.osa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumLoginPage {
	WebDriver dr;
	
	@FindBy(xpath="/html/body/div/h1") WebElement header;
	@FindBy(xpath="/html/body/center/div[1]") WebElement screenpictur;
	@FindBy(xpath="/html/body/center/div[1]/div/b") WebElement forumloginlogo;
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="position") WebElement student;
	@FindBy(id="login_button") WebElement login;
	
public ForumLoginPage(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
	
}
public void uriVarify() {
	String exceptUrl="http://www.osaconsultingtech.com/Forum/logins/forum_login.html";
	String actualUrl=dr.getCurrentUrl();
	System.out.println(actualUrl);
	if(exceptUrl.equals(actualUrl)) {
		
		System.out.println("Pass");
		}
	else {
		System.out.println("Fail");
	}
}

public InterviewQuestion InterviewQuestion() {
	username.sendKeys("md.islam@osaconsultingtech.com");
	password.sendKeys("5077Md1985");
	login.click();
	return new InterviewQuestion(dr);
	
}
}
	








