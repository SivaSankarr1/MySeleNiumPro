package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement viewmore = driver.findElement(By.xpath("//button[text()='View more']"));
	js.executeScript("arguments[0].scrollIntoView(true)", viewmore);
	
	Thread.sleep(2000);
	WebElement cert = driver.findElement(By.xpath("//h1[contains(text(),'Certification')]"));
	js.executeScript("arguments[0].scrollIntoView(false)", cert);
	
}
}
