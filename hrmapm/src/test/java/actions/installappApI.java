package actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class installappApI {
	@Test
	public void install() throws MalformedURLException {
		
		       DesiredCapabilities dc = new DesiredCapabilities();
		       dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		       dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		       dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		       dc.setCapability(MobileCapabilityType.UDID, "1784e4b1");
		       dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		       dc.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
		       dc.setCapability(MobileCapabilityType.APP,"G:\\\\ApiDemos-debug.apk");
		       
		       URL url = new URL("http://localhost:4723/wd/hub");
		       AndroidDriver adv = new AndroidDriver(url,dc);
		    //  adv.installApp("G:\\ApiDemos-debug.apk");
		  //     boolean value = adv.isAppInstalled("io.appium.android.apis");
		  //     System.out.println(value);
		       
	}

}
