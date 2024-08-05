package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.BabyWishListPage;
import pageobjects.HomePage;

public class PageObjectManager {
    public BabyWishListPage babyWishListPage;
    public HomePage homePage;
    public WebDriver driver;

    //create constructor and driver knowledge passed
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public BabyWishListPage getBabyWishListPage(){
        babyWishListPage = new BabyWishListPage(driver);
        return babyWishListPage;
    }

    public HomePage getHomePage(){
        homePage = new HomePage(driver);
        return homePage;

    }
}
