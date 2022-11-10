package actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class tap_action_another {
	AndroidDriver driver;     
	@Test
	public void tap() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
		capabilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		capabilities.setCapability("appPackage","com.miui.calculator");
		capabilities.setCapability("appActivity", ".cal.CalculatorActivity");
		 URL url = new URL("http://localhost:4723/wd/hub");
		  driver = new AndroidDriver(url, capabilities);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElementById("android:id/button1").click();
		Thread.sleep(2000);
		 MobileElement five = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_5_s");
		 tapaction(1, five, 500);
		// driver.tap(1, five, 500);
		 MobileElement pluse =(MobileElement) driver.findElementById("com.miui.calculator:id/btn_plus_s");
		 tapaction(1, 943, 1832, 500);
		// driver.tap(1, 943, 1832, 500);
		 MobileElement six =(MobileElement) driver.findElementById("com.miui.calculator:id/btn_6_s");
		 tapaction(1, six, 500);
		// driver.tap(1, six, 500);
		MobileElement equels =(MobileElement) driver.findElementById("com.miui.calculator:id/btn_equal_s");
		tapaction(1, equels, 500);
		//driver.tap(1, equels, 500);
		 String value = driver.findElementById("com.miui.calculator:id/result").getText();
		 System.out.println(value);
		 int inte = Integer.parseInt(value);
		 System.out.println(inte);
	}
// method moverloading
	public void tapaction(int fingrues,MobileElement element,int duration) {
		driver.tap(fingrues,element,duration);
	}
	public void tapaction(int fingures,int x,int y,int duration) {
		driver.tap(fingures, x, y, duration);
	}
}
