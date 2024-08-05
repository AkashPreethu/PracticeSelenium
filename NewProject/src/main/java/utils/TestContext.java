package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {

    public PageObjectManager pageObjectManager;
    public WebDriverManager webDriverManager;

    public TestContext() throws IOException {  //call constructor

        //Create object for WebDriver
         webDriverManager = new WebDriverManager();// instatiate the class and variable and methods inside the class

        //Create object for the pageobject manager
         pageObjectManager = new PageObjectManager(webDriverManager.getDriverDetails());//inside it wl pass driver knowledge we r clng the
        // method getdriverdetails frm the webdrivermanager

    }

}
