package demo_Testings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesReaderDemo {	
	public static String getKeyValue(String fileLocation, String keyName) throws Exception {
		//first of all we need to read the file, from which we wanted to read the data
		// so for that we have file Reader class
		FileReader file = new FileReader(fileLocation);
		// so now we have read the file, we need to load it, and for that we have
		// as the file is .properties, we have a seperate class known as, Properties class
		
		Properties prop = new Properties();
		// now we need to load the file using prop instance
		prop.load(file);
		String keyValue = prop.getProperty(keyName);
		return keyValue;
	}
	
	public static void main(String[] args) {
		try {
		String keyVal =	getKeyValue("C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\TestData\\knowledgeware/config.properties",
					"cmp");
		System.out.println(keyVal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
