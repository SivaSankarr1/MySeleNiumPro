package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TnVelaivaaipu {
	public static void main(String[] args) throws InterruptedException {
		//login using Javascript
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tnvelaivaaippu.gov.in/Empower/");
		driver.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		WebElement userid = driver.findElement(By.id("userid"));
		
		je.executeScript("arguments[0].setAttribute('value','a842653')", userid);
		
		WebElement pwd = driver.findElement(By.id("password"));
		je.executeScript("arguments[0].setAttribute('value','abc123')", pwd);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//img[@name='canLogin']"));
		je.executeScript("arguments[0].click()", login);
		
		//WebElement text = driver.findElement(By.xpath("//b[text()='Login Details']"));
		//String pagename = text.getText();
		//System.out.println(pagename);
	}
}
