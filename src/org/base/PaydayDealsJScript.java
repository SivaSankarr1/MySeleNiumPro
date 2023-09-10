package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaydayDealsJScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paydaydeals.com.au/account/login");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement email = driver.findElement(By.id("CustomerEmail"));
		js.executeScript("arguments[0].setAttribute(''value','ram.1234@gmail.com')", email);
		
		WebElement password = driver.findElement(By.id("CustomerPassword"));
		js.executeScript("arguments[0].setAttribute(''value','pass@123')", password);
		
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", signin);
		
}
}