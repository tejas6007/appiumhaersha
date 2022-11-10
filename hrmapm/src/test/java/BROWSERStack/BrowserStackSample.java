package BROWSERStack;

import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
public class BrowserStackSample {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials
    	caps.setCapability("browserstack.user", "harshahd_xWRUzq");
    	caps.setCapability("browserstack.key", "jfe1jGJyzRTxKvrP5bVe");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://9df1c0632e1b6814d211d48bc4915e252adb0ee6");
    	
    	// Specify device and os_version for testing
    	caps.setCapability("device", "Google Pixel 3");
    	caps.setCapability("os_version", "9.0");
        
    	// Set other BrowserStack capabilities
    	caps.setCapability("project", "First Java Project");
    	caps.setCapability("build", "browserstack-build-1");
    	caps.setCapability("name", "first_test");
       
    	
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
        		new URL("http://hub.browserstack.com/wd/hub"), caps);
        TouchAction touch = new TouchAction(driver);
        // Write your test case statements here
        WebElement viwe = driver.findElementByAccessibilityId("Views");
		viwe.click();
		WebElement drag = driver.findElementByAccessibilityId("Drag and Drop");
	   drag.click();
		MobileElement src = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		Thread.sleep(2000);
		MobileElement dst = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		Thread.sleep(2000);
		touch.longPress(src).waitAction().moveTo(dst).release().perform();
		//frop(src, dst);   
		driver.closeApp();
        
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        
        driver.quit();
		
	}
}
