package actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch_the_app {
	@Test
	public void launch() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		capabilities.setCapability(MobileCapabilityType.UDID, "1784e4b1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 8");
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
		capabilities.setCapability("appPackage","io.appium.android.apis");
		//capabilities.setCapability("appActivity", ".app.CustomDialogActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, capabilities);
		boolean value = driver.isAppInstalled("io.appium.android.apis");
		System.out.println(value);
		driver.launchApp();
	}

}
