package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.automationtesting.excelreport.Xl;
import org.testing.Resources.Body;
import org.testing.Resources.ResponseBody;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesLoad;
import org.testing.utilities.ResponseParsing;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TestCase1 
{
	 static String id_value;
   @Test
   public void tc1() throws IOException
   {
	  
	  PropertiesLoad p=new PropertiesLoad(); // object create
	  Properties properties=p.propertyFileLoad(); // method call
	  
	 /* Body body=new Body();  // body ready
	  body.setId("DE12");
	  body.setAge("27");
	  body.setFirstname("Deeepakk");
	  body.setLastname("chanana");
	  body.setDesignation("TL");
	  */
	String body=  JsonRead.json_read("../RestAssuredFW/src/test/java/org/testing/Resources/data.json");
	  HTTPMethods http=new HTTPMethods();  // object create
	  Response response=http.PostRequest(properties,body);  // post call
	  
	  
	  ResponseValidate.responseStatusCodeValidation(response,201); // response status code validate
	  
	 
	  ResponseParsing r=new ResponseParsing();
	  id_value=r.responseParse(response, "id").toString();
	
	 
       
   }
	
   

}
