package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SwitchTOwebview {
	@Test
	public void switchview() throws MalformedURLException, InterruptedException {
		AppiumServiceBuilder builder=new AppiumServiceBuilder().withAppiumJS(null);
		AppiumDriverLocalService service=AppiumDriverLocalService.buildService(builder);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		dc.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		dc.setCapability(MobileCapabilityType.NO_RESET,true);
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 WebElement dropdown = driver.findElementById("com.androidsample.generalstore:id/spinnerCountry");
		  dropdown.click();
		   scrolltoelement(driver, "text", "India");
		   
		  Set<String> windows = driver.getContextHandles();
		  System.out.println(windows);
		  for (String window : windows) {
			
		}
	}
	public void scrolltoelement(AndroidDriver driver,String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
		
	}

}

