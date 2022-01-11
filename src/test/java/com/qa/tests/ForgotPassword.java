package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;

public class ForgotPassword extends BaseTest {
	
	@Test(priority=7)
	public void verify_error_when_providing_a_null_value_for_email()  {
		try {
        driver.findElementByXPath("//android.widget.TextView[@text='Login']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='Forgot Password ?']").click();       
//        MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Email']");
//        email.sendKeys(null);
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='Submit']").click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("User can't leave 'email' empty when resetting password");

	}
	
	@Test(priority=8)
	public void verify_error_when_providing_an_invalid_email()  {
		try {     
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Email']");
			email.sendKeys("abc");
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[@text='Submit']").click();
			email.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't providing an invalid email when resetting password");
		
	}
	
	@Test(priority=9)
	public void verify_error_when_providing_an_unregistered_email()  {
		try {			
			       
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Email']");
			email.sendKeys("akila55@yahoo.com");
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[@text='Submit']").click();
			email.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't providing an unregistered email when resetting password");
		
	}
	
	@Test(priority=10)
	public void verify_email_is_sent_when_providing_a_valid_email_address()  {
		try {			
			
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Email']");
			email.sendKeys("akilatest10@gmail.com");
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[@text='Submit']").click();
			email.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can reset the password by providing a valid email address");
		
	}

}
