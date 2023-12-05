package com.GeneralStore.TestScripts;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class CrossBrowserTest {
	
	@Parameters({"deviceName","UDID","port"})
	@Test
	public void crossBrowser(String deviceName, String UDID, int port) throws Throwable
	{
		File f = new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f)
		.withIPAddress("127.0.0.1").usingPort(port)
		.withTimeout(Duration.ofSeconds(300)).build();
		service.start();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
     	dc.setCapability(MobileCapabilityType.UDID, UDID);
     	
     	dc.setCapability("appPackage", "com.androidsample.generalstore");
     	dc.setCapability("appActivity", ".SplashActivity");
     	     	
     	URL u = new URL("http://localhost:"+port+"");
 	    AndroidDriver driver = new AndroidDriver(u, dc);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    
 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
 	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sasmita");
 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
 	    
	}

}
