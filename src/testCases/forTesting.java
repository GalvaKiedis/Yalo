package testCases;



import Components.Yalo;
import PageObjects.YaloObjects;
import com.aventstack.extentreports.Status;
import Helpers.BaseTC;
import org.testng.annotations.*;
import java.io.IOException;



public class forTesting extends BaseTC
{
    @Test
    public void MTC001_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        YaloComponent.YaloMainPageFlowNext(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

    @Test
    public void MTC002_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        YaloComponent.YaloMainPageFlow2Next(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

    @Test
    public void MTC003_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        YaloComponent.YaloMainPageFlow3Next(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

    @Test
    public void MTC004_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        YaloComponent.YaloMainPageFlow4Next(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }


    @Test
    public void MTC005_TestGetEarlyAccess() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        YaloComponent.YaloMainPageFlowGetEarlyAccess(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

}