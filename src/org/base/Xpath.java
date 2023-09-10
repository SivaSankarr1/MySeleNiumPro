package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("Jack@123.com");
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("ABC123");
	WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	login.click();
}
}
