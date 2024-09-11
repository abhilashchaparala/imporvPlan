package org.example.pages;

import com.microsoft.playwright.*;

public class BasePage {
    Page page;
    public Page initialise(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false));
        System.out.println("hello new quality issue");
        System.out.println("hello new quality issue");
for (int i =0;i<10;i++){
    System.out.println(i);
}
        for (int i =0;i<10;i++){
            System.out.println(i);
        }
        return browser.newPage();
    }
}
