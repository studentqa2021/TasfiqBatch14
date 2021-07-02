package com.utiliti;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HotWireScreenshot {

	public static void hotwirepic(WebDriver driver, String name) {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File("./Screenshots3/"+name+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
