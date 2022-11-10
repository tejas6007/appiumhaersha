package actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class tap_actions_calsi {
	@Test
	public void tap() throws MalformedURLException, InterruptedException {
		DesiredCapabilities  Capabilities= new DesiredCapabilities();
		Capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		Capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		Capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi note 8");
		Capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		Capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		Capabilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		Capabilities.setCapability("appPackage","com.miui.calculator");
		Capabilities.setCapability("appActivity", ".cal.CalculatorActivity");
		 URL url = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver = new AndroidDriver(url, Capabilities);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElementById("android:id/button1").click();
		 Thread.sleep(2000);
		 driver.findElementById("com.miui.calculator:id/btn_5_s").click();
		 driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
		 driver.findElementById("com.miui.calculator:id/btn_6_s").click();
		 driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
		 String value = driver.findElementById("com.miui.calculator:id/result").getText();
		 System.out.println(value);
	}

}
