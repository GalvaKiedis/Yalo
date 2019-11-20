package Helpers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;


/**
 * This Class contains all reusable components for the Extent Reports
 */
public class Reports extends Actions
{
    private void CreateResultsDirectory()
    {
        String resultsDir = workingDir + outputDir + date;
        boolean tmpDir = new File(resultsDir).exists();

        if (!tmpDir)
        {
            new File(resultsDir + "/Screenshots").mkdirs();
        }
    }

    public String GetFullReportName(String reportName)
    {
        CreateResultsDirectory();
        return workingDir + outputDir + date +  "/" + reportName + ".html";
    }

    public ExtentTest AppendTest(ExtentReports extentReport, String testName)
    {
        return extentReport.createTest(testName);
    }

    public void FinalizeTest(ExtentTest extentTest, ExtentReports extentReport)
    {
        try
        {
            extentReport.flush();
        }
        catch (Exception ex)
        {
            extentTest.log(Status.FAIL, ex);
        }
    }

    public void UpdateTestLog(WebDriver driver, ExtentTest extentTest, String testName, String testStep, Status testStatus) throws IOException
    {
        if (testStatus == Status.INFO)
        {
            extentTest.log(testStatus, testStep);
        }
        else
        {
            String ssPath = workingDir + outputDir + date + "/Screenshots/";
            String ssName = testName+ "_" + testStep + "_" + GenRandomString() + "_" + date;
            TakeScreenshot(driver, ssPath, ssName);

            extentTest.log(testStatus, testStep);
            extentTest.info("", MediaEntityBuilder.createScreenCaptureFromPath(".\\Screenshots\\" + ssName + ".jpg").build());
        }
    }










}
