package com.GnericUtiliti;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClassUtility {
	 AppiumDriverLocalService services;
	 AppiumDriver driver;
	 
	 public void startserver(){
		 PropertyFileUtility apmfil = new PropertyFileUtility();
		 services=AppiumDriverLocalService.buildDefaultService();
		 services.stop();
		 services.start();
		 
	 }
	 @BeforeMethod
	 public void launchApp() throws MalformedURLException
	 {
		 DesiredCapabilities dc = new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		 dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		 dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redminote 8");
		 dc.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		 dc.setCapability("appPackage","io.appium.android.apis");
		 dc.setCapability("appActivity",".ApiDemos");
		 URL url= new URL("http:localhost:4723/wd/hub");
		 driver=new AndroidDriver(url,dc);
		
		 driver.launchApp();
	 }
		 @Test
		 public void hdd(){
			 System.out.println("harsha");
		 }
	 
@AfterMethod
public void closeapp(){
	driver.closeApp();
}
@AfterTest
public void stopserver(){
	services.stop();


}

}
