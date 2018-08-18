package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadObjectRepo {
	
	public static Properties getObjectRepository(String filename) throws Exception {
		
		final Properties prop = new Properties();
		
		String path = System.getProperty("user.dir");
		
		try {
			
			File file = new File(path + "/src/test/resources/ObjectRepository/"
					+ filename + ".properties");
			InputStream stream = new FileInputStream(file);
			prop.load(stream);
			
		} catch (Exception e) {
			
			throw new Exception("!! file not found !!");
			
		}
		
		return prop;
	}

}
