package org.base;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreenshotClass {
 //Multiple screenshot /step by step
static WebDriver driver;

private static void screenshot(String name)throws IOException
{
	TakesScreenshot ts= (TakesScreenshot)driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File targetFile = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\Screenshots By selenium\\" +name+".jpeg");
	FileUtils.copyFile(sourceFile, targetFile);
}
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	screenshot("Home");
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("jack67@gmail.com");
	screenshot("userName");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("abcd@123");
	screenshot("password");
	WebElement loginButton = driver.findElement(By.name("login"));
	loginButton.click();
	Thread.sleep(3000);
	screenshot("loginButton");
}
}
