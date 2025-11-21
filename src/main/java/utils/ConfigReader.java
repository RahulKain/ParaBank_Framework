package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    private static final String filePath = "src/test/resources/config.properties";

    public static Properties loadProperties(String s) {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException e) {
            System.out.println("❌ Error loading properties file: " + e.getMessage());
        }
        return properties;
    }

    public static String get(String key) {
        if (properties == null) {
            loadProperties("src/test/resources/config/config.properties");
        }
        return properties.getProperty(key);
    }
}

