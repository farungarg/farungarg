package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidate {
	
	public static void responseStatusCodeValidation(Response res,int expectedStatusCode)
	{
		Assert.assertEquals(res.getStatusCode(), expectedStatusCode);
		
	}
	
	public static void responseDataValidation(String expectedData)
	{
		
	}
	

}
