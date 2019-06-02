package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseParsing {
	
	public Object responseParse(Response res,String jsonpath)
	{
   return res.jsonPath().get(jsonpath);	
	}

}
