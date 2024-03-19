package com.bs.qa.pages;

import com.bs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestBookPage {
    @FindBy(xpath = "//a[.='Request a Book']")
    WebElement request_book;

    @FindBy(xpath = "//input[@name='ctl00$phBody$RequestBook$txtTitle']")
    WebElement book_title;

    @FindBy(xpath = "//input[@name='ctl00$phBody$RequestBook$txtQty']")
    WebElement quantity;

    public RequestBookPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    public void verifyRequestBook() {
        request_book.click();
    }

    public void verifyBookTitleTB() {
        book_title.click();
    }

    public void verifyQuantityTB() {
        quantity.click();
    }

}
