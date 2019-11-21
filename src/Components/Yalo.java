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
        Click(driver, btnNext);
    }

    public void YaloMainPageFlow2Next(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnNext);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlow3Next(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlow4Next(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
    }

    public void YaloMainPageFlowGetEarlyAccess(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnEarlyAcces);
        Assert.assertEquals("https://www.yalochat.com/#form", driver.getCurrentUrl());
    }

    public void YaloMainPageFlowFillFormByNextAU(WebDriver driver, ExtentTest test) throws IOException, InterruptedException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
        Click(driver, btnNext);
        EnterText(driver,txtName,Props.Name());
        EnterText(driver,txtPhone,GenRandomIntegers(10));
        Click(driver,btnFirstNotification);
        Click(driver,btnConfirm);
        Click(driver,btnContinue);
        Click(driver,ddlOption1);
        WaitForPageToBeLoaded(driver);
        Assert.assertEquals("Hey {{user.name}}. I'm messaging you from {{client.name}} to let you know that I'll be using this chat to notify you about updates in your account {{user.account}}.", GetText(driver,txtTemplate));
        EnterText(driver,txtUserName,Props.UserName());
        EnterText(driver,txtClientName,Props.ClientName());
        EnterText(driver,txtUserAccount,Props.UserAccount());
        Click(driver,btnSentMessage);
        Click(driver,btnContinue);

    }

    public void YaloMainPageFlowFillFormByStartAU(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnStartNow);
        EnterText(driver,txtName,Props.Name());
        EnterText(driver,txtPhone,GenRandomIntegers(10));
        Click(driver,btnFirstNotification);
        Click(driver,btnConfirm);
        Click(driver,btnContinue);
        Click(driver,ddlOption1);
        ForElementToBeVisible(driver,txtTemplate);
        Assert.assertEquals("Hey {{user.name}}. I'm messaging you from {{client.name}} to let you know that I'll be using this chat to notify you about updates in your account {{user.account}}.", GetText(driver,txtTemplate));
        EnterText(driver,txtUserName,Props.UserName());
        EnterText(driver,txtClientName,Props.ClientName());
        EnterText(driver,txtUserAccount,Props.UserAccount());
        Click(driver,btnSentMessage);
        Click(driver,btnContinue);
    }

    public void YaloMainPageFlowFillFormByStartPU(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnStartNow);
        EnterText(driver,txtName,Props.Name());
        EnterText(driver,txtPhone,GenRandomIntegers(10));
        Click(driver,btnFirstNotification);
        Click(driver,btnConfirm);
        Click(driver,btnContinue);
        Click(driver,ddlOption2);
        ForElementToBeVisible(driver,txtTemplate);
        Assert.assertEquals("You received {{amount}} from {{user.name}} on {{client.name}} Mobile.", GetText(driver,txtTemplate));
        EnterText(driver,txtAmount,Props.amount());
        EnterText(driver,txtUserName,Props.UserName());
        EnterText(driver,txtClientName,Props.ClientName());
        Click(driver,btnSentMessage);
        Click(driver,btnContinue);
    }

    public void YaloMainPageFlowFillFormByNextPU(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnStartNow);
        EnterText(driver,txtName,Props.Name());
        EnterText(driver,txtPhone,GenRandomIntegers(10));
        Click(driver,btnFirstNotification);
        Click(driver,btnConfirm);
        Click(driver,btnContinue);
        Click(driver,ddlOption2);
        ForElementToBeVisible(driver,txtTemplate);
        Assert.assertEquals("You received {{amount}} from {{user.name}} on {{client.name}} Mobile.", GetText(driver,txtTemplate));
        EnterText(driver,txtAmount,Props.amount());
        EnterText(driver,txtUserName,Props.UserName());
        EnterText(driver,txtClientName,Props.ClientName());
        Click(driver,btnSentMessage);
        Click(driver,btnContinue);
    }

    public void YaloMainPageFlowFillFormByStartPF(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnStartNow);
        EnterText(driver,txtName,Props.Name());
        EnterText(driver,txtPhone,GenRandomIntegers(10));
        Click(driver,btnFirstNotification);
        Click(driver,btnConfirm);
        Click(driver,btnContinue);
        Click(driver,ddlOption3);
        ForElementToBeVisible(driver,txtTemplate);
        Assert.assertEquals("Hey {{user.name}}. A reminder from {{client.name}} that your payment due date is {{date}}. Your balance is {{amount}}.", GetText(driver,txtTemplate));
        EnterText(driver,txtUserName,Props.UserName());
        EnterText(driver,txtClientName,Props.ClientName());
        EnterText(driver,txtdate,Props.date());
        EnterText(driver,txtAmount,Props.amount());
        Click(driver,btnSentMessage);
        Click(driver,btnContinue);
    }

    public void YaloMainPageFlowFillFormByNextPF(WebDriver driver, ExtentTest test) throws IOException {
        GoToUrl(driver, Helpers.Props.URL());
        Click(driver, btnStartNow);
        EnterText(driver,txtName,Props.Name());
        EnterText(driver,txtPhone,GenRandomIntegers(10));
        Click(driver,btnFirstNotification);
        Click(driver,btnConfirm);
        Click(driver,btnContinue);
        Click(driver,ddlOption3);
        ForElementToBeVisible(driver,txtTemplate);
        Assert.assertEquals("Hey {{user.name}}. A reminder from {{client.name}} that your payment due date is {{date}}. Your balance is {{amount}}.", GetText(driver,txtTemplate));
        EnterText(driver,txtUserName,Props.UserName());
        EnterText(driver,txtClientName,Props.ClientName());
        EnterText(driver,txtdate,Props.date());
        EnterText(driver,txtAmount,Props.amount());
        Click(driver,btnSentMessage);
        Click(driver,btnContinue);
    }
}
