package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotClasstoday {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\$AM$ANKAR\\eclipse-workspace\\MyProjectInSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//type casting
		TakesScreenshot ts = (TakesScreenshot)driver;;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\Screenshots By selenium\\amazon.jpeg");
		FileUtils.copyFile(sourcefile, targetfile);
		
		
		
}
}