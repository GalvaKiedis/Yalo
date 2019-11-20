package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


/**
 * This Class contains all reusable components for the implicit wait
 */
public class Wait
{
    private long timeoutSeconds = Long.parseLong(Props.ExpectedConditionsTimeoutSeconds());


    /**
     * Waits until element is clickable
     */
    public WebElement ForElementToBeClickable(WebDriver driver, By selector)
    {
        return new WebDriverWait(driver, timeoutSeconds).until(ExpectedConditions.elementToBeClickable(selector));
    }

    /**
     * Waits until element is clickable
     */
    public WebElement ForElementToBeClickable(WebDriver driver, WebElement element)
    {
        return new WebDriverWait(driver, timeoutSeconds).until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Waits until element is visible
     */
    public WebElement ForElementToBeVisible(WebDriver driver, By selector)
    {
        return new WebDriverWait(driver, timeoutSeconds).until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    /**
     * Waits until element is visible
     */
    public WebElement ForElementToBeVisible(WebDriver driver, WebElement element)
    {
        return new WebDriverWait(driver, timeoutSeconds).until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits until all elements are visible
     */
    public List<WebElement> ForElementsToBeVisible(WebDriver driver, By selector)
    {
        return new WebDriverWait(driver, timeoutSeconds).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selector));
    }

    /**
     * Gets the current document.readyState
     */
    private String GetPageState(WebDriver driver)
    {
        return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString();
    }

    /**
     * Sleeps the driver until page is fully loaded
     */
    public void WaitForPageToBeLoaded(WebDriver driver) throws InterruptedException
    {
        while (!GetPageState(driver).equalsIgnoreCase("complete"))
        {
            Thread.sleep(1500);
        }
    }

    /**
     * Checks if element is displayed and waits until is not displayed
     */
    public void WhileElementIsVisible(WebDriver driver, By selector) throws InterruptedException
    {
        while (driver.findElement(selector).isDisplayed())
        {
            Thread.sleep(1500);
        }
    }










}
