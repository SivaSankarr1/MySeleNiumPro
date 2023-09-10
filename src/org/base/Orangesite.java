package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangesite {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--Remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.close();
		
	}

}
