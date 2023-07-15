package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/WebElementAssisgn.html");
		
		/*
		WebElement ele = driver.findElement(By.tagName("input"));
		String attributeValue = ele.getAttribute("value");
		
		System.out.println(attributeValue);      //print attribute name
		Thread.sleep(2000);
		
		ele.clear();							 //Change the Value present in textBox
		
		//-------Change the Value present in textBox without clear()-----------------------
		ele.sendKeys(Keys.CONTROL + "A");
		Thread.sleep(1000);
		
		ele.sendKeys(Keys.DELETE);				
		
		ele.sendKeys("admin");
		//----------------end------------------
		
		//---------start BACKSPACE-------------
		int attributeLen = attributeValue.length();  
		
		for(int i=0; i<= attributeLen; i++)
		{
			ele.sendKeys(Keys.BACK_SPACE);		
		}
		
		Thread.sleep(2000);							
		ele.sendKeys("admin");	
		
		//----------end------------------------
		
		 
		*/
		
		WebElement f_ele = driver.findElement(By.id("first"));
		WebElement l_ele = driver.findElement(By.id("last"));
		
		//String attributeValue = ele.getAttribute("value");
		
		Point fp = f_ele.getLocation();
		Point lp = l_ele.getLocation();
		
		System.out.println(fp.getY());
		System.out.println(lp.getY());
	}

}
