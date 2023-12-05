package unlock_Phone;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Unlock_Pattern_Test {
	
	@Test
	public void patternUnlock() throws Throwable
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
 	    AppiumDriver driver = new AppiumDriver(u, dc);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	
		
	}
}
