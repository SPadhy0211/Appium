package com.GeneralStore.GenericUtils;

import java.time.Duration;
import java.util.Set;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.appmanagement.ApplicationState;

public class DriverUtility {
	
	AndroidDriver driver;
	public DriverUtility(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void installation()
	{
		driver.installApp(".apk file path");
		System.out.println(driver.isAppInstalled("package name"));
	}
	
	public void uninstall()
	{
		driver.removeApp("package name");
	}
	
	public void runAppInBackground()
	{
		driver.runAppInBackground(Duration.ofSeconds(20));
		System.out.println(driver.queryAppState("package name"));
//		ApplicationState st = driver.queryAppState("package name");
//		System.out.println(st);
	}
	
	public void contextHandle() throws Throwable
	{
		Thread.sleep(4000);
		Set<String> context = driver.getContextHandles();
		int count = context.size();
		System.out.println(count);
		for(String v : context)
		{
			System.out.println(v);
		}
	}
	
	public void switchContext()
	{
		driver.context("WEBVIEW_com.androidsample.generalstore");
	}
	
	public void openNotification()
	{
		driver.openNotifications();
	}
	
	public void hindKeyboard()
	{
		driver.hideKeyboard();
	}

}
