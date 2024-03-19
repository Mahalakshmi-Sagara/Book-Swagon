package com.bs.qa.testcases;

import com.bs.qa.base.TestBase;
import com.bs.qa.pages.FictionBooksPage;
import com.bs.qa.pages.RequestBookPage;
import io.qameta.allure.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listener.Listeners.class)
public class RequestBookPageTest extends TestBase
{

    private RequestBookPage requestBookPage;

    @BeforeClass
    public void setUp() {
        // Initialize the driver and navigate to the Request book page if needed
        initialization();
        requestBookPage = new RequestBookPage();
    }
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("RequestBook Link is Working Fine")
    @Feature("Home")
    @Story("User is able to click RequestBook Link")
    public void verifyReqBook()
    {
        requestBookPage.verifyRequestBook();
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("BookTitleTB is Working Fine")
    @Feature("Home")
    @Story("User is able to add book title")
    public void verifyBook_title() {
        requestBookPage.verifyBookTitleTB();

    }

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("QuantityTB is Working Fine")
    @Feature("Home")
    @Story("User is able to add quantity")
    public void verifyQuantity_new() {
        requestBookPage.verifyQuantityTB();
        // Add assertions or verifications based on the expected behavior
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
