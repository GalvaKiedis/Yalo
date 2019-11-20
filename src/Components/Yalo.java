package Components;

import Helpers.*;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import static PageObjects.YaloObjects.*;


public class Yalo extends BaseTC
{
    private static Reports Reports = new Reports();


    public void YaloMainPageFlowNext(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Reports.UpdateTestLog(driver, test,"Login Customer 360", "Login to 360 is successful", Status.PASS);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlow2Next(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Reports.UpdateTestLog(driver, test,"Login Customer 360", "Login to 360 is successful", Status.PASS);
        Click(driver, btnNext);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlow3Next(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Reports.UpdateTestLog(driver, test,"Login Customer 360", "Login to 360 is successful", Status.PASS);
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlow4Next(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Reports.UpdateTestLog(driver, test,"Login Customer 360", "Login to 360 is successful", Status.PASS);
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlowGetEarlyAccess(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Reports.UpdateTestLog(driver, test,"Login Customer 360", "Login to 360 is successful", Status.PASS);
        Click(driver, btnEarlyAcces);
        Assert.assertEquals("https://www.yalochat.com/#form", driver.getCurrentUrl());
    }
}
