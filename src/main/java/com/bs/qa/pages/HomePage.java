package com.bs.qa.pages;

import com.bs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "(//a[.='New Arrivals'])[1]")
    WebElement new_arrivals;

    @FindBy(xpath = "//a[.='Fiction Books']")
    WebElement fiction_books;

    @FindBy(xpath = "//a[.='Request a Book']")
    WebElement request_book;

    @FindBy(xpath = "//img[@alt='My Order']")
    WebElement my_order;

    @FindBy(xpath = "//img[@alt='Wishlist']")
    WebElement my_wishlist;

    //Initializing the Page Objects:
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }

    public void clickOnNewArrivalsLink() {
        new_arrivals.click();

    }

    public void clickOnFictionBooksLink() {
        new_arrivals.click();

    }

    public void clickOnRequestBookLink() {
        new_arrivals.click();
    }


}
