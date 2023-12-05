package browserStack;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WebBrowserTesting {
	
	public static final String username = "sasmitapadhy_jkYBJD";
	public static final String accessKey = "savx2zy4hyzzHggqofyx";
	public static final String url = "https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void webBrowserTesting() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("os", "Windows");
		dc.setCapability("os_version", "11");
		dc.setCapability("browser", "chrome");
		dc.setCapability("browser_version", "114");
		dc.setCapability("name", "Selenium_Browserstack_Execution");
		
		WebDriver driver = new RemoteWebDriver(new URL(url),dc);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}

}
