package com.pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Runner {
	WebDriver dr;
	
	
	@Test
	public void test() {
		HomePage h=new HomePage(dr);
			h.url();
			h.registration();
	}

}
