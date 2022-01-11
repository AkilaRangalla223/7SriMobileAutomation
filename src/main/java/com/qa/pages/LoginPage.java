package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {
	
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Enter Email']" ) private MobileElement emailTextField;
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Enter Password']" ) private MobileElement passwordTextField;
	@AndroidFindBy(xpath ="//android.view.ViewGroup[@index='3']" ) private MobileElement loginButton;
	@AndroidFindBy(xpath ="//android.widget.TextView[@index='3']" ) private MobileElement errorText;
	
	
	public LoginPage enterEmail(String email) {
		sendKeys(emailTextField, email);
		return this;
	}
	
	
	public LoginPage enterPassword(String password) {
		sendKeys(emailTextField, password);
		return this;
	}
	
	
	public UserDetailsPage pressLoginButton() {
		click(loginButton);
		return new UserDetailsPage();
	}
	
	public String getErrorMessage() {
		 return getAttribute(errorText, "text");
	}

}
