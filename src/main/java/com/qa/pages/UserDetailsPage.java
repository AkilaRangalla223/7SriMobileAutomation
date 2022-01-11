package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserDetailsPage extends BaseTest {

	@AndroidFindBy(xpath ="//android.widget.TextView[@bounds='[263,573][1028,634]']" ) private MobileElement userEmail;
	

	public String getUserEmail() {
		 return getAttribute(userEmail, "text");
	
    }
	
}