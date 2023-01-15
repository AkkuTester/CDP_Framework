package data_Source;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesReader {
	
	// this method will read the key/value from the .properties file
	public static String getKeyValue(String fileLocation, String key) throws Exception {
	
		// file reader will read the file from the file location
		FileReader file = new FileReader(fileLocation);
		// now we have read the file from the fileLocation, now we want to load that file, so that
		// we can use the data from that file.
		// so we have a new class in java called as, Properties.
		
		//creating an instance of properties class
		Properties property = new Properties();
		//now we are loading the generated file
		// this contains all the keys/values now
		property.load(file);
		// in the following step we will retrieve the values associated with the passed keys
		// .getProperty(key) method will return the value of the passed key. 
	String value = property.getProperty(key); 
	
	return value;
	}
	
	/*
	 * main method
	 */
	//public static void main(String[] args) throws Exception {}
}
