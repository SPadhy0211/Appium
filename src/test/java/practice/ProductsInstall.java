package practice;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ProductsInstall {
	
	@Test
	public void installProducts() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID, "HIYPJRJVPRS4AMFA");
		
		dc.setCapability(MobileCapabilityType.APP, "‪C:\\Users\\ADMIN\\Desktop\\General-Store.apk");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
