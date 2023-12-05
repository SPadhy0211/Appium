package practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class OpenCalculator {
	
	@Test
	public void calculator() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID, "HIYPJRJVPRS4AMFA");
		
		dc.setCapability("appPackage", "com.coloros.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("noReset", "true");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void add2Num() throws Throwable
	{
		
		File f = new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		 AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f)
		.withIPAddress("127.0.0.1").usingPort(4723)
		.withTimeout(Duration.ofSeconds(3000)).build();
		 
		 service.start();
		 
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID, "HIYPJRJVPRS4AMFA");
		
		dc.setCapability("appPackage", "com.coloros.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		dc.setCapability("noReset", "true");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(5000);		
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_2")).click();
		driver.findElement(AppiumBy.accessibilityId("Add")).click();
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_8")).click();
		
		
	}

}

