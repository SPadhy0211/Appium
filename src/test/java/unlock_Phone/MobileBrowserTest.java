package unlock_Phone;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserTest {
	
	@Test
	public void mobileBrowser() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50");
	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
     	dc.setCapability(MobileCapabilityType.UDID, "HIYPJRJVPRS4AMFA");
     	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
     	
     	URL u = new URL("http://localhost:4723");
 	    AppiumDriver driver = new AppiumDriver(u, dc);
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	    
 	    driver.get("https://facebook.com");
 	    driver.findElement(By.xpath("//input[@placeholder='Mobile number or email address']")).sendKeys();
 	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys();
 	    driver.findElement(By.xpath("//button[@name='login']")).click();
 	    
	}

}
