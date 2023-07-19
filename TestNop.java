package com.greens.pom;

public class TestNop extends TBasefunctions {

	public static void main(String[] args) {
		
		browserlauncher("chrome");
		gourl("https://demo.nopcommerce.com/");
		NopCommerceElements no = new NopCommerceElements(driver);
		movetoelement(no.getComputer());
		click(no.getDesktop());
		click(no.getProduct());
		implicitwait(20);
		gettext(no.getNotification());
		click(no.getClose());
		click(no.getCart());
		implicitwait(20);
		click(no.getTermsofservice());
		click(no.getCheckout());
		implicitwait(20);
		click(no.getRegister());
		click(no.getGender());
		sendkeys("vishnu",no.getFirstname());
		sendkeys("priya",no.getLastname());
		dropindex(no.getDay(),3);
		dropindex(no.getMonth(),3);
		dropindex(no.getYear(),3);
		sendkeys("chittumagi@gmail.com",no.getEmail());
		sendkeys("Aaremvee",no.getCompany());
		sendkeys("Aaremvee",no.getPassword());
		sendkeys("Aaremvee",no.getConfirmpassword());
		click(no.getRegister1());
		click(no.getContinueb());
		click(no.getTermsofservice());
		click(no.getCheckout());
		
		
		
		
		
		
		
		

	}

}
