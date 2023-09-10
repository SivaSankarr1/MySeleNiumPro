package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("sam@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345adsfgh");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		}
}
