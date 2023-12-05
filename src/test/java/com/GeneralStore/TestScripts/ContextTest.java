package com.GeneralStore.TestScripts;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.GeneralStore.GenericUtils.BaseClass;
import com.GeneralStore.GenericUtils.DriverUtility;
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

public class ContextTest extends BaseClass {
	
	@Test
	public void context() throws Throwable
	{
//		File f = new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f)
//		.withIPAddress("127.0.0.1").usingPort(4723)
//		.withTimeout(Duration.ofSeconds(300)).build();
//		service.start();
//		
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
 	    	    
 	    lp.loginSetup("India",gUtil, "Sasmita");
 	    
// 	    ScreenOrientation screen = driver.getOrientation();
//	    driver.rotate(screen.LANDSCAPE);
 	    
// 	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")).click();
// 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
// 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
 	    
 	    pp.clickOnAddToCart();
 	    pp.ClickOnCartBtn();
 	    cp.clickOnProceedBtn();
// 	    Set<String> context = driver.getContextHandles();
// 	    Thread.sleep(3000);
// 	    int count = context.size();
// 	    System.out.println(count);
// 	    
// 	    //to get the views
// 	    for(String v : context)
// 	    {
// 	    	System.out.println(v);
// 	    }
 	  
 	    dUtil.contextHandle();  
 	    Thread.sleep(5000);
 	    
 	    //switching from native to web view
// 	    driver.context("WEBVIEW_com.androidsample.generalstore");
 	    dUtil.switchContext();
 	    driver.findElement(AppiumBy.xpath("//input[name='q']")).sendKeys("Appium"+Keys.ENTER);
 	    
 	    
 	    
 	    
	}

}
