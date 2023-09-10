package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTryKVBsite {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.kvb.co.in/ilogin/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.name("menu-login-detail"));
	driver.switchTo().frame("menu-login-detail");
	login.click();
	
}
}
