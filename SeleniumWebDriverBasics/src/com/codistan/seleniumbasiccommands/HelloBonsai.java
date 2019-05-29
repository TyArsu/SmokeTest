package com.codistan.seleniumbasiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloBonsai {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver2.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hellobonsai.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='nav-bar-button-login']")).click();
		driver.findElement(By.xpath("//input[@id='login-user-email']")).sendKeys("service_dev@codistan.com");
		driver.findElement(By.xpath("//input[@id='login-user-password']")).sendKeys("IBecameACoder");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='commit']")).click();
		
		
		

	}

}
