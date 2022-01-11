package com.qa.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;

public class UserRegistration extends BaseTest {
	
	@Test(priority=11)
	public void verify_error_when_providing_null_values_for_all_fields()  {
		try {
        driver.findElementByXPath("//android.widget.TextView[@text='Login']").click(); 
        driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();       
        Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
		Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println("User can't leave all required fields empty when registering");

	}
	
	@Test(priority=12)
	public void verify_error_when_providing_a_null_value_for_name()  {
		try { 
		    
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement address = driver.findElementByXPath("//android.widget.TextView[@text='Enter Your Address']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			email.sendKeys("akilatest10@yahoo.com");
			mobileNumber.sendKeys("272311734");			
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
			address.click();
			MobileElement deliveryLocation = driver.findElementByXPath("//android.widget.EditText[@text='Enter Delivery Location']");
			deliveryLocation.sendKeys("1/37 Arabi Street, Sandringham");
			Thread.sleep(1000);
			driver.findElementByXPath("//android.widget.TextView[@text='1/37 Arabi Street, Sandringham, Auckland, New Zealand']").click();
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			email.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide a null value for 'name' when registering");
		
	}
	
	
	@Test(priority=13)
	public void verify_error_when_providing_a_null_value_for_email()  {
		try { 
			
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			mobileNumber.sendKeys("272311734");			
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
					
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide a null value for 'email' when registering");
		
	}
	
	
	@Test(priority=14)
	public void verify_error_when_providing_an_invalid__email()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("abcd");
			mobileNumber.sendKeys("272311734");			
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide an invalid 'email' when registering");
		
	}
	
	@Test(priority=15)
	public void verify_error_when_providing_an_email_that_is_already_in_use()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("akilatest10@gmail.com");
			mobileNumber.sendKeys("272311734");			
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide an  'email' that is already in use to register");
		
	}
	
	@Test(priority=16)
	public void verify_error_when_providing_a_null_value_for_mobile_number()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("akilatest10@yahoo.com");		
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide a null value for 'mobile number' when registering");
		
	}
	
	
	@Test(priority=17)
	public void verify_error_when_providing_an_invalid_mobile_number()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("akilatest10@yahoo.com");
			mobileNumber.sendKeys("123456");
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide an invalid 'mobile number' when registering");
		
	}
	
	
	@Test(priority=18)
	public void verify_error_when_providing_a_null_value_for_password()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("akilatest10@yahoo.com");
			mobileNumber.sendKeys("272311734");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			mobileNumber.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide a null value for 'password' when registering");
		
	}
	
	@Test(priority=19)
	public void verify_error_when_providing_a_password_less_than_6_characters()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("akilatest10@yahoo.com");
			mobileNumber.sendKeys("272311734");
			password.sendKeys("1234");
			confirmPassword.sendKeys("1234");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide a 'password' less than 6 characters when registering");
		
	}
	
	
	@Test(priority=20)
	public void verify_error_when_password_and_confirm_password_doesnt_match()  {
		try { 		
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			name.sendKeys("Akila Rangalla");
			email.sendKeys("akilatest10@yahoo.com");
			mobileNumber.sendKeys("272311734");
			password.sendKeys("akila1234");
			confirmPassword.sendKeys("akila5678");
			Thread.sleep(2000);
			
			
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
			name.clear();
			email.clear();
			mobileNumber.clear();
			password.clear();
			confirmPassword.clear();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User can't provide unmatching values for 'password' and 'confirm password' when registering");
		
	}
	
	@Test(priority=21)
	@Parameters("userEmail")
	public void verify_successful_register_by_providing_all_valid_values(String userEmail)  {
		try {       
	        
			MobileElement name = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name']");
			MobileElement email = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email']");
			MobileElement mobileNumber = driver.findElementByXPath("//android.widget.EditText[@text='Enter Mobile Number']");
			MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password']");
			MobileElement confirmPassword = driver.findElementByXPath("//android.widget.EditText[@text='Confirm Password']");
			
			name.sendKeys("Akila Rangalla");
			email.sendKeys(userEmail);
			mobileNumber.sendKeys("272311734");
			password.sendKeys("akila12345");
			confirmPassword.sendKeys("akila12345");
			Thread.sleep(2000);
			
					
			driver.findElementByXPath("//android.widget.TextView[@text='Create Account']").click();
			Thread.sleep(2000);
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User successfully registered to the system");
		
	}
	

}
