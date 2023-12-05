package com.GeneralStore.GenericUtils;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.GeneralStore.ObjectRepository.CartPage;
import com.GeneralStore.ObjectRepository.LoginPage;
import com.GeneralStore.ObjectRepository.ProductsPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	AppiumDriverLocalService service;
	FileUtility fUtil = new FileUtility();
	public AndroidDriver driver;
	public LoginPage lp;
	public GestureUtility gUtil;
	public ProductsPage pp;
	public DriverUtility dUtil;
	public CartPage cp;
	public static AndroidDriver sdriver;
	
	@BeforeSuite
	public void startServer()
	{
		File f = new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		service = new AppiumServiceBuilder().withAppiumJS(f)
		.withIPAddress("127.0.0.1").usingPort(4723)
		.withTimeout(Duration.ofSeconds(300)).build();
		service.start();
	}
	
	@BeforeMethod
	public void launchApp() throws Throwable
	{
		String PLATFORM_NAME = fUtil.readDataFromPropertyFile("platformName");
		String DEVICE_NAME = fUtil.readDataFromPropertyFile("deviceName");
		String AUTOMATION_NAME = fUtil.readDataFromPropertyFile("automationName");
		String UDID = fUtil.readDataFromPropertyFile("UDID");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
     	dc.setCapability(MobileCapabilityType.UDID, UDID);
     	
     	dc.setCapability("appPackage", "com.androidsample.generalstore");
     	dc.setCapability("appActivity", ".SplashActivity");
     	     	
     	URL u = new URL(IPathConstants.URL);
 	    driver = new AndroidDriver(u, dc);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    gUtil = new GestureUtility(driver);
 	    lp = new LoginPage(driver);
 	    pp = new ProductsPage(driver);
 	    dUtil = new DriverUtility(driver);
 	    cp = new CartPage(driver);
 	    sdriver = driver;
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void stopServer()
	{
		service.stop();
	}

}
