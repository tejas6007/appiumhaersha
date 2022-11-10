package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class KEYevents {
	@Test
	public void keyevent() throws MalformedURLException, InterruptedException {
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
		  driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		  Thread.sleep(2000);
		  driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		  Thread.sleep(2000);
		  driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		  Thread.sleep(2000);
		  driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		  Thread.sleep(2000);
		  driver.longPressKeyCode(AndroidKeyCode.KEYCODE_CALCULATOR);
		  Thread.sleep(2000);
		  driver.longPressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		  
	}

}
