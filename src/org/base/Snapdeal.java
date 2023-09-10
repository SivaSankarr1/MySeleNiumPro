package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("sam123@gmail.com");
		WebElement search = driver.findElement(By.id("checkUser"));
		search.click();
		
		}
}
