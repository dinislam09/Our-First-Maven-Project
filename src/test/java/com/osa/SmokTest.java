package com.osa;

import org.testng.annotations.Test;

public class SmokTest extends Base {
	
	@Test
	public void test() throws InterruptedException {
			
			HomePage h=new HomePage(dr);
			h.urlVarify();
	
			ForumLoginPage f=h.clickOnForumLogin();
			f.uriVarify();
			
			InterviewQuestion s=f.InterviewQuestion();
			
			selenium c=s.clickOninterviewqusetion();
			Junit j=c.clickOnJunit();
			cucamber cu=j.clickOnTestNG();
			
			
			
			
			
			
	}
	

}
