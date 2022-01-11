package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.TopNavigation;
import com.qa.pages.UserDetailsPage;

public class UserLogin extends BaseTest {
	
	LoginPage loginPage;
	UserDetailsPage userDetailsPage;
	TopNavigation topNavigation;
	
	@BeforeMethod
	public void log(Method m) {
		System.out.println("\n"+"****** Starting Test: "+ m.getName() + " ******"+ "\n");
	}
	
	
	
	@Test(priority=1)
	public void verify_logging_in_without_providing_credentials()  {
		
		topNavigation = new TopNavigation();
		loginPage = topNavigation.pressLoginButton();
		loginPage.pressLoginButton();
		
        System.out.println("User can't log into the application without providing any credentials");

	}
	
	@Test(priority=2)
	public void verify_logging_in_with_invalid_email_and_invalid_password()  {
		
		loginPage = new LoginPage();
		loginPage.enterEmail("abc");
		loginPage.enterPassword("1234");
		loginPage.pressLoginButton();
		
		
		System.out.println("User can't log into the application by providing invalid credentials");
		
	}
	
	@Test(priority=3)
	public void verify_logging_in_with_invalid_email_and_valid_password()  {
		
		loginPage = new LoginPage();
		loginPage.enterEmail("abc");
		loginPage.enterPassword("akila1234");
		loginPage.pressLoginButton();
		
		
		System.out.println("User can't log into the application using invalid email address and valid Password");
		
	}
	
	
	@Test(priority=4)
	public void verify_logging_in_with_valid_email_and_invalid_password()  {
		
		
		loginPage = new LoginPage();
		loginPage.enterEmail("akilatest10@gmail.com");
		loginPage.enterPassword("acbd123");
		loginPage.pressLoginButton();
		
		
		System.out.println("User can't log into the application using valid email address and invalid Password");
		
	}
	
	
	@Test(priority=5)
	public void verify_logging_in_with_valid_email_and_valid_password()  {
		
		loginPage = new LoginPage();
		loginPage.enterEmail("akilatest10@gmail.com");
		loginPage.enterPassword("akila1234");
		loginPage.pressLoginButton();
		
	
		
		System.out.println("User can log into the application using valid email address and valid Password");
		
	}
	
	

}
