package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TEJU\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("E:\\Testing\\Selenium\\HTML Files\\cssSelector.html");
		
		driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type= 'password']")).sendKeys("Admin@123");

		
	}

}
