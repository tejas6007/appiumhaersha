package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class uninstall_app {
	@Test
	public void uninstall() throws MalformedURLException {
		DesiredCapabilities Capabilities = new DesiredCapabilities();
		   Capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		   Capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		   Capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		   Capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
		   Capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi note 8");
		   Capabilities.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
			Capabilities.setCapability("appActivity", ".TouchScreenTestActivity");
			URL url = new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver= new AndroidDriver(url, Capabilities);
			driver.removeApp("jp.rallwell.siriuth.touchscreentest");
		
	}

}
