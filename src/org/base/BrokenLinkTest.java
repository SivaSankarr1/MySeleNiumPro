package org.base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinkTest extends Base{
public static void main(String[] args) throws IOException {
	browserLaunch();
	urlLaunch("https://www.amazon.in/");
	//to find all links in the webpage
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	int size = allLinks.size();
	
	System.out.println("Total available links in the page:"+size);
	//To get all link on by one
	for (int i = 0; i <=allLinks.size(); i++) {
		WebElement webElement = allLinks.get(i);
		String urlLinks = webElement.getAttribute("href");
	try {
		//get the all links into URL class
		URL Link = new URL(urlLinks);	
		URLConnection openConnection = Link.openConnection();
		
		//Type conversion with httpsURLconnection
		
		HttpURLConnection https = (HttpURLConnection)openConnection;
		
		//to Establish the connection
		https.connect();
		//to https responsecode
		
		int responseCode = https.getResponseCode();
		
		if(responseCode >= 400) {
			System.out.println(urlLinks +"_is broken link");
				}
		else {
			System.out.println(urlLinks +"_is valid link");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}	
			
	}
	
}
}
