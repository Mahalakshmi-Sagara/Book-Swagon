package com.bs.qa.pages;

import com.bs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory - OR(Objects Repo):
//declaration
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement my_account;
    @FindBy(xpath = "//a[text()='Log in']")
    WebElement log_in;
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
    WebElement mobile_email;

    @FindBy(name = "ctl00$phBody$SignIn$txtPassword")
    WebElement password;

    @FindBy(xpath = "//a[@id='ctl00_phBody_SignIn_btnLogin']")
    WebElement LoginLnk;

    @FindBy(xpath = "//img[@id='ctl00_imglogo']")
    WebElement bsLogo;

    //Initializing the Page Objects:
    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    //Actions: or utilization
    public String validateLoginPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean validateBSImage() {
        return bsLogo.isDisplayed();
    }

    public void login(String me, String pass) throws InterruptedException {
//        my_account.click();
//        Thread.sleep(5000);
//        log_in.click();
        Thread.sleep(5000);
        mobile_email.sendKeys(me);
        password.sendKeys(pass);
        LoginLnk.click();
    }
}



