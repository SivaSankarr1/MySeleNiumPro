package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJscript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	WebElement username = driver.findElement(By.id("email"));
	je.executeScript("arguments[0].setAttribute('value','sam123@gmail.com')", username);
	WebElement password = driver.findElement(By.id("pass"));
	je.executeScript("arguments[0].setAttribute('value','abc@123')", password);
	WebElement login = driver.findElement(By.name("login"));
	je.executeScript("arguments[0].click()", login);
	
}
}
