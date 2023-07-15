package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBTextBoxAlign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement email_ele = driver.findElement(By.className("_6lux"));
//		WebElement pw_ele = driver.findElement(By.cssSelector("div[class^ = '_55r1 _1kbt']"));
		
		WebElement email_ele = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pw_ele = driver.findElement(By.xpath("//input[@type='password']"));
		
		Point email_p = email_ele.getLocation();
		Point pw_p = pw_ele.getLocation();
		
		System.out.println("(X,Y): " + "(" + email_p.getX() + "," +  email_p.getY() + ")");
	
		System.out.println("(X,Y): " + "(" + pw_p.getX() + "," + pw_p.getY()  + ")");
		
		
		if(email_p.getX()==pw_p.getX())
		{
			System.out.println("Aligned");
		}
		else
		{
			System.out.println("Not Aligned");
		}
		
		driver.close();
		}

}
