package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	
	}

}
