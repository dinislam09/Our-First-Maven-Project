package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallalTest {
	WebDriver dr;
	
	@Test
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
	}
	
	@Test
	public void firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
	}

}
