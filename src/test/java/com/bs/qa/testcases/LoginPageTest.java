package com.bs.qa.testcases;

import com.bs.qa.base.TestBase;
import com.bs.qa.pages.HomePage;
import com.bs.qa.pages.LoginPage;
import com.bs.qa.util.TestUtil;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
//@Listeners(Listener.Listeners.class)
public class LoginPageTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;
    TestUtil util;

    public LoginPageTest()
    {
        super();
    }

    @BeforeMethod
  public void setUp()
  {
     initialization();
      loginPage = new LoginPage();
      util = new TestUtil();
    }


    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("LoginPageTitle is Working Fine")
    @Feature("Login")
    @Story("User is able to see the title")
    public void loginPageTitleTest()
    {
        String title = loginPage.validateLoginPageTitle();
       // Assert.assertEquals(title, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com ");
        Assert.assertEquals(title,"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.BLOCKER)
    @Description("bsLogo is Working Fine")
    @Feature("Login")
    @Story("User is able to see the logo")
    public void bsLogoImageTest()
    {
        boolean flag = loginPage.validateBSImage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Login feature is Working Fine")
    @Feature("Login")
    @Story("User is able to login to the application")
    public void loginTest() throws InterruptedException {
         loginPage.login(prop.getProperty("mobile_email"), prop.getProperty("password"));
    }
    @DataProvider
    public Object[][] TestData(){
        Object data[][] = util.getTestData("Sheet1");
        return data;
    }

@Test(dataProvider="TestData")
@Severity(SeverityLevel.BLOCKER)
@Description("Login feature is working for multiple users")
@Feature("Login")
@Story("Multiple user is able to login to the application")
    public void Multi_loginTest(String UserName, String Password) throws InterruptedException
    {
        loginPage.login(UserName,Password);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
