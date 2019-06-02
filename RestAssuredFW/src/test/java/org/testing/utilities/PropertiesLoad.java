package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad 
{
   public Properties propertyFileLoad() throws IOException
   {
	   File f=new File("../RestAssuredFW/Env.properties");
	   FileInputStream fi=new FileInputStream(f);
	   Properties pr=new Properties();
	   pr.load(fi);
	   return pr;
   }
	
}
