package com.bitwise.demo.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationRunner {

	public static void main(String[] args) {

		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
	}

}
