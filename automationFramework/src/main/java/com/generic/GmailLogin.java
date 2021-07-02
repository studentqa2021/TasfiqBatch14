package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utiliti.HighlighthotWire1;

public class GmailLogin {

	public static void getGmailLogin() {
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();//up-casting
		//driver.get("url");
		driver.navigate().to("https://www.hotwire.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement signIn=driver.findElement(By.xpath("(//*[@class='btn__label'])[1]"));
		HighlighthotWire1.hotwireHighlight(driver, signIn);
		signIn.click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tasfiqkalam@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("tasfiq123");
		driver.findElement(By.xpath("(//*[@class='btn__label btn__label--truncate'])[3]")).click();
		//driver.quit();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	//type casting 
		//driver.quit();
		
	}
	
}
