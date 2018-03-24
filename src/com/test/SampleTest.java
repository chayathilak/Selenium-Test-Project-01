package com.test;

import org.testng.annotations.Test;

import com.pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class SampleTest {
	
	
	WebDriver driver;
	LoginPage loginpage;
		
		
	@BeforeMethod
	public void beforeMethod() { 
		File file = new File("lib" + File.separator + "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  loginpage.LoginToApllication("anuradhaweer@gmail.com", "1qaz!QAZ", "1qaz!QAZ");
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
