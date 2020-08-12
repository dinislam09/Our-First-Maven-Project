package com.facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Browser {
	public WebDriver dr;
	@Test
	public void openBrowse() throws IOException {
		FileInputStream fl = new FileInputStream("C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Our_First_Maven_Project\\src\\main\\resources\\comfig.properties");
		Properties p = new Properties();
	    p.load(fl);
	    String b = p.getProperty("browser");
	    System.out.println(b);
	
	
	if (b.equals("Chrome")) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe";
		System.setProperty(key, value);
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}
	
	else if (b.equals("firefox")){
		System.setProperty("", "");
	}
	
	
	
	String url=p.getProperty("url");
	dr.get(url);
	
	
	
	
	}	
}

