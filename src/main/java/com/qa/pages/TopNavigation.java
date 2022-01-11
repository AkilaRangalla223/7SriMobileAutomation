package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TopNavigation extends BaseTest {

	@AndroidFindBy(xpath ="//android.widget.TextView[@bounds='[696,104][815,169]']" ) private MobileElement loginButton;
	
	
	
	public LoginPage pressLoginButton() {
		click(loginButton);
		return new LoginPage();
	}
	
	
}
