package testCases;



import Components.Yalo;
import PageObjects.YaloObjects;
import com.aventstack.extentreports.Status;
import Helpers.BaseTC;
import org.testng.annotations.*;
import java.io.IOException;



public class forTesting extends BaseTC
{
    //@Test
    public void MTC001_TestNextButton() throws IOException
    {

        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowNext(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

   // @Test
    public void MTC002_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlow2Next(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

   // @Test
    public void MTC003_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlow3Next(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }

    //@Test
    public void MTC004_TestNextButton() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlow4Next(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }


   // @Test
    public void MTC005_TestGetEarlyAccess() throws IOException
    {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowGetEarlyAccess(driver,test);
        Reports.UpdateTestLog(driver, test, TestName, "NextButtonOK", Status.PASS);
    }


    @Test
    public void MTC006_YaloMainPageFlowFillFormByNextAU() throws IOException, InterruptedException {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowFillFormByNextAU(driver,test);
    }

    @Test
    public void MTC007_YaloMainPageFlowFillFormByStartAU() throws IOException
    {

        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowFillFormByStartAU(driver,test);

    }

    @Test
    public void MTC008_YaloMainPageFlowFillFormByStartPU() throws IOException, InterruptedException {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowFillFormByNextPU(driver,test);
    }

    @Test
    public void MTC009_YaloMainPageFlowFillFormByNextPU() throws IOException
    {

        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowFillFormByStartPU(driver,test);

    }

    @Test
    public void MTC010_YaloMainPageFlowFillFormByStartPF() throws IOException, InterruptedException {
        Yalo YaloComponent = new Yalo();
        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowFillFormByNextPF(driver,test);
    }

    @Test
    public void MTC011_YaloMainPageFlowFillFormByNextPF() throws IOException
    {

        TestName = new Object(){}.getClass().getEnclosingMethod().getName();
        test = Reports.AppendTest(report, TestName);
        Yalo.YaloMainPageFlowFillFormByStartPF(driver,test);

    }
}