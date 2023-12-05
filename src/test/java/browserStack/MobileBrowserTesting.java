package browserStack;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserTesting {
	public static final String username = "sasmitapadhy_jkYBJD";
	public static final String accessKey = "savx2zy4hyzzHggqofyx";
	public static final String url = "https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void MobileBrowser() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
		dc.setCapability("build", "1.1.4");
		dc.setCapability("name", "Mobile_Browser_Testing_Browserstack");
		
		WebDriver driver = new RemoteWebDriver(new URL(url), dc);
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
	}

}
