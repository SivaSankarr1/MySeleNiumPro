package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TodayMultiSelect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://output.jsbin.com/osebed/2");
	driver.manage().window().maximize();
	WebElement multiselect = driver.findElement(By.id("fruits"));
	Select s = new Select(multiselect);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	s.selectByValue("apple");
	s.selectByVisibleText("Grape");
	List<WebElement> options = s.getOptions();
	for(int i=0;i<options.size(); i++) {
	WebElement web = options.get(i);
	String text = web.getText();
	System.out.println(text);
	//we can use single line instead of above 3 line System.out.println(options.get(i).getText());
	
	}
	
}
}
