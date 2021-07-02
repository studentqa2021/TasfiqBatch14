package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.baseLogin.BaseLogin;
import com.utiliti.Highlighter;

public class codeLogin implements BaseLogin{

	@Override
	public void getSignin() {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		Highlighter.getColor(driver,email);
		email.sendKeys("tasfiqkalam@gmail.com");
		
		
		WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
		Highlighter.getColor(driver,password);
		password.sendKeys("tasfiq123");

		WebElement Submit=driver.findElement(By.xpath("//*[@name='login']"));
		Highlighter.getColor(driver,Submit);
		Submit.click();
		
		
		driver.quit();
		
		
		
		

		
		
	}

}
