package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TodayClassActions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement cources = driver.findElement(By.xpath("//div[text()='Courses ']"));
	Actions act = new Actions(driver);
	act.moveToElement(cources).perform();
	WebElement testing = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	act.moveToElement(testing).perform();
	
}
}
