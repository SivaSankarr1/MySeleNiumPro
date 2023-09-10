package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CSSselectorLocator extends Base{
@Test
public void cssTest() throws InterruptedException {
	browserLaunch();
	urlLaunch("https://www.amazon.in/");
// To access slides in the webPage	
WebElement firstSlide = driver.findElement(By.cssSelector("ol.a-carousel>li:last-of-type"));
elementClick(firstSlide);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	
//	//TagName&ID
//		WebElement uid = driver.findElement(By.cssSelector("input#email"));
//	sendText(uid, "samsankar@gmail.com");
//	//TagName&AttributeName and value
//	WebElement pass = driver.findElement(By.cssSelector("input[type=password]"));
//	sendText(pass, "987654321");
//	//TagName,class and attributeName,attributeValue
//	WebElement submit = driver.findElement(By.cssSelector("button._42ft[name=login]"));
//	elementClick(submit);
//TagName and ClassName
	WebElement signup = driver.findElement(By.cssSelector("a._97w5"));
	elementClick(signup);
	Thread.sleep(3000);
//TagName and more than one attribute
WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname][data-type=text]"));
	sendText(firstName, "Raja");
//	//more than one attribute used in xpath
WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname' and @data-type='text']"));
	sendText(lastname, "Ram");
// Contains using attribute
	WebElement emailormobile = driver.findElement(By.cssSelector("input[aria-label*='Mobile']"));
	sendText(emailormobile, "abcd@gmail.com");
//Excluding any of the function
WebElement re_enterEmail = driver.findElement(By.cssSelector("input[aria-label='Re-enter email address']:not([aria-label='Mobile']"));
		sendText(re_enterEmail, "abcd@gmail.com");
//startwith attributevalue
	WebElement newpassword = driver.findElement(By.cssSelector("input[aria-label^='New']"));
	sendText(newpassword, "abc@123");
//endingWith attribute
	WebElement dobDate = driver.findElement(By.cssSelector("select[aria-label$='ay']"));
	selectBasedOn(dobDate, "20");
//endingwith attribute
	WebElement dobMonth = driver.findElement(By.cssSelector("select[aria-label$='nth']"));
	selectBasedOn(dobMonth, "3");
//startwith attributevalue
	WebElement dobYear = driver.findElement(By.cssSelector("select[aria-label^='Yea']"));
	selectBasedOn(dobYear, "2020");
//TangName ClassName and AttributeName&value
	WebElement gender = driver.findElement(By.cssSelector("input._8esa[value='2']"));
	elementClick(gender);
//starting with attribute values using xpath
	WebElement signupbutton = driver.findElement(By.xpath("//button[starts-with(@id,'u_0_s')]"));
	elementClick(signupbutton);
*/	
	}
}
