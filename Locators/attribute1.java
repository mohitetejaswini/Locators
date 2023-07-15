package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/WebElementAssisgn.html");
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.id("first"));
		String O=ele.getAttribute("value");
		System.out.println(O);

	}

}
