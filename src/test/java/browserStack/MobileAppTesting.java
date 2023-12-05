package browserStack;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAppTesting {
	public static final String username = "sasmitapadhy_jkYBJD";
	public static final String accessKey = "savx2zy4hyzzHggqofyx";
	public static final String url = "https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void mobileAppTesting() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		dc.setCapability("os_version", "11.0");
		dc.setCapability("Project", "API Demo Testing");
		dc.setCapability("build", "API_Demo_1.1.3");
		dc.setCapability("app", "bs://7eb245b36699dc96102323a5bc9b243d9af311f5");
		
		AndroidDriver driver = new AndroidDriver(new URL(url),dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
	}
	
}
