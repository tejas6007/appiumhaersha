package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RotateScreen {
	@Test
	public void rotage() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		capabilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
        capabilities.setCapability("appPackage","io.appium.android.apis");
		capabilities.setCapability("appActivity",".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver = new AndroidDriver(url, capabilities);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  ScreenOrientation orientaton = driver.getOrientation();
		  System.out.println(orientaton);
		  driver.rotate(orientaton.LANDSCAPE);
		  driver.rotate(orientaton.PORTRAIT);
		  

}
}