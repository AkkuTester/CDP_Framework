package properties_Readers;

import java.io.FileReader;
import java.util.Properties;

public class NopCommerce_PropertiesReader {
	
	public static String filepath = "C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\NopCommerce\\TestingData/nopcommerce.properties";
	
	public static String getConfigValues(String fileLocation, String key) throws Exception {
		FileReader file = new FileReader(fileLocation);
		Properties property = new Properties();
		property.load(file);
		
		return property.getProperty(key);
	}

}
