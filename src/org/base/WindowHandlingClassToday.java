package org.base;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingClassToday {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.sendKeys("iphone 14",Keys.ENTER);
	WebElement iPhone14512Red1lakh = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 512GB (Product) RED']"));
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("arguments[0].scrollIntoView(true)",iPhone14512Red1lakh);
	iPhone14512Red1lakh.click();	
	String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
	//To Find All windows
		Set<String> windowHandles = driver.getWindowHandles();
		for(String x:windowHandles) {
			if(!parentWindow.equals(x)) {
				System.out.println(x);
	//To Switch to window
				driver.switchTo().window(x);
				WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
				addtocart.click();
		}}
		        Thread.sleep(2000);	
				driver.switchTo().window(parentWindow);
				Thread.sleep(3000);
				WebElement iPhone14MidnightBlack = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro 256GB Space Black']"));
				iPhone14MidnightBlack.click();
	//To get All windows again
				Set<String> windowHandles2 = driver.getWindowHandles();
				List<String> li = new LinkedList<String>();
	//To add all Values from set to list
				li.addAll(windowHandles2);
	//To get second childWindow
				String secondWindowID = li.get(2);
				System.out.println(secondWindowID);
				driver.switchTo().window(secondWindowID);
				WebElement addtocart2 = driver.findElement(By.id("add-to-cart-button"));
				addtocart2.click();
				Thread.sleep(2000);
				driver.switchTo().window(parentWindow);
				WebElement starLight = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 512GB Starlight']"));
				starLight.click();
				Set<String> windowHandles3 = driver.getWindowHandles();
				List<String> li2 = new LinkedList<String>();
				li2.addAll(windowHandles3);
				String thirdWindow = li2.get(3);
				System.out.println(thirdWindow);
				Thread.sleep(3000);
				driver.switchTo().window(thirdWindow);
				WebElement addtocart3 = driver.findElement(By.id("add-to-cart-button"));
				addtocart3.click();
								
		}}

