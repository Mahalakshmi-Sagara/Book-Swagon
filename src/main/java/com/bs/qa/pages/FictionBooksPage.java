package com.bs.qa.pages;

import com.bs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionBooksPage extends TestBase {
    @FindBy(xpath = "//a[.='Fiction Books']")
    WebElement fiction_books;

    @FindBy(xpath = "(//span[@style='color: #d51912;'])[1]")
    WebElement collen;

    public FictionBooksPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyFictionBook() {
        fiction_books.click();
    }

    public void verifybook() {
        fiction_books.click();
        collen.click();
    }
}
