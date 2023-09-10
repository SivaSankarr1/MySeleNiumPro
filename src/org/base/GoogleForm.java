package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleForm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://paydaydeals.com.au/account/login");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("CustomerEmail"));
	email.sendKeys("ramacharar@gmail.com");
	WebElement password = driver.findElement(By.id("CustomerPassword"));
	password.sendKeys("pass@123");
	WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
	
}
}
