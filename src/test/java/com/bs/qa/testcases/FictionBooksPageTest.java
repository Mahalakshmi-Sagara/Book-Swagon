package com.bs.qa.testcases;

import com.bs.qa.base.TestBase;
import com.bs.qa.pages.FictionBooksPage;
import io.qameta.allure.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listener.Listeners.class)
public class FictionBooksPageTest extends TestBase
{
    FictionBooksPage fictionBooksPage;

    @BeforeClass
    public void setUp() {
        // Initialize the driver and navigate to the Fiction Books page if needed
        initialization();
        fictionBooksPage = new FictionBooksPage();
    }
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("FictionBooks Link is Working Fine")
    @Feature("Home")
    @Story("User is able to click FictionBooks Link")
    public void verifyFicBook()
    {
        fictionBooksPage.verifyFictionBook();
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("BookVerification is Working Fine")
    @Feature("Home")
    @Story("User is able to select perticular books")
    public void verifyBookTest() {
        fictionBooksPage.verifybook();

        // Add assertions or verifications related to book selection
        // Example: Assert.assertTrue(fictionBooksPage.someElementAfterBookSelection.isDisplayed(), "Book selection failed");
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
