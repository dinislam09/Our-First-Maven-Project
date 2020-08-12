package com.fb;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Utilities {
	
	
	public static Logger add(Class c) {
		Logger log=Logger.getLogger(c);
		PropertyConfigurator.configure("C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\Our_First_Maven_Project\\src\\main\\resources\\log4.properties");
		return log;
	} 

}
