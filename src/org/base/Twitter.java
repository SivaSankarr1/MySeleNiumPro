package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();	
	WebElement username = driver.findElement(By.xpath(("(//input[contains(@data-testid,'royal_')])[1]")));
	username.sendKeys("sam123@gmail");
	String text1= username.getAttribute("value");
	System.out.println(text1);
	
	WebElement password = driver.findElement(By.xpath("(//input[contains(@data-testid,'royal_')])[2]"));
	password.sendKeys("ABC@123");
	
	String text2 = password.getText();
	System.out.println(text2);
	}
	
}