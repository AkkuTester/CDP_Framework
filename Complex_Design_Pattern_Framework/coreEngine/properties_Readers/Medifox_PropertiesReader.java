package properties_Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Medifox_PropertiesReader {

	public static String filepath = "C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\Medifox_Testing_Datas\\TestingData/medifox.properties";
	
	public static String getConfigValue(String filePath, String key) throws Exception {
		FileReader file = new FileReader(filePath);
		Properties property = new Properties();
		property.load(file);
		String keyValue = property.getProperty(key);
		return keyValue;
	}
}
