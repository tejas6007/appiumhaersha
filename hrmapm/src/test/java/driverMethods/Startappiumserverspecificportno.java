package driverMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Startappiumserverspecificportno {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  AppiumDriver  driver;
			AppiumDriverLocalService server=AppiumDriverLocalService(new AppiumServiceBuilder()
					.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
					.usingPort(4723)
					.withLogFile(new File("../hrmapm/Logs.txt")));
			server.start();
			
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("Devicename","redmi");
			dc.setCapability("automationname","appium");
			dc.setCapability("platformname","android");
			dc.setCapability("plateformversion","11");
			dc.setCapability("UDID","1784e4b1");
			dc.setCapability("noreset",true);
			dc.setCapability("appPackage","com.android.camera");
			dc.setCapability("appActivity",".camera");
			
			    URL url = new URL("http://localhost:4723/wd/hub");
			   driver= new AndroidDriver(url,dc);
			   
			    driver = new AndroidDriver(url,dc);
			   AppiumDriver driver1= new  IOSDriver(url,dc);
			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   driver.closeApp();
			   Thread.sleep(2000);
			   server.stop();
		}

	private static AppiumDriverLocalService AppiumDriverLocalService(AppiumServiceBuilder withLogFile) {
		// TODO Auto-generated method stub
		return null;
	}
}
