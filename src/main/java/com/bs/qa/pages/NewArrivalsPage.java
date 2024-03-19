package com.bs.qa.pages;

import com.bs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArrivalsPage extends TestBase {
    @FindBy(xpath = "(//a[.='New Arrivals'])[1]")
    WebElement new_arrivals;
    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement language;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement binding;

    @FindBy(xpath = "(//img[@class='card-img-top bklazy'])[1]")
    WebElement book;

    @FindBy(xpath = "//select[@id='ddlSort']")
    WebElement sort;

    //Initializing the Page Objects:
    public NewArrivalsPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyNewArrivals() {
        new_arrivals.click();
    }

    public void verifyLanguage() {
        language.click();
    }

    public void verifyBiding() {
        binding.click();
    }


}
