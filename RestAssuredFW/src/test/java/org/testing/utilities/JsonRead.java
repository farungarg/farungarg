package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead {
	
	public static String json_read(String path) throws FileNotFoundException
	{
		File f=new File(path); // connection establish
		FileInputStream fi=new FileInputStream(f); // stream object
		JSONTokener js=new JSONTokener(fi); // jsontokener
		JSONObject j=new JSONObject(js);
				
	return j.toString();
			
	}

	
}
