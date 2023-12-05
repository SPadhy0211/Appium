package com.GeneralStore.TestScripts;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GeneralStore.GenericUtils.BaseClass;
import com.GeneralStore.GenericUtils.FileUtility;
import com.GeneralStore.GenericUtils.GestureUtility;
import com.GeneralStore.GenericUtils.IPathConstants;
import com.GeneralStore.ObjectRepository.LoginPage;
import com.GeneralStore.ObjectRepository.ProductsPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

@Listeners(com.GeneralStore.GenericUtils.ListenersImpleClass.class)
public class LoginToGeneralStore extends BaseClass {
	
	@Test
	public void login() throws Throwable
	{
//		File f = new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f)
//		.withIPAddress("127.0.0.1").usingPort(4723)
//		.withTimeout(Duration.ofSeconds(300)).build();
//		service.start();
		
//		FileUtility fUtil = new FileUtility();
//		String PLATFORM_NAME = fUtil.readDataFromPropertyFile("platformName");
//		String DEVICE_NAME = fUtil.readDataFromPropertyFile("deviceName");
//		String AUTOMATION_NAME = fUtil.readDataFromPropertyFile("automationName");
//		String UDID = fUtil.readDataFromPropertyFile("UDID");
//		
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
//	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
//     	dc.setCapability(MobileCapabilityType.UDID, UDID);
//     	
//     	dc.setCapability("appPackage", "com.androidsample.generalstore");
//     	dc.setCapability("appActivity", ".SplashActivity");
//     	     	
//     	URL u = new URL(IPathConstants.URL);
// 	    AndroidDriver driver = new AndroidDriver(u, dc);
// 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    
// 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
// 	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
// 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sasmita");
// 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
// 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
 	    
 	    
 	    lp.loginSetup("India", gUtil, "Sasmita");
 	    
 	    Assert.fail();
 	    
 	    String actData = pp.getProductsName().getText();
 	    System.out.println(actData);
 	    String expData = "Products";
 	    Assert.assertEquals(actData, expData);
 	    System.out.println("Verified");
 	   
	}

}
