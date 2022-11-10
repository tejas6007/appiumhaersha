package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragandDropeActions {
	AndroidDriver driver;
	TouchAction touch;

	@Test
	public void drag() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		capabilities.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		capabilities.setCapability("appPackage","io.appium.android.apis");
		capabilities.setCapability("appActivity",".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		touch = new TouchAction(driver);
		WebElement continu =(MobileElement) driver.findElementById("com.android.permissioncontroller:id/continue_button");
		tranctions(1,continu, 500);
		
		WebElement okk = (MobileElement)driver.findElementById("android:id/button1");
		tranctions(1, okk, 500);
		WebElement viwe = (MobileElement)driver.findElementByAccessibilityId("Views");
		tranctions(1, viwe, 500);
		WebElement drag = driver.findElementByAccessibilityId("Drag and Drop");
		tranctions(1, drag, 500);
		MobileElement src = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		Thread.sleep(2000);
		MobileElement dst = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		Thread.sleep(2000);
		frop(src, dst);   
	}
	public void tranctions(int fingure,WebElement element,int duration) {
		driver.tap(fingure, element, duration);
	}
	public void swipactiond(int sx,int sy,int ex,int ey,int duration)
	{
		driver.swipe(sx, sy, ex, ey, duration);
	}
	public void longpreee(WebElement element)
	{
		touch.longPress(element);
	}
	public void moveto(WebElement ele) {
		touch.moveTo(ele);
	}
	public void frop(WebElement src,WebElement drc)
	{
		touch.longPress(src).waitAction().moveTo(drc).release().perform();
	}
}
