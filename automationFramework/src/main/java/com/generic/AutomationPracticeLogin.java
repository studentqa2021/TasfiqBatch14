package com.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.utiliti.TakeScreenshot;


public class AutomationPracticeLogin {

	
	public void baseLogin(){
	
		//login
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		TakeScreenshot.addTakeScreenshot(driver, "hmPageScreenShot");;
		//WebElement sinIn =driver.findElement(By.xpath("//*[@class='login']"));//or click submit
		
		//sinIn.click();
		MasterPGF obj = new MasterPGF(driver);
		obj.getSinIn().click();
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
		obj.getEmail().sendKeys("sarowerny@gmail.com");
		//driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
		obj.getPasswoed().sendKeys("student");
		//driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();//submit
		obj.getLoginbtn().click();
		//login pass or fail
		
		
		
			
	}
}
