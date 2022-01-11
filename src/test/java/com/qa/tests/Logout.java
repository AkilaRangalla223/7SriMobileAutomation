package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;

public class Logout extends BaseTest {

	
	@Test(priority=6)
	public void verify_logging_out_by_logout_option_in_side_menu()  {
		try {
		driver.findElementByXPath("//android.widget.TextView[@text='Login']").click();
		MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Email']");
		email.sendKeys("akilatest10@gmail.com");
		MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Password']");
		password.sendKeys("akila1234");
		Thread.sleep(2000);
		driver.findElementByXPath("//android.view.ViewGroup[@index='3']").click();
		
		Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@bounds='[42,87][134,186]']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click();        
		Thread.sleep(2000);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("User can logout from the application by using side menu 'Logout' option");

	}
}
