package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSizeDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/guru99home/");
	List<WebElement> findElements = driver.findElements(By.tagName("iiframe"));
	int size = findElements.size();
	System.out.println(size);
	WebElement jMeter = driver.findElement(By.name("a077aa5e"));
//To Switch to frame
	driver.switchTo().frame(jMeter);
	WebElement jMeterElement = driver.findElement(By.name("//img[@src='Jmeter720.png']"));
	jMeterElement.click();
	}
}
