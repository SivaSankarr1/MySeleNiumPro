package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealJscrip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement username = driver.findElement(By.id("userName"));
	
	js.executeScript("arguments[0].setAttribute('value','sam123@gmail.com')", username);
	
	Thread.sleep(2000);
	
	WebElement search = driver.findElement(By.id("checkUser"));
	
	js.executeScript("arguments[0].click()", search);
	
	
}
}
