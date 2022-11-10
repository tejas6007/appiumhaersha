package Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchGeneralstore {
	AndroidDriver driver;
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
		//capbilities.setCapability(MobileCapabilityType.APP,"‪H:\\apm application\\General-Store.apk");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, capbilities);
		//driver.installApp("H:\\\\apm application\\\\General-Store.apk");
		Thread.sleep(5000);
		  WebElement dropdown = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");
		  trans(1, dropdown, 500);
		   scrolltoelement(driver, "text", "India");
		
		
	}
	public void trans(int fingure,WebElement element,int duration) {
		driver.tap(fingure, element, duration);
	}
	public void scrolltoelement(AndroidDriver driver,String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

}
