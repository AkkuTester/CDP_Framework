package properties_Readers;

import java.io.*;
import java.io.FileReader;
import java.util.Properties;

public class Knowledgeware_PropertiesReader {
	
	public static String filePath = "C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\Knowledgeware\\TestingData/knowledgeware.properties";
	
//	public static FileReader file = null;
//	public static Properties property = null;
//	
	/*public static String getUrlValue(String key) throws Exception {
		
		 try {
			file = new FileReader(filePath);
		} 
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		property.load(file);
		
		String url = property.getProperty(key);
		return url;
	}
	
	
	public static void setValues() throws Exception {
		file = new FileReader(filePath);
		property = new Properties();
		property.load(file);
	}
	public static String getUserName(String uname) {
		String userName = property.getProperty(uname);
		return userName;
	}
	public static String getPass(String pass) {
		String passw = property.getProperty(pass);
		return passw;
	}
	public static String getconfPass(String confpass) {
		String confpassw = property.getProperty(confpass);
		return confpassw;
	}*/
	/*
	 * this one line code to draw all the values from the config.properties
	 */
	public static String getConfigValues(String fileLocation, String key) throws Exception {
		FileReader file = new FileReader(fileLocation);
		Properties property = new Properties();
		property.load(file);
		
		return property.getProperty(key);
	}
	
}
