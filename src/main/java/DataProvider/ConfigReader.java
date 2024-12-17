package DataProvider;

import org.testng.Reporter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
    public static String getProperty(String key)
    {
        Properties property = new Properties();
        try {
            property.load(new FileInputStream(new File("./ConfigFiles/Config.properties")));
        } catch (IOException e)
        {
            Reporter.log("Something went wrong while reading Config file or loading file"+ e.getMessage());
        }
        String value = property.getProperty(key);
        return value;
    }

}
