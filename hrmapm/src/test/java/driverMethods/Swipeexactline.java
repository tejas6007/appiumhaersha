package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipeexactline {
	
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
		 Dimension size = driver.manage().window().getSize();
		    int h = size.height;
		    int w = size.width;
		    System.out.println(h);
		    System.out.println(w);
		    
		    driver.swipe(w/4, h/12, w/4, h, 500);
		    driver.swipe(w/2, h/12, w/2, h, 500);
		    driver.swipe(3*w/4, h/12,3*w/4, h, 500);
		    
		    driver.swipe(0, h/4, w, h/4, 500);
		    driver.swipe(0, h/2, w, h/2, 500);
		    driver.swipe(0, 3*h/4,w, 3*h/4, 500);
		    

}
}
