package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * This Class contains all reusable components for the implicit wait based on the properties displayed, enabled, selected, etc.
 */
public class IsElement extends Wait
{
    /**
     * Returns Displayed property of element
     */
    public boolean Visible(WebDriver driver, By selector)
    {
        return super.ForElementToBeVisible(driver, selector).isDisplayed();
    }

    /**
     * Returns Displayed property of element
     */
    public boolean Visible(WebDriver driver, WebElement element)
    {
        return super.ForElementToBeVisible(driver, element).isDisplayed();
    }

    /**
     * Returns Enabled property of element
     */
    public boolean Enabled(WebDriver driver, By selector)
    {
        return super.ForElementToBeVisible(driver, selector).isEnabled();
    }

    /**
     * Returns Enabled property of element
     */
    public boolean Enabled(WebDriver driver, WebElement element)
    {
        return super.ForElementToBeVisible(driver, element).isEnabled();
    }

    /**
     * Returns Selected property of element
     */
    public boolean Selected(WebDriver driver, By selector)
    {
        return super.ForElementToBeVisible(driver, selector).isSelected();
    }

    /**
     * Returns Selected property of element
     */
    public boolean Selected(WebDriver driver, WebElement element)
    {
        return super.ForElementToBeVisible(driver, element).isSelected();
    }

    /**
     * Returns Selected property of element
     */
    public boolean ContainingText(WebDriver driver, By selector, String searchTerm)
    {
        return super.ForElementToBeVisible(driver, selector).getText().toLowerCase().contains(searchTerm.toLowerCase());
    }

    /**
     * Returns element if inner text contains given value
     */
    public boolean ContainingText(WebDriver driver, WebElement element, String searchTerm)
    {
        return super.ForElementToBeVisible(driver, element).getText().toLowerCase().contains(searchTerm.toLowerCase());
    }









}
