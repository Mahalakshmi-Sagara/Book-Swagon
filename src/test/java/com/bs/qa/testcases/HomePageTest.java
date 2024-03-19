package com.bs.qa.testcases;

import com.bs.qa.base.TestBase;
import com.bs.qa.pages.HomePage;
import com.bs.qa.pages.LoginPage;
import com.bs.qa.pages.NewArrivalsPage;
import com.bs.qa.util.TestUtil;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.*;
//@Listeners(Listener.Listeners.class)
public class HomePageTest extends TestBase
{
     HomePage homePage;

    @BeforeClass
    public void setUp() {
        initialization(); // Initialize the WebDriver and other setup from TestBase
        homePage = new HomePage();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("HomePageTitle is Working Fine")
    @Feature("Home")
    @Story("User is able to see the title")
    public void testHomePageTitle() {
        String title = homePage.verifyHomePageTitle();
        Assert.assertEquals(title, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com", "Incorrect Home Page Title");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("NewArrivals Link is Working Fine")
    @Feature("Home")
    @Story("User is able to click NewArrivals Link")
    public void testClickOnNewArrivalsLink() {
        homePage.clickOnNewArrivalsLink();
        // Add assertions or verifications based on the expected behavior after clicking the New Arrivals link
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("FictionBooks Link is Working Fine")
    @Feature("Home")
    @Story("User is able to click FictionBooks Link")
    public void testClickOnFictionBooksLink() {
        homePage.clickOnFictionBooksLink();
        // Add assertions or verifications based on the expected behavior after clicking the Fiction Books link
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("RequestBook Link is Working Fine")
    @Feature("Home")
    @Story("User is able to click RequestBook Link")
    public void testClickOnRequestBookLink() {
        homePage.clickOnRequestBookLink();
        // Add assertions or verifications based on the expected behavior after clicking the Request Book link
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

