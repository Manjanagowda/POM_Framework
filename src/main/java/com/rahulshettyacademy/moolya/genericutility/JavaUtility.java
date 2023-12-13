package com.rahulshettyacademy.moolya.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {

	public String replaceCharacter()
	{
		String value = LocalDateTime.now().toString().replace(':', '-');
		return value;
	}
}
