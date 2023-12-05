package com.GeneralStore.GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	
	AndroidDriver driver;
	public GestureUtility(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void dragAndDrop(WebElement element, int endX,int endY)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", endX,
			    "endY", endY
			));
	}
	
	public void logPress(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element).getId(),
				"duration",2000
				));
	}
	
	public void click(WebElement element)
	{
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
	}
	
	public void swipe(int left, int top, int width, int height, String dir)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir,
			    "percent", 0.75
			));
	}
	
	public void scroll(String country)
	{
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+country+"\"))")).click();
	}
	
	public void pinchOpenAndClose(WebElement element) throws Throwable
	{
        ((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75
			));
		
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75
			));
	}

}
