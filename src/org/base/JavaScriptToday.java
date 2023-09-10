package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptToday {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement userID = driver.findElement(By.id("username"));
	js.executeScript("arguments[0].setAttribute('value','jack67@gmail.com')", userID);
	WebElement pass = driver.findElement(By.id("password"));
	js.executeScript("arguments[0].setAttribute('value','abc@123')", pass);
	WebElement loginButton = driver.findElement(By.id("login"));
	js.executeScript("arguments[0].click()", loginButton);
		
}
}
