package unlock_Phone;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverMethodTest {
	
	@Test
	public void driverMethods() throws Throwable
	{
		File f = new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f)
		.withIPAddress("127.0.0.1").usingPort(4723)
		.withTimeout(Duration.ofSeconds(300)).build();
		service.start();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50");
	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
     	dc.setCapability(MobileCapabilityType.UDID, "HIYPJRJVPRS4AMFA");
     	
     	//unlock phone
     	dc.setCapability("unlockType", "pattern");
     	dc.setCapability("unlockKey", "2457");
     	
     	URL u = new URL("http://localhost:4723");
 	    AndroidDriver driver = new AndroidDriver(u, dc);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    
 	    Thread.sleep(4000);
 	    //install app
// 	    driver.installApp("C:\\Users\\ADMIN\\Downloads\\com.davemorrissey.labs.subscaleview.sample.apk");
 	    //to check app is installed
 	    boolean b = driver.isAppInstalled("com.davemorrissey.labs.subscaleview.sample");
 	    System.out.println(b);
 	    //to uninstall app
 	   // driver.removeApp("com.davemorrissey.labs.subscaleview.sample");
 	    
// 	    driver.activateApp("packagename");
// 	    driver.runAppInBackground(Duration.ofSeconds(20));
// 	    driver.queryAppState("packagename");
 	    
 	    boolean lock = driver.isDeviceLocked();
 	    System.out.println(lock);
 	    
// 	    driver.openNotifications();
// 	    driver.hideKeyboard();
 	    
 	    ScreenOrientation s = driver.getOrientation();
 	    driver.rotate(s.LANDSCAPE);
// 	    driver.rotate(s.PORTRAIT);
 	    
 	    //toast
 	    
 	    
	}

}
