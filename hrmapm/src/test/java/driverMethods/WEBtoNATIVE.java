package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WEBtoNATIVE {
	@Test
	public void webtonative() throws InterruptedException, MalformedURLException {
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
		   driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		   
		   
		//   driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]").click();
		   driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("harsha");
		   driver.findElementById("com.androidsample.generalstore:id/radioMale").click();
		   driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		   driver.findElement(By.xpath("//android.widget.imageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']")).click();
		   driver.findElement(By.xpath("com.androidsample.generalstore:id/btnProceed")).click();
		   Thread.sleep(2000);
		   Set<String> window = driver.getContextHandles();
		         System.out.println(window);
		         for (String windows : window) {
		        	 System.err.println("active application: "+windows);
		         }
		         Thread.sleep(2000);
		         driver.context("WEBVIEW_com.androidsample.generalstore");
		         driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tyss");
		         
					
				}
	
	public void scrolltoelement(AndroidDriver driver,String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
		
	}

}
