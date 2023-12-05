package gestures;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ScrollGestureTest {
	
	@Test
	public void scrollDown() throws Throwable
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
	
	   dc.setCapability("appPackage", "io.appium.android.apis");
	   dc.setCapability("appActivity", ".ApiDemos");
	   dc.setCapability("noReset", true);
	   
	   URL u = new URL("http://localhost:4723");
	   AndroidDriver driver = new AndroidDriver(u, dc);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(AppiumBy.accessibilityId("Views")).click();
	   
	   driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"));")).click();
	
	}

}
