package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author bhanupriya
 */
public class FileUtility {
	
	/**
	 * This method will read data from property file value in string format
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./srs/test/resources/TestData/commondata.properties");
	    Properties prop=new Properties();
	    prop.load(fis);
	    return prop.getProperty(key);
	}

}
