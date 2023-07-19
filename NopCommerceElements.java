package com.greens.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceElements {
	
	@FindBy(xpath = "(//a[text()='Computers '])[1]")private WebElement computer;
	
	@FindBy(xpath = "(//a[text()='Desktops '])[1]")private WebElement desktop;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[2]")private WebElement product;
	
    @FindBy(xpath = "//p[@class='content']")private WebElement notification;
	
	@FindBy(xpath = "//span[@class='close']")private WebElement close;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")private WebElement cart;
	
    @FindBy(id = "termsofservice")private WebElement termsofservice;
	
	@FindBy(id = "checkout")private WebElement checkout;
	
	@FindBy(xpath = "//button[text()='Register']")private WebElement register;
	
	@FindBy(id = "gender-female")private WebElement gender;
	
	@FindBy(id = "FirstName")private WebElement firstname;
	
    @FindBy(id = "LastName")private WebElement lastname;
    
    @FindBy(name = "DateOfBirthDay")private WebElement day;
	
	@FindBy(name = "DateOfBirthMonth")private WebElement month;
	 
    @FindBy(name = "DateOfBirthYear")private WebElement year;
	
	@FindBy(id = "Email")private WebElement email;
	
	@FindBy(id = "Company")private WebElement company;
	
	@FindBy(id = "Password")private WebElement password;
	
	@FindBy(id = "ConfirmPassword")private WebElement confirmpassword;
	
	@FindBy(id = "register-button")private WebElement register1;
	
	@FindBy(xpath = "//a[text()='Continue']")private WebElement continueb;
	
	public NopCommerceElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// Getters for all the Elements
		public WebElement getComputer() {
			return computer;
		}
		
		public WebElement getDesktop() {
			return desktop;
		}
	
	public WebElement getProduct() {
		return product;
	}
	public WebElement getNotification() {
		return notification;
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getTermsofservice() {
		return termsofservice;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getRegister() {
		return register;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getDay() {
		return day;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getCompany() {
		return company;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getConfirmpassword() {
		return confirmpassword;
	}


	public WebElement getRegister1() {
		return register1;
	}
	
	public WebElement getContinueb() {
		return continueb;
	}

	

	
}
