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


    /** Login */
    public static By btnNext = By.xpath("//span[contains(text(),'NEXT')]");
    public static By btnStartNow = By.xpath("//span[contains(text(),'START NOW')]");
    public static By txtName = By.id("name");
    public static By txtPhone = By.id("phone");
    public static By btnFirstNotification = By.cssSelector("button[class='first-notification-button-submit button-secondary']");
    public static By btnEarlyAcces = By.cssSelector("a[href='https://www.yalochat.com/#form']");














}