package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.helpers.TestBase;

public class SignUp extends TestBase {
	//constructor-extends the super (TestBase class)
	public SignUp(WebDriver driver) {
		super(driver);
	}
	
	//access Modifiers (public,private,protected and default)
	//Static is used to directly to access the methods.A private static method defeats the purpose of "Data hiding"
	public static By in_email = By.xpath("//*[@id='email']");
	public static By in_password =By.xpath("//*[@id='password']");
	public static By in_confirmpassword = By.xpath("//*[@id='confirm_password']");
	public static By btn_signp = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/form/div[3]/div/div[2]/input");
	
	
	// void : method declaration and definition to specify that the method does not return any type
	public void  SignUpToApllication(String email,String password, String confirmpassword){
		Open("https://www.findmyfare.com/account/register");
		System.out.println(email);
		Type(in_email,email);
		Type(in_password,password);
		Type(in_confirmpassword,confirmpassword);
		Click(btn_signp);
	}


	
}
