package com.POMforgeneralstore;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage {
	       private AndroidDriver<AndroidElement> driver;
	       
	       @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	                  private   AndroidElement    name;
	       @iOSFindBy()
	       @AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
           private   AndroidElement  male;
	       @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
           private   AndroidElement  femail;
	       @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
           private   AndroidElement button;
		public AndroidDriver<AndroidElement> getDriver() {
			return driver;
		}
		public AndroidElement getName() {
			return name;
		}
		public AndroidElement getMale() {
			return male;
		}
		public AndroidElement getFemail() {
			return femail;
		}
		public AndroidElement getButton() {
			return button;
		}
	       
     public LoginPage(AndroidDriver<AndroidElement>driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    	 
     }
     public void loginn() {
    	 name.sendKeys("hd");
    	 male.click();
    	 button.click();
     }
     public void login(String name1) {
    	 name.sendKeys(name1);
    	 male.click();
    	 button.click();
     }
}
