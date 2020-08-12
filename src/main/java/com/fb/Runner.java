package com.fb;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends Browse {
	Method m;
	
	@Test
	public void facebook() {
	Method m = new Method();
	m.getUrl(dr,"http://www.facebook.com/");
	m.SendKeys(dr, By.id("email"), "ragdadddiu");
	m.SendKeys(dr, By.id("pass"), "76317369");
	//m.Click(dr,By.id("u_0_b"));
	// For registration
	m.timewait(dr);
	m.SendKeys(dr,By.xpath("//input[@type='text'and@name='firstname']"), "md");
	m.SendKeys(dr,By.xpath("//input[@type='text'and@name='lastname']"), "islam");
	m.SendKeys(dr, By.id("u_0_r"), "345678992");
	m.SendKeys(dr, By.id("u_0_w"), "5684718");
	m.dropdown(dr,By.id("day"), 20);
	m.dropdown(dr,By.id("month"), 10);
	m.dropdown(dr,By.id("year"), "2019");
	
}
	
	
}
