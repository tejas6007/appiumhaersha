package actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class uninstallthe_app {
	@Test
	public void uninstall() throws MalformedURLException
	{
		DesiredCapabilities capabillities = new DesiredCapabilities();
		capabillities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabillities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabillities.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		capabillities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		capabillities.setCapability(MobileCapabilityType.UDID, "");
		capabillities.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
		capabillities.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		capabillities.setCapability("appActivity", ".TouchScreenTestActivity");
		capabillities.setCapability(MobileCapabilityType.FULL_RESET, true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, capabillities);
	}
}
