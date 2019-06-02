package org.testing.TestSteps;

import java.util.Properties;

import org.testing.Resources.Body;
import org.testing.Resources.ResponseBody;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {

	Response r;
	public Response PostRequest(Properties pr,Body body) // handle POJO
	{
		r=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty("Dev_URI"));
		
		return r;
	}
	
	
	public Response PostRequest(Properties pr,String body) // handle json
	{
		r=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty("Dev_URI"));
		
		return r;
	}
	
	
	public Response GetRequest(Properties pr,String id)
	{
		String uri=pr.getProperty("Dev_URI")+"/"+id;
	   r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
	   return r;
		
	}
	
	
}
