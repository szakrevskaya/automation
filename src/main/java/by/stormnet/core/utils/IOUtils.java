package by.stormnet.core.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class IOUtils {
    public static String loadGenericProperty(String key, String fileName) {
        Properties props = new Properties();
        FileInputStream filePath = null;
        try {
            String filePathString = "src/main/resources/" + fileName + ".properties";
            filePath = new FileInputStream(filePathString);
            props.load(filePath);
            filePath.close();

        } catch (Exception e) {
        }
        return props.getProperty(key);
    }
}
