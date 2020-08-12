package com.fb;




import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class RunnerLog4j {
	
	Logger log=Utilities.add(RunnerLog4j.class);
	WebDriver dr;
	
	@Test
	public void sub() {
	
		log.info("Setproperty");
		String key="webdriver.chrome.driver";
		String value=("C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Driver\\chromedriver.exe");
				
		System.setProperty(key, value);
		log.info("ChromeObject");
		dr = new ChromeDriver();
		log.info("Manage window");
		dr.manage().window().maximize();
		log.info("Openurl");
		dr.get("https://www.facebook.com/");
		} 
		 
	

}
