package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPGF {
	
	//Constructor simililar like method, never allow void word because constructor always return something
	
	MasterPGF (WebDriver driver){// remove null pointer exception 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='login']")// to remove this string value null we bring constructor
	private WebElement sinIn;// data is WebElement
	//example private int a ; 
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement passwoed;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	private WebElement loginbtn;

	public WebElement getSinIn() {
		return sinIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswoed() {
		return passwoed;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}