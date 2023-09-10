package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CS {
	public static WebDriver driver;
public void browserLaunch() throws InterruptedException {	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login");
	WebElement signup = driver.findElement(By.cssSelector("a._97w5"));
	signup.click();
	Thread.sleep(3000);
	//TagName and more than one attribute
	WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname][id=u_0_b_GG]"));
	firstName.sendKeys("Raja");
	//more than one attribute used in xpath
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname' and @id='u_0_d_jd']"));
	lastname.sendKeys("Ram");	
	
}
}
