package com.rahulshettyacademy.moolya.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActions {

	WebDriver driver;
	
	public LoginActions(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "userEmail")
	private WebElement userEmailId;
	
	@FindBy (id = "userPassword")
	private WebElement userPassword;
	
	@FindBy (id = "login")
	private WebElement loginButton;
	
	@FindBy (xpath = "//button[@routerlink=\"/dashboard/\"]")
	private WebElement homeLinkText;
	
	public void loginActions(String email,String password)
	{
		userEmailId.sendKeys(email);
		userPassword.sendKeys(password);
		loginButton.click();
	}
	
	public void validateHomePage(String homeLink)
	{
	if(homeLinkText.getText().equals(homeLink))
		{
		System.out.println("passed : we are able to login to the application using valid credentials");
		}
	else
	{
		System.out.println("failed : we are not able to login to the application");
	}
	}
}
