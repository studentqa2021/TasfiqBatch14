package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utiliti.BaseConfig;

public class PageFactoryPractice  {
	
	 public static void pageFactoryCodding(){
		 System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to(BaseConfig.getConfigValue("URL"));
		 driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
		 
		 PageFactory1 obj = new PageFactory1(driver);
		 obj.getSignIn().click();
		 obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));
		 obj.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		 obj.getSubmitbutton().click();
		 
		 
		 
		 
		 
		 
		// WebElement signIn = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
		 //signIn.click();		
}
	    //*[contains(@id,'email')]
	 
}