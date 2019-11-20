package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * This Class contains the Driver initialization
 */
public class Driver extends Actions
{
    private boolean headless     = Boolean.parseBoolean(Props.HeadlessMode());
    private long implicitlyWait  = Long.parseLong(Props.ImplicitlyWait());
    private long pageLoadTimeout = Long.parseLong(Props.PageLoadTimeout());

    /**
     * Returns the instance of the WebDriver
     */
    public WebDriver InitiateDriver()
    {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", workingDir + "/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        if (headless)
        {
            options.addArguments("window-size=1400,600");
            options.addArguments("headless");
        }

        WebDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }
}