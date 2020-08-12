package com.fb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Base;



public class DataProviderDemo extends Base {
	
	
	@DataProvider(name="Facebook")
	public Object[][] Read() throws IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\shihab\\Desktop\\Manual Teasting\\Book2.xlsx");
	XSSFWorkbook b=new XSSFWorkbook(f);
	XSSFSheet s=b.getSheet("Sheet1");
	int a=s.getLastRowNum();
	int a1=s.getRow(0).getLastCellNum();
	
	Object[][] data=new Object[a][a1];
	
	for(int i=1;i<=a;i++) {
		for(int j=0;j<a1;j++) {
			
			data[i-1][j]=s.getRow(i).getCell(j);
			
		}
	}
	return data;
	
	
	}
	
	@Test(dataProvider="Facebook")
	public void test(Object a,Object b,Object c,Object d) {
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys(a.toString());
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys(b.toString());
		dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(c.toString());
		dr.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(d.toString());
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();

		
		
	}

}
