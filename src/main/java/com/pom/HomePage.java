package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="//input[@id='email']") WebElement email;
	@FindBy(id="//input[@id='pass']") WebElement password;
	@FindBy(id="u_0_4")WebElement login;
	@FindBy(xpath="//input[@name='firstname']") WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']") WebElement Lastname;

	
	WebDriver dr;
	
	public HomePage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr,this );
		
		
	}
	
	public void url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		
	}
	public Registration registration() {
		email.sendKeys("ytwteiquu");
		login.click();
		
		return new Registration(dr);
	}
	

}
