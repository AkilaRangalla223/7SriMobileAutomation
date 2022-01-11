package com.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.utils.TestUtils;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;



public class BaseTest {
  
	 protected static AppiumDriver<MobileElement> driver;
	 protected static Properties props;
	 InputStream inputStream;
	 
	 
	 public BaseTest() {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
  @Parameters({"platformName","platformVersion","deviceName","udid"})
  @BeforeClass
  public void setup(String platformName,String platformVersion,String deviceName,String udid) {
	  try {
		  	 props = new Properties();
		  	 String propsFileName = "config.properties";
		  	 inputStream = getClass().getClassLoader().getResourceAsStream(propsFileName);
		  	 props.load(inputStream);
		  
			 DesiredCapabilities dc = new DesiredCapabilities();

			 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
			 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
			 dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
			 dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			 dc.setCapability(MobileCapabilityType.UDID, udid);
			 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, props.getProperty("androidAppPackage"));
		     dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, props.getProperty("androidAppActivity"));

		     URL url = new URL(props.getProperty("appiumURL"));
		     driver = new AppiumDriver<MobileElement>(url, dc);
		     
		     
			} catch(Exception ex) {
				System.out.println("Cause is : " + ex.getCause());
				System.out.println("Message is : " + ex.getMessage());
				ex.printStackTrace();
			}
  }
  
  
  public void waitForVisibility(MobileElement e) {
	  WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
	  wait.until(ExpectedConditions.visibilityOf(e));
  }
  
  
  public void click(MobileElement e) {
	  waitForVisibility(e);
	  e.click();
  }
  
  public void sendKeys(MobileElement e, String text) {
	  waitForVisibility(e);
	  e.sendKeys(text);
  }
  
  public String getAttribute(MobileElement e, String attribute) {
	  waitForVisibility(e);
	 return e.getAttribute(attribute);
  }

  @AfterClass
  public void teardown() {
		driver.quit();
  }

}
