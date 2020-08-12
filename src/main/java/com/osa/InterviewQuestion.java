package com.osa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterviewQuestion {
	WebDriver dr;
	@FindBy(xpath="//a[text()='Interview Questions']") WebElement interviewqusetion; 
	@FindBy(xpath="//img[@class='logo']") WebElement osalogo;
	@FindBy(xpath="//a[text()='Logout']") WebElement commoninfo; 
	@FindBy(xpath="//img[@class='logo']") WebElement logout; 
	@FindBy(xpath="//a[text()='Class Materials']") WebElement classMaterials; 
	@FindBy(xpath="//a[text()='Group Discussion']") WebElement groupDiscussion;
	@FindBy(xpath="//a[text()='Email']") WebElement email;
	@FindBy(xpath="//a[text()='Practice Quize']") WebElement practiceQuize; 
	@FindBy(xpath="//a[text()='Certification Exam']") WebElement certificationExam; 
	@FindBy(xpath="//a[text()='Course Payment']") WebElement coursePayment;
	@FindBy(xpath="//a[text()='Event']") WebElement event; 
	@FindBy(xpath="//a[text()='Profile']") WebElement profile; 
	@FindBy(xpath="//a[text()='Help']") WebElement help;               //   pagefactory concept
	
	
	
	public InterviewQuestion(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public selenium clickOninterviewqusetion() throws InterruptedException {
		Thread.sleep(3000);
		interviewqusetion.click();
		return new selenium(dr);
	}

}
