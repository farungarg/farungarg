package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.automationtesting.excelreport.Xl;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TestCase2 
{
   @Test
   public void tc2() throws IOException
   {
	   PropertiesLoad p=new PropertiesLoad();
	   Properties pro=p.propertyFileLoad();
	   
	   HTTPMethods http=new HTTPMethods();
	   Response r=http.GetRequest(pro, TestCase1.id_value);
	   
	   ResponseValidate.responseStatusCodeValidation(r,200);
	   
   }
   
   @AfterSuite
   public void reports() throws Exception
   {
	   Xl.generateReport("../testResult.xlsx");
   }
   
	
}
