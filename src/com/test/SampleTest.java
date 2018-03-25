package com.test;

import org.testng.annotations.Test;

import com.pages.SignIn;
import com.pages.SignUp;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class SampleTest {
	
	
	WebDriver driver;
	SignUp signup;
	SignIn signin;
		
		
	@BeforeMethod
	public void beforeMethod() { 
		File file = new File("lib" + File.separator + "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		signup = new SignUp(driver);
		signin = new SignIn(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  signup.SignUpToApllication("anuradhaweer@gmail.com", "1qaz!QAZ", "1qaz!QAZ");
	 
	  signin.SignInToApllication("anuradhaweer@gmail.com", "1qaz!QAZ");
  }
  @AfterMethod
  public void afterMethod() {
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" }
    };
  }
}
