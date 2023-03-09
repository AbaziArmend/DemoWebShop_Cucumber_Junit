package configuration;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	
	private static String configfile = "myconfig.properties";
	private static Properties properties = loadProperties();
	
	public static String geturl() {
		String url = (String) properties.get("url");
		throwExceptionWhenNull("url", url);
		return url;
	}
	
	
	private static void throwExceptionWhenNull(String property, String Parameter) {
		if (Parameter == null) {
			throw new RuntimeException("Parameter: "+property+" nicht in der Konfigurationsdaten gefunden.");
		}
	}
	
	private static Properties loadProperties() {
		
		try {
			
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			
			Properties props = new Properties();
			
			InputStream inputStream = loader.getSystemResourceAsStream(configfile);
			
			props.load(inputStream);
			
			return props;
			
			
		} catch (Exception e) {
			throw new RuntimeException("Keine Konfigurationsdatei gefunden", e);
		}
	}

}
