package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try {
        	String propertiesPath = System.getProperty("user.dir")+"/src/test/java/config/config.properties";
            FileInputStream inputStream = new FileInputStream(propertiesPath);
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
}
