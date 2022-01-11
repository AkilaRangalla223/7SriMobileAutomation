package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.BaseTest;

public class OrderItem extends BaseTest{

	@Test(priority=22)
	public void selecting_the_first_item_from_the_menu()  {
		try {
        driver.findElementByXPath("//android.widget.TextView[@text='Order Now']").click();
        Thread.sleep(2000);      
        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("First item of the menu is selected");

	}
	
	@Test(priority=23)
	public void increase_the_quantity_of_the_item_selected()  {
		try {
			driver.findElementByXPath("//android.widget.TextView[@index='7']").click();
			Thread.sleep(1000);      
			driver.findElementByXPath("//android.widget.TextView[@index='7']").click();
			Thread.sleep(4000);      
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Quantity of the food item is increased by two");
		
		
	}
	
	
	@Test(priority=24)
	public void decreased_the_quantity_of_the_item_selected()  {
		try {
			driver.findElementByXPath("//android.widget.TextView[@index='5']").click();
			Thread.sleep(2000);      
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Quantity of the food item is decreased by one");
		
	}
	
	
	@Test(priority=25)
	public void add_the_selected_item_to_the_cart()  {
		try {
			driver.findElementByXPath("//android.widget.TextView[@text='Confirm']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//android.widget.TextView[@text='No']").click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Selected item is added to the cart");
		
	}
	
	
	@Test(priority=26)
	public void remove_the_selected_item_from_the_cart()  {
		try {
			driver.findElementByXPath("//android.widget.TextView[@bounds='[988,236][1054,307]']").click();
			Thread.sleep(2000);			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Added item is removed to the cart");
		
	}
	
	
	
}
