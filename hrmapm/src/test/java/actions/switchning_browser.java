package actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class switchning_browser {
	@Test
	public void task() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		dc.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		dc.setCapability(MobileCapabilityType.NO_RESET,true);
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity","ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver = new AndroidDriver(url, dc);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Set<String> contextname = driver.getContextHandles();
		 System.out.println(contextname);
		
	   for (String contex: contextname) {
		   System.out.println(contex);
		if(contex.contains("NATIVE_APP")) {
			System.out.println("shoe me:"+contex);
			Thread.sleep(2000);
		
	   driver.context("NATIVE_APP");
	   driver.findElement(By.xpath("//android.widget.Button 24[@text='Set']")).click();
		}
		if(contex.contains("WEBVIEW")) {
			driver.context("WEBVIEW");
			driver.findElement(By.xpath("//android.widget.Button 24[@text='Set']")).click();
		}
	}
	}}
