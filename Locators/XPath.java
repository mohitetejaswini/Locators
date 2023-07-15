package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\TEJU\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("E:\\Testing\\Selenium\\HTML Files\\cssSelector.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Admin");
	}

}
