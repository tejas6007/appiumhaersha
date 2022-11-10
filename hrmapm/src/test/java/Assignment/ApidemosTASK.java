package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApidemosTASK {
	AndroidDriver driver;
	public static void main(String[] args)throws MalformedURLException, InterruptedException {
		AndroidDriver driver;
	}
	public void task() throws MalformedURLException{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"redmi note 8");
		dc.setCapability(MobileCapabilityType.UDID,"1784e4b1");
		//dc.setCapability(MobileCapabilityType.NO_RESET,true);
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement continu =driver.findElementById("com.android.permissioncontroller:id/continue_button");
		//continu.click();
		tapp(1, continu, 50);
		WebElement okk = driver.findElementById("android:id/button1");
		//okk.click();
		tapp(1, okk, 50);
		WebElement view= driver.findElementByAccessibilityId("Views");
		//view.click();
		tapp(1, view, 50);
		WebElement control= (MobileElement)driver.findElementByAccessibilityId("Controls");
		tapp(1, control, 50);
		//control.click();
		WebElement darktheam=(MobileElement)driver.findElementByAccessibilityId("2. Dark Theme");
		tapp(1, darktheam, 100);
		//darktheam.click();
		WebElement check1=(MobileElement)driver.findElementByAccessibilityId("Checkbox 1");
		tapp(1, check1, 100);
		//check1.click();
		WebElement check2=(MobileElement)driver.findElementByAccessibilityId("Checkbox 2");
		tapp(1,check2, 100);
		//check2.click();
		WebElement radio=(MobileElement)driver.findElementByAccessibilityId("RadioButton 1");
		tapp(1, radio, 100);
		//radio.click();
		WebElement drop=(MobileElement)driver.findElementById("io.appium.android.apis:id/spinner1");
		//drop.click();
		tapp(1, drop, 100);    
		WebElement jup = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Jupiter']");
		String jupt = jup.getText();
		String mar = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Mercury']").getText();
		String ven = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Venus']").getText();
		String ear = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Earth']").getText();
		String mars = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Mars']").getText();
		String str = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Saturn']").getText();
		String urn = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Uranus']").getText();
		String nap = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Neptune']").getText();
		System.out.println(mar+" "+ven+" "+jupt+" "+mars+" "+str+" "+nap+" "+ear+" "+urn);
		jup.click();		
	}
	
	public void tapp(int fingure, WebElement element, int duration) {
		driver.tap(fingure, element, duration);
	}
	}

