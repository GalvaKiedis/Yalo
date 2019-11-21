package Helpers;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import Components.Yalo;
import java.awt.*;
import java.io.File;
import java.io.IOException;


/**
 * This Class contains the Test Cases Base, pages, helpers, reports instances, etc.
 */
public class BaseTC extends Actions
{
    public WebDriver driver;
    public ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(new Reports().GetFullReportName("Execution_Report"));
    public ExtentReports report = new ExtentReports();
    public ExtentTest test;
    // Create pages instances
    public Yalo Yalo;
    // Create helpers instances
    public Actions Actions;
    public IsElement IsElement;
    public Wait Wait;
    public Reports Reports;
    public Props Props;

    // Variables
    public String TestName;


    /** Suite level annotations, will get executed only once after and before a Suite is run */
    @BeforeSuite
    public void BeforeSuite()
    {
        report.attachReporter(htmlReporter);
        // Pages instances
        Yalo = new Yalo();
        // Helpers instances
        Actions = new Actions();
        IsElement = new IsElement();
        Wait = new Wait();
        Reports = new Reports();
        Props = new Props();
    }

    @AfterSuite
    public void AfterSuite() throws IOException
    {
        File htmlReport = new File(workingDir + "/test-output/results/" + date + "/Execution_Report" + ".html");
        Desktop.getDesktop().browse(htmlReport.toURI());
    }


    /** Method level annotations, will get executed after and before each @Test is run */
    @BeforeMethod
    public void BeforeTest()
    {
        driver = new Driver().InitiateDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void TearDown()
    {
        Reports.FinalizeTest(test, report);
        System.out.println("Closing browser");
        driver.close(); // Close the browser window
        driver.quit();  // Close the console app used to kick off the browser window
    }



    @AfterMethod(alwaysRun = true)
    public void AfterMethod(ITestResult result) throws Exception
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            try
            {
                test.log(Status.FAIL, result.getThrowable());
                Reports.UpdateTestLog(driver, test, "Error", "Unexpected failure", Status.FAIL);
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }
        }


    }
}