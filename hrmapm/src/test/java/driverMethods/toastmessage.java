package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class toastmessage {
@Test
public void gen() throws MalformedURLException, InterruptedException {
	DesiredCapabilities capbilities= new DesiredCapabilities();
	capbilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
	capbilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
	capbilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	capbilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
	capbilities.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
	capbilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
	capbilities.setCapability(MobileCapabilityType.NO_RESET,true);
	capbilities.setCapability("appPackage","com.androidsample.generalstore");
	capbilities.setCapability("appActivity",".SplashActivity");
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url, capbilities);
	Thread.sleep(5000);
	WebElement ltsshop = driver.findElementById("com.androidsample.generalstore:id/btnLetsShop");
	Thread.sleep(2000);
	        ltsshop.click();
	        String value = driver.findElementByXPath("//android.widget.Toast[1]").getText();
	        Thread.sleep(2000);
	 System.out.println(value);
}
}