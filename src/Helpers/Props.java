package Helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Props extends Actions
{
    private static Properties GetConfigFile()
    {
        Properties prop = new java.util.Properties();
        InputStream input = null;

        try {

            // load the properties file
            input = new FileInputStream(workingDir + "/src/Properties/Customer360.config");
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return prop;
    }

    public static String getProperty(String property)
    {
        return GetConfigFile().getProperty(property);
    }

    // Key properties
    public static String URL() { return getProperty("URL"); }
    public static String ExpectedConditionsTimeoutSeconds() { return getProperty("ExpectedConditionsTimeoutSeconds"); }
    public static String ImplicitlyWait() { return getProperty("ImplicitlyWait"); }
    public static String PageLoadTimeout() { return getProperty("PageLoadTimeout"); }
    public static String HeadlessMode() { return getProperty("HeadlessMode"); }









}

