package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinSelect {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("SivasankarR");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Success@2022");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	Thread.sleep(2000);
	WebElement location = driver.findElement(By.id("location"));
	Select s = new Select(location);
	s.selectByIndex(1);
	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotels);
	s1.selectByValue("Hotel Sunshine");
	WebElement roomType = driver.findElement(By.id("room_type"));
	Select s2 = new Select(roomType);
	s2.selectByVisibleText("Standard");
	WebElement noOfRooms = driver.findElement(By.id("room_nos"));
	Select s3 = new Select(noOfRooms);
	s3.selectByVisibleText("4 - Four");
	WebElement checkInDate = driver.findElement(By.id("datepick_in"));
	checkInDate.clear();
	checkInDate.sendKeys("05/12/2022");
	WebElement checkOutDate = driver.findElement(By.id("datepick_out"));	
	checkOutDate.clear();
	checkOutDate.sendKeys("11/12/2022");
	WebElement noOfAdult = driver.findElement(By.id("adult_room"));
	Select s4 = new Select(noOfAdult);
	s4.selectByValue("2");
	WebElement noOfChild = driver.findElement(By.id("child_room"));
	Select s5 = new Select(noOfChild);
	s5.selectByVisibleText("2 - Two");
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	Thread.sleep(2000);
	WebElement radioclick = driver.findElement(By.id("radiobutton_0"));
	radioclick.click();
	WebElement continuebutton = driver.findElement(By.id("continue"));
	continuebutton.click();
	Thread.sleep(2000);
	WebElement fname = driver.findElement(By.id("first_name"));
	fname.sendKeys("Siva");
	WebElement lname = driver.findElement(By.id("last_name"));
	lname.sendKeys("Ram");
	WebElement billingaddress = driver.findElement(By.id("address"));
	billingaddress.sendKeys("No.10,ABC street,chennai,pin-600068");
	Thread.sleep(2000);
	WebElement creditcardNo = driver.findElement(By.id("cc_num"));
	creditcardNo.sendKeys("1234567890098765");
	WebElement ccardtype = driver.findElement(By.id("cc_type"));
	Select s6 = new Select(ccardtype);
	s6.selectByVisibleText("VISA");
	WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
	Select s7 = new Select(expmonth);
	s7.selectByVisibleText("April");
	WebElement expyear = driver.findElement(By.id("cc_exp_year"));
	Select s8 = new Select(expyear);
	s8.selectByValue("2014");
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("300");
	WebElement booknow = driver.findElement(By.id("book_now"));
	booknow.click();
	Thread.sleep(3000);
	
	WebElement orderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
	String text = orderNo.getText();
	System.out.println(text);
	
}
}