package com.GnericUtiliti;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility {
	TouchAction tc;
	AndroidDriver driver;
	
	public void tapAction(int fingure,MobileElement element,int duration )
	{
		driver.tap(fingure, element, duration);
	}
  public void swipe(int startx,int starty,int endx,int endy,int duration)
  {
	  driver.swipe(startx, starty, endx, endy, duration);
  }
  public void tapactions(int fingure,int x,int y,int duration)
  {
	  driver.tap(fingure, x, y, duration);
  }
  public void scrollactions(AndroidDriver driver,String an,String av)
  {
	  driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollInotoView("+an+"(\""+av+"\"))");
	  
  }
  public void draganddrop(MobileElement src,MobileElement dst){
     tc=new TouchAction(driver);
  tc.longPress(src).waitAction().moveTo(dst).release();
  }
  public void screeshot(WebDriver driver,String screenshotname) throws IOException{
	     TakesScreenshot tsc=(TakesScreenshot)driver;
	     File src = tsc.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./screenshot"+screenshotname+"png");
	    FileUtils.copyFile(src, dest);
  }

}
