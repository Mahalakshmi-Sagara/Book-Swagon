package com.bs.qa.testcases;

import com.bs.qa.base.TestBase;
import com.bs.qa.pages.NewArrivalsPage;
import io.qameta.allure.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listener.Listeners.class)
public class NewArrivalsPageTest extends TestBase
{
    NewArrivalsPage newArrivalsPage;

    @BeforeClass
    public void setUp() {
        // Initialize the driver and navigate to the New Arrivals page if needed
        initialization();
        newArrivalsPage = new NewArrivalsPage();
    }
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("NewArrivals Link is Working Fine")
    @Feature("Home")
    @Story("User is able to click NewArrivals Link")
    public void verifyNewArrive()
    {
       newArrivalsPage.verifyNewArrivals();
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Language tab is Working Fine")
    @Feature("Home")
    @Story("User is able to select language")
    public void verifyLanguageTest() {
        newArrivalsPage.verifyLanguage();
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Binding tab is Working Fine")
    @Feature("Home")
    @Story("User is able to select Binding")
    public void verifyBindingTest() {
        newArrivalsPage.verifyBiding();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
