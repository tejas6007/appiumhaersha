package Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.POMforgeneralstore.LoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class generalthroughpom {
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
		 Thread.sleep(5000);
		 LoginPage log= new LoginPage(driver);
		 log.login("harsha");
	}

}
