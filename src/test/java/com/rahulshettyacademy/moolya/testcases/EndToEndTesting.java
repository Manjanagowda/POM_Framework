package com.rahulshettyacademy.moolya.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rahulshettyacademy.moolya.elementrepository.LoginActions;
import com.rahulshettyacademy.moolya.genericutility.BaseTestClass;
import com.rahulshettyacademy.moolya.genericutility.ExcelUtility;

public class EndToEndTesting extends BaseTestClass{

	@Test
	
	public void endToEndTesting() throws IOException
	{
		LoginActions login = new LoginActions(driver);
		login.loginActions(utils.readValueFromPropertyFile("emailId"),utils.readValueFromPropertyFile("password"));
		ExcelUtility excelUtils = new ExcelUtility();
		login.validateHomePage(excelUtils.readStringValue("webdata", 1, 2));
	}
}
