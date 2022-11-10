package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class Network {
	@Test
	public void net() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		capabilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		//capabilities.setCapability("appPackage","io.appium.android.apis");
		//capabilities.setCapability("appActivity",".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver = new AndroidDriver(url, capabilities);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		                             Connection conn = driver.getConnection();
		                                            // driver.setConnection(conn.AIRPLANE);
		                                            // driver.setConnection(conn.WIFI);
		                                            // driver.setConnection(conn.DATA);
		                                             driver.setConnection(conn.ALL);
		                                          //   driver.setConnection(conn.NONE);

}
}
