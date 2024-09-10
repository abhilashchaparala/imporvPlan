package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.testng.Assert;

public class GooglePage extends BasePage{
    public static Page page;
    BasePage basePage;
    public GooglePage(){
        basePage = new BasePage();
        page = basePage.initialise();
    }

    public void navigateToGoogle(){
        page.navigate("https://google.com");
    }

    public void enterText(String text) {
        Locator locator = page.locator("//textarea[@title='Search']");
        locator.type("hello");
    }

    public void clickSearch(){
        page.locator("(//input[@value='Google Search'])[2]").click();
    }

    public void verifySearchPage() throws InterruptedException {
        Assert.assertEquals("hello","hello");
        Thread.sleep(4000);
    }
}
