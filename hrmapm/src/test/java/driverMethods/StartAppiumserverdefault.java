package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartAppiumserverdefault {
	public static AndroidDriver driver;
	 public static void main(String[]args) throws MalformedURLException, InterruptedException {
		 AppiumDriverLocalService service= AppiumDriverLocalService.buildDefaultService();
		
		 service.start();
		 
		 DesiredCapabilities dc = new DesiredCapabilities();
		
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		 dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		 dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redminote 8");
		 dc.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		 dc.setCapability("appPackage","io.appium.android.apis");
		 dc.setCapability("appActivity",".ApiDemos");
		//dc.setCapability("appPackage","com.android.camera");
	//	dc.setCapability("appActivity",".camera");
		
		    URL url = new URL("http://localhost:4723/wd/hub");
		   driver= new AndroidDriver(url,dc);
		   
		  // AppiumDriver  driver = new AndroidDriver<>(url,dc);
		   //AppiumDriver driver1= new  IOSDriver(url,dc);
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.closeApp();
		   Thread.sleep(2000);
		   service.stop();
		   
	 }

}
