package actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class install_touchscreen {
	public void install() throws MalformedURLException {
	       DesiredCapabilities dc = new DesiredCapabilities();
	       dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
	       dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	       dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	       dc.setCapability(MobileCapabilityType.UDID, "1784e4b1");
	       dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi note 8");
	      //dc.setCapability(MobileCapabilityType.APP,"‪H:\apm application\Touch Screen Test_v1.7.14_apkpure.com.apk");
	       dc.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
	       URL url = new URL("http://localhost:4723/wd/hub");
	       AndroidDriver adv = new AndroidDriver(url,dc);
	       adv.installApp("‪H:\\apm application\\Touch Screen Test_v1.7.14_apkpure.com.apk");
	       boolean value = adv.isAppInstalled("jp.rallwell.siriuth.touchscreentest");
	       System.out.println(value);
	       
}


}
