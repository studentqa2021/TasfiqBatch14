package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utiliti.HIghligher2;
import com.utiliti.HotWireScreenshot;
import com.utiliti.TakeScreenshot;

public class BaseHotWireLogin {

	public static void hotwirelogin() {
		//run browser
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.hotwire.com/");
		
		driver.manage().window().maximize();
		HotWireScreenshot.hotwirepic(driver, "homepageScreenshot");
		
		WebElement signin=driver.findElement(By.xpath("(//*[@class='btn__label'])[1]"));
		
		TakeScreenshot.addTakeScreenshot(driver, "afterMax");
		HIghligher2.getColour(driver, signin);
		
		signin.click();
		TakeScreenshot.addTakeScreenshot(driver, "BeforeSign");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tasfiqkalam@gmail.com");
		TakeScreenshot.addTakeScreenshot(driver, "after email");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("tasfiq123");
		
		//driver.quit();
		//driver.quit();
		
		
		
		
		//*[@class='btn__label']   
		//(//*[@class='btn__label'])[1]    
		
	}
}
