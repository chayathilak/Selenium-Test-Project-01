package com.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

private WebDriver driver = null;
	
	private static int timeOut = 120;
	private static int visableWaitTimeout = 120;

	public TestBase(WebDriver driver){
	this.driver = driver;
	}
	
	public void Open(String url){
		driver.navigate().to(url);
	}
	
	
	public void Click(By byLocater){
		WebElement element = findWebElement(byLocater);
		new WebDriverWait(driver, visableWaitTimeout).until(ExpectedConditions.visibilityOfElementLocated(byLocater));
		new WebDriverWait(driver, visableWaitTimeout).until(ExpectedConditions.elementToBeClickable(byLocater));
		element.click();
	}
	
	public void Type(By byLocater,String value){
		WebElement element = findWebElement(byLocater);
		new WebDriverWait(driver, visableWaitTimeout).until(ExpectedConditions.visibilityOfElementLocated(byLocater));
		new WebDriverWait(driver, visableWaitTimeout).until(ExpectedConditions.elementToBeClickable(byLocater));
		element.sendKeys(value);
	}
	
	private WebElement findWebElement(By byLocater) {
		WebElement element = (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.presenceOfElementLocated(byLocater));		
		return element;
	}
	
}

