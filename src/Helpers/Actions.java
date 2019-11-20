package Helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


/**
 * This Class contains all reusable components to perform actions like send keys, click, select from dropdown etc.
 */
public class Actions extends IsElement
{
    public static String workingDir = System.getProperty("user.dir");
    public static String outputDir = "/test-output/results/";
    public static String date = new SimpleDateFormat("dd-MMM-yyyy_HH.mm.ss").format(new Date(System.currentTimeMillis()));
    public static Random random = new Random();


    /**
     * Clicks on a given element
     */
    public void Click(WebDriver driver, By locator)
    {
        if (super.Visible(driver, locator))
        {
            Scroll(driver, locator);
            Highlight(driver, locator);
            driver.findElement(locator).click();
        }
    }

    /**
     * Clicks on a given element
     */
    public void Click(WebDriver driver, WebElement element)
    {
        if (super.Visible(driver, element))
        {
            Scroll(driver, element);
            Highlight(driver, element);
            element.click();
        }
    }

    /**
     * Enters value on a given element
     */
    public void EnterText(WebDriver driver, By locator, String value)
    {
        if (super.Visible(driver, locator))
        {
            Scroll(driver, locator);
            Highlight(driver, driver.findElement(locator));
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(value);
        }
    }

    /**
     * Enters value on a given element
     */
    public void EnterText(WebDriver driver, WebElement element, String value)
    {
        if (super.Visible(driver, element))
        {
            Scroll(driver, element);
            Highlight(driver, element);
            element.clear();
            element.sendKeys(value);
        }
    }

    /**
     * Enters value on a given element and sends Enter
     */
    public void EnterText(WebDriver driver, By locator, String value, boolean sendEnter)
    {
        if (super.Visible(driver, locator))
        {
            Scroll(driver, locator);
            Highlight(driver, driver.findElement(locator));
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(value);
            if (sendEnter) { driver.findElement(locator).sendKeys(Keys.ENTER); }
        }
    }

    /**
     * Enters value on a given element and sends Enter
     */
    public void EnterText(WebDriver driver, WebElement element, String value, boolean sendEnter)
    {
        if (super.Visible(driver, element))
        {
            Scroll(driver, element);
            Highlight(driver, element);
            element.clear();
            element.sendKeys(value);
            if (sendEnter) { element.sendKeys(Keys.ENTER); }
        }
    }

    /**
     * Selects element 'by text' from Dropdown
     */
    public void SelectDropdownByText(WebDriver driver, By locator, String text)
    {
        if (super.Visible(driver, locator))
        {
            Scroll(driver, locator);
            Highlight(driver, locator);
            new Select(driver.findElement(locator)).selectByVisibleText(text);
        }
    }

    /**
     * Selects element 'by text' from Dropdown
     */
    public void SelectDropdownByText(WebDriver driver, WebElement element, String text)
    {
        if (super.Visible(driver, element))
        {
            Scroll(driver, element);
            Highlight(driver, element);
            new Select(element).selectByVisibleText(text);
        }
    }

    /**
     * Selects element 'by index' from Dropdown
     */
    public void SelectDropdownByIndex(WebDriver driver, By locator, int index)
    {
        if (super.Visible(driver, locator))
        {
            Scroll(driver, locator);
            Highlight(driver, locator);
            new Select(driver.findElement(locator)).selectByIndex(index);
        }
    }

    /**
     * Selects element 'by index' from Dropdown
     */
    public void SelectDropdownByIndex(WebDriver driver, WebElement element, int index)
    {
        if (super.Visible(driver, element))
        {
            Scroll(driver, element);
            Highlight(driver, element);
            new Select(element).selectByIndex(index);
        }
    }

    /**
     * Selects element 'by value' from Dropdown
     */
    public void SelectDropdownByValue(WebDriver driver, By locator, String value)
    {
        if (super.Visible(driver, locator))
        {
            Scroll(driver, locator);
            Highlight(driver, locator);
            new Select(driver.findElement(locator)).selectByValue(value);
        }
    }

    /**
     * Selects element 'by value' from Dropdown
     */
    public void SelectDropdownByValue(WebDriver driver, WebElement element, String value)
    {
        if (super.Visible(driver, element))
        {
            Scroll(driver, element);
            Highlight(driver, element);
            new Select(element).selectByValue(value);
        }
    }

    /**
     * Gets a list with all of the elements contained in dropdown
     */
    public List<WebElement> GetDropdownElementsList(WebDriver driver, By locator)
    {
        return new Select(super.ForElementToBeClickable(driver,locator)).getOptions();
    }

    /**
     * Gets a list with all of the elements contained in dropdown
     */
    public List<WebElement> GetDropdownElementsList(WebDriver driver, WebElement element)
    {
        return new Select(super.ForElementToBeClickable(driver,element)).getOptions();
    }

    /**
     * Gets a list with all elements' values contained in dropdown
     */
    public List<String> GetDropdownValuesList(WebDriver driver, By locator, String attribute)
    {
        List<WebElement> ddl = GetDropdownElementsList(driver, locator);
        List<String> valuesList = new ArrayList<>();

        for (WebElement elem : ddl)
        {
            valuesList.add(elem.getAttribute(attribute));
        }

        return valuesList;
    }

    /**
     * Gets a list with all elements' values contained in dropdown
     */
    public List<String> GetDropdownValuesList(WebDriver driver, WebElement element, String attribute)
    {
        List<WebElement> ddl = GetDropdownElementsList(driver, element);
        List<String> valuesList = new ArrayList<>();

        for (WebElement elem : ddl)
        {
            valuesList.add(elem.getAttribute(attribute));
        }

        return valuesList;
    }

    /**
     * Randomly selects a value from dropdown
     */
    public void RandomlySelectFromDropdown(WebDriver driver, By locator)
    {
        List<String> options = GetDropdownValuesList(driver, locator, "value");
        //options.subList(0, 1).clear();
        SelectDropdownByIndex(driver, locator, random.nextInt(options.size()));
    }

    /**
     * Randomly selects a value from dropdown
     */
    public void RandomlySelectFromDropdown(WebDriver driver, WebElement element)
    {
        List<String> options = GetDropdownValuesList(driver, element, "value");
        //options.subList(0, 1).clear();
        SelectDropdownByIndex(driver, element, random.nextInt(options.size()));
    }

    /**
     * Goes to the URL entered
     */
    public static void GoToUrl(WebDriver driver, String url)
    {
        driver.get(url);
    }

    /**
     * Gets the Element's text
     */
    public String GetText(WebDriver driver, By locator)
    {
        return GetAttribute(driver, locator, "textContent");
    }

    /**
     * Gets the Element's text
     */
    public String GetText(WebDriver driver, WebElement element)
    {
        return GetAttribute(driver, element, "textContent");
    }

    /**
     * Gets the Element's attribute
     */
    public String GetAttribute(WebDriver driver, By locator, String attribute)
    {
        return super.ForElementToBeVisible(driver, locator).getAttribute(attribute);
    }

    /**
     * Gets the Element's attribute
     */
    public String GetAttribute(WebDriver driver, WebElement element, String attribute)
    {
        return super.ForElementToBeVisible(driver, element).getAttribute(attribute);
    }

    /**
     * Highlights the element
     */
    public void Highlight(WebDriver driver, By locator)
    {
        for (int i = 0; i < 13; i++)
        {
            ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(locator),
                    "background-color: yellow; color: black; border: 2px solid red;");
        }

        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(locator), " ");
    }

    /**
     * Highlights the element
     */
    public void Highlight(WebDriver driver, WebElement element)
    {
        for (int i = 0; i < 13; i++)
        {
            ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
                    "background-color: yellow; color: black; border: 2px solid red;");
        }

        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style', arguments[1]);", element, " ");
    }

    /**
     * Scrolls to the element
     */
    public void Scroll(WebDriver driver, By locator)
    {
        super.ForElementToBeVisible(driver, locator);
        Scroll(driver, driver.findElement(locator));
    }

    /**
     * Scrolls to the element
     */
    public void Scroll(WebDriver driver, WebElement element)
    {
        String browser = GetBrowserName(driver);

        switch (browser)
        {
            case "FIREFOX":
            case "INTERNET EXPLORER":
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", element);
                break;
            case "CHROME":
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoViewIfNeeded(true);", element);
                break;
        }
    }

    /**
     * Gets the browser's name
     */
    public static String GetBrowserName(WebDriver driver)
    {
        return (((RemoteWebDriver)driver).getCapabilities()).getBrowserName().toString().toUpperCase();
    }

    /**
     * Takes a screenshot of the browser
     */
    public void TakeScreenshot(WebDriver driver, String pathToSave, String screenshotName) throws IOException
    {
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destination = pathToSave + screenshotName + ".jpg";
        FileUtils.copyFile(source, new File(destination));
    }

    /**
     * Generates a random string
     */
    public String GenRandomString()
    {
        return Long.toHexString(Double.doubleToLongBits(Math.random()));
    }

    /**
     * Generates a random string of integers
     */
    public String GenRandomIntegers(int size)
    {
        String values =  "0123456789";
        StringBuilder sb = new StringBuilder();

        for (int a = 0; a < size; a++)
        {
            sb.append(values.charAt(random.nextInt(values.length())));
        }

        return sb.toString();
    }




















}
