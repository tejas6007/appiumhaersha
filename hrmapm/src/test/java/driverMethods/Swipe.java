package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe {
	@Test
	public void swip() throws MalformedURLException, InterruptedException {
		DesiredCapabilities  capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		 capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi note 8");
		 capabilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		 capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		// capabilities.setCapability(MobileCapabilityType.APP,"H:\\\\apm application\\\\Touch Screen Test_v1.7.14_apkpure.com.apk");
		 capabilities.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		 capabilities.setCapability("appActivity",".TouchScreenTestActivity");
		 URL url = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver = new AndroidDriver(url, capabilities);
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 // swipe top to bottom
		 driver.swipe(470, 136, 470, 1423, 500);
		 //Swipe bottom to top
		 driver.swipe(746, 1442, 742, 136, 500);
		 //swipe right to left 
		 driver.swipe(993, 904, 62, 938, 500);
		 //swipe left to right
		 driver.swipe(99, 737, 944, 714, 500);
		 //swipe exact half of the screen both vertical and horizontal
		 Dimension size = driver.manage().window().getSize();
		              int h = size.height;
		               int w = size.width;
		               System.out.println(h);
		               System.out.println(w);
		               
		               driver.swipe(w/2, 0, w/2, h, 500);
		               Thread.sleep(2000);
		               driver.swipe(0, h/2, w, h/2, 500);
		               driver.swipe(966, 192, 126, 2050, 500);
		               
		               driver.swipe(695, 1622, 707, 2080, 500);
		               driver.swipe(974, 1555, 982, 2085, 500);
		               driver.swipe(703, 1865, 950, 1928, 500);
		               
		 
	}

}
