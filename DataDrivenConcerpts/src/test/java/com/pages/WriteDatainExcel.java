package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.util.Xls_Reader;

public class WriteDatainExcel {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
	     Xls_Reader data = new Xls_Reader(".\\src\\main\\java\\com\\test\\util\\TestData.xlsx");
	     int rowcount = data.getRowCount("SignUp");
	     data.removeColumn("SignUp", 4);
	     data.addColumn("SignUp","Status");
	     for(int i=2;i<=rowcount;i++) {
	    	   data.setCellData("SignUp", "Status", i, "Pass");
	     }
	    	 
	     

	       	 
	     
	     
	     
	     
	     
	}
}
