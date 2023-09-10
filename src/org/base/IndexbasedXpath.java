package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexbasedXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	WebElement male = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
	male.click();
	WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	hobbies.click();
	WebElement hobbies1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	hobbies1.click();
}
}
