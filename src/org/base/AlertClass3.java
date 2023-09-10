package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
	
		WebElement simpleInspection = driver.findElement(By.name("alertbox"));
		simpleInspection.click();
		Thread.sleep(1000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		Thread.sleep(1000);
		
		WebElement confirmInspection = driver.findElement(By.name("confirmalertbox"));
		confirmInspection.click();
		Thread.sleep(1000);
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement promptAlertInspection = driver.findElement(By.name("promptalertbox1234"));
		promptAlertInspection.click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("yes");
		Thread.sleep(2000);
		promptAlert.accept();
		}		
}
