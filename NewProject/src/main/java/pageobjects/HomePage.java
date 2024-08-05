package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterProductName(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

    }
public void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();

}

public void clickBabyWish(){

    WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    Actions actions = new Actions(driver);
    actions.clickAndHold(ele).build().perform();
    driver.findElement(By.linkText("Baby Wishlist")).click();

}
public void clickMobiles(){
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
}
public void mobileMouseHover(){
     WebElement  mouse = driver.findElement(By.xpath("//div[@id='nav-subnav']/a[2]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(mouse).build().perform();
        driver.findElement(By.cssSelector("#nav-flyout-aj\\:https\\:\\/\\/images-eu\\.ssl-images-amazon\\.com\\/images\\/G\\/31\\/img18\\/Electronics\\/Megamenu\\/megamenumar18f\\.json\\:subnav-sl-megamenu-1\\:0 > div.nav-template.nav-flyout-content > div > div:nth-child(2) > ul > li:nth-child(5) > a")).click();
}

}


















