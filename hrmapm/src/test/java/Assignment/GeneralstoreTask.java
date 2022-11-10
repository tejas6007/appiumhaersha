package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralstoreTask {
	AndroidDriver driver;
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
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		 driver = new AndroidDriver(url, dc);
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
		   scrolltoelement(driver, "text", "$116.97");
		   String rupes = driver.findElementByXPath("//android.widget.TextView[@text='$116.97']").getText();
		                    if(rupes.equals("$116.97"))
		                    {
		                    	System.out.println("amount match");
		                    }
		                    else
		                    {
		                    	System.out.println("amount miss match");
		                    }
		               String name = driver.findElementByXPath("//android.widget.TextView[@text='Nike SFB Jungle']").getText();
		               System.out.println(name);
		               if(name.equals("Nike SFB Jungle"))
		               {
		            	   driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART'])").click();  
		               }
		               driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		               driver.findElementByXPath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']").click();
		               driver.findElementByXPath("//android.widget.Button[@text='Visit to the website to complete purchase']").click();
		                    
		   
}
	public void scrolltoelement(AndroidDriver driver,String an, String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
		
	}
	
}
