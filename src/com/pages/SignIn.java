package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.helpers.TestBase;

public class SignIn extends TestBase{
	
	public SignIn(WebDriver driver) {
		super(driver);
	}
	
	public static By in_Sign  = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/form/div[3]/div/div[1]/p/a");
	public static By in_email  = By.xpath("//*[@id='uname']");
	public static By in_password  = By.xpath("//*[@id='password']");
	
	
	public void  SignInToApllication(String email, String password) throws InterruptedException{
		Click(in_Sign);
		Type(in_email,email);
		Type(in_password,password);
	}
}
