package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Sofwares\\Studies\\eclipse-workspace-acer\\MyProjectInSelenium\\Driver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("iphone");
	WebElement searchbutton= driver.findElement(By.id("nav-search-submit-button"));
	searchbutton.click();
	Thread.sleep(5000);
	WebElement iphone14 = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
	iphone14.click();
		
}
}
