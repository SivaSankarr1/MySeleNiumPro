package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--Remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebElement alertButton = driver.findElement(By.id("alert"));
		alertButton.click();		
		WebDriverWait w=new WebDriverWait(driver, null);
		w.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		System.out.println("Clicked alert");
	}

}
