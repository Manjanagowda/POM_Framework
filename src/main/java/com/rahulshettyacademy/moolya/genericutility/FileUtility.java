package com.rahulshettyacademy.moolya.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readValueFromPropertyFile(String keyValue) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.txt");
		Properties properties = new Properties() ;
		properties.load(fis);
		String value = properties.getProperty(keyValue);
		return value;
	}
}
