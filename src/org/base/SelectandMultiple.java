package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandMultiple {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Account')]"));
	createAccount.click();
	Thread.sleep(2000);
	WebElement firstName = driver.findElement(By.name("firstname"));
	firstName.sendKeys("Sam");
	WebElement lastName = driver.findElement(By.name("lastname"));
	lastName.sendKeys("Sankar");
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(19);
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByValue("3");
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("2021");
		
}
}
