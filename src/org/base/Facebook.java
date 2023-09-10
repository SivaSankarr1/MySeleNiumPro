package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("//a[contains(text(),'Create ')]"));
		create.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Sam");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Sankar");
		
	}
}
