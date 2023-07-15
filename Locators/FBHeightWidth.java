package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBHeightWidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email_ele = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pw_ele = driver.findElement(By.xpath("//input[@type='password']"));
		
		
		Dimension email_d = email_ele.getSize();
		 
		System.out.println("Height: "+email_d.getHeight());
		System.out.println("Width: " + email_d.getWidth());
		
		Dimension pw_d = pw_ele.getSize();
		System.out.println("Height: "+ pw_d.getHeight());
		System.out.println("Width: " + pw_d.getWidth());
		
		if(email_d.getHeight() == pw_d.getHeight())
		{
			System.out.println("Height is same");
		}
		else
		{
			System.out.println("Height isn't same");
		}
		

	}

}
