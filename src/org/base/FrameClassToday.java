package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameClassToday {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.name("login_page"));
	driver.switchTo().frame(login);
	WebElement custid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	custid.sendKeys("12345qwe",Keys.ENTER);
	
}
}
