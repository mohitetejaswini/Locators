package com.pack1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Aligned1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

}

}
