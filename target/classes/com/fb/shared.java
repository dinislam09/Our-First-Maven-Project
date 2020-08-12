package com.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class shared {

	public void getUrl(WebDriver dr,String Url) {
		dr.get(Url);
	}	
	public void SendKeys(WebDriver dr,By by,String value) {
		dr.findElement(by).sendKeys(value);
	}		
	public void Click(WebDriver dr,By by) {
		dr.findElement(by).click();
	}	
	public void timewait(WebDriver dr) {
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}	
	public void dropdown(WebDriver dr,By by,int index) {
		Select s = new Select(dr.findElement(by));
			   s.selectByIndex(index);
	}	
	public void dropdown(WebDriver dr,By by,String text) {
		Select s = new Select(dr.findElement(by));
			   s.selectByVisibleText(text);	
		
		
	}
	
}
