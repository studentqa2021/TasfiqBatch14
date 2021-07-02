package com.utiliti;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void addTakeScreenshot(WebDriver driver, String screenShotName ){
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{FileUtils.copyFile(scrFile, new File("./ScreenShot2/"+screenShotName+".png"));
		}catch(Exception exepobj) {
			exepobj.printStackTrace();
		}
		
	}
}
