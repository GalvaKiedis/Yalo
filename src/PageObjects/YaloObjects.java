package PageObjects;

import org.openqa.selenium.*;


public class YaloObjects
{
    //region
        /**  Suggested naming conventions for Selenium identifiers
         * +----------+----------------------------+--------+-----------------+
         * | Category |      UI/Control type       | Prefix |     Example     |
         * +----------+----------------------------+--------+-----------------+
         * | Basic    | Button                     | btn    | btnExit         |
         * | Basic    | Check box                  | chk    | chkReadOnly     |
         * | Basic    | Combo box                  | cbo    | cboEnglish      |
         * | Basic    | Common dialog              | dlg    | dlgFileOpen     |
         * | Basic    | Date picker                | dtp    | dtpPublished    |
         * | Basic    | Dropdown List / Select tag | ddl    | ddlCountry      |
         * | Basic    | Form                       | frm    | frmEntry        |
         * | Basic    | Frame                      | fra    | fraLanguage     |
         * | Basic    | Image                      | img    | imgIcon         |
         * | Basic    | Label                      | lbl    | lblHelpMessage  |
         * | Basic    | Links/Anchor Tags          | lnk    | lnkForgotPwd    |
         * | Basic    | List box                   | lst    | lstPolicyCodes  |
         * | Basic    | Menu                       | mnu    | mnuFileOpen     |
         * | Basic    | Radio button / group       | rdo    | rdoGender       |
         * | Basic    | RichTextBox                | rtf    | rtfReport       |
         * | Basic    | Table                      | tbl    | tblCustomer     |
         * | Basic    | TabStrip                   | tab    | tabOptions      |
         * | Basic    | Text Area                  | txa    | txaDescription  |
         * | Basic    | Text box                   | txt    | txtLastName     |
         * | Complex  | Chevron                    | chv    | chvProtocol     |
         * | Complex  | Data grid                  | dgd    | dgdTitles       |
         * | Complex  | Data list                  | dbl    | dblPublisher    |
         * | Complex  | Directory list box         | dir    | dirSource       |
         * | Complex  | Drive list box             | drv    | drvTarget       |
         * | Complex  | File list box              | fil    | filSource       |
         * | Complex  | Panel/Fieldset             | pnl    | pnlGroup        |
         * | Complex  | ProgressBar                | prg    | prgLoadFile     |
         * | Complex  | Slider                     | sld    | sldScale        |
         * | Complex  | Spinner                    | spn    | spnPages        |
         * | Complex  | StatusBar                  | sta    | staDateTime     |
         * | Complex  | Timer                      | tmr    | tmrAlarm        |
         * | Complex  | Toolbar                    | tlb    | tlbActions      |
         * | Complex  | TreeView                   | tre    | treOrganization |
         * +----------+----------------------------+--------+-----------------+
         * */
    //endregion


    /** step1 */
    public static By btnEarlyAcces = By.cssSelector("a[href='https://www.yalochat.com/#form']");
    public static By btnNext = By.xpath("//span[contains(text(),'NEXT')]");
    public static By btnStartNow = By.xpath("//span[contains(text(),'START NOW')]");


    public static By txtName = By.id("name");
    public static By txtPhone = By.id("phone");
    public static By btnFirstNotification = By.cssSelector("button[class='first-notification-button-submit button-secondary']");
    public static By btnConfirm = By.xpath("//span[contains(text(),'Confirm')]");
    public static By btnContinue = By.xpath("//span[contains(text(),'Continue')]");
    public static By btnBack = By.xpath("//span[contains(text(),'Back')]");

    /** step3 */
    public static By ddlTemplate = By.id("template");
    public static By ddlOption1 = By.cssSelector("option[value='0']");
    public static By ddlOption2 = By.cssSelector("option[value='1']");
    public static By ddlOption3 = By.cssSelector("option[value='2']");
    public static By txtTemplate = By.id("templateText");
    public static By txtAmount = By.name("amount");
    public static By txtUserName = By.name("user.name");
    public static By txtClientName = By.name("client.name");
    public static By txtUserAccount= By.name("user.account");
    public static By txtdate= By.name("date");
    public static By btnSentMessage = By.xpath("//span[contains(text(),'Send test message')]");
















}