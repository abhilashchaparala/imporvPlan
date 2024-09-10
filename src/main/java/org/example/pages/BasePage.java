package org.example.pages;

import com.microsoft.playwright.*;

public class BasePage {
    Page page;
    public Page initialise(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false));;
        return browser.newPage();
    }
}
