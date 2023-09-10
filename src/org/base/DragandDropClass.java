package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement bank = driver.findElement(By.id("credit2"));
	
	WebElement cart = driver.findElement(By.id("bank"));
	Actions act = new Actions(driver);
	
	act.dragAndDrop(bank, cart).perform();
	
}
	
}
