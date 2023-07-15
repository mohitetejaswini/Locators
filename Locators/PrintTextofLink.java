package com.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextofLink {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/checkboxDemo.html");
		List<WebElement> lstText = driver.findElements(By.xpath("//a"));
		
		int count = lstText.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			Thread.sleep(1000);
			lstText.get(i).getText();
			
		}
		

	}

}
