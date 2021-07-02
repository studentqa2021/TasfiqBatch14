package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.utiliti.Highlighter;
import com.utiliti.TakeScreenshot;

public class BaseLoginPHPTravel {

	
	public void getlogin() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://phptravels.com/demo");
		//takeScreenshot
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try{FileUtils.copyFile(scrFile, new File("./ScreenShot/Homepg.png"));
//		}catch(Exception exepobj) {
//			exepobj.printStackTrace();
//		}
		TakeScreenshot.addTakeScreenshot(driver,"Homepage");
		driver.manage().window().maximize();//fullScreen for video and game testing 
		WebElement signIn = driver.findElement(By.xpath("//*[@class='lvl-0 sign-in btn btn-md btn-white-outline']"));
		Highlighter.getColor(driver, signIn);
		TakeScreenshot.addTakeScreenshot(driver,"BeforeSignIn");
		signIn.click();
		TakeScreenshot.addTakeScreenshot(driver,"AferSignIn");// it will work later. 
		driver.quit();
		
		
	}
	
}
