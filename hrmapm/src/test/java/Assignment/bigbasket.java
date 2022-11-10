package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class bigbasket {
	       AndroidDriver<AndroidElement>  driver;
	@Test
	public void task() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		dc.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		//dc.setCapability(MobileCapabilityType.NO_RESET,true);
		dc.setCapability("appPackage","com.bigbasket.mobileapp");
		dc.setCapability("appActivity",".activity.SplashActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		 driver = new AndroidDriver(url, dc);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.findElementById("com.bigbasket.mobileapp:id/text_start_exploring").click();
		 driver.findElementByXPath("//android.widget.TextView[@text='1 lakh+ products at lowest prices']").click();
		driver.findElementById("com.bigbasket.mobileapp:id/button_done").click();
		 driver.swipe(500,1648, 499, 700, 500);
		 driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\'Product Image\'])[1]").click();
		 Thread.sleep(2000);
		 driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]").click();
		 //browser stack
		 

	}
}