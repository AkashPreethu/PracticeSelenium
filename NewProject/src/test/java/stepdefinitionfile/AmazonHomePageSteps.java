package stepdefinitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class AmazonHomePageSteps {

    // 3. Global alli assign madidini and context value null idhe we need to the value of textcontext to current cls context
    // By using this keyword
 TestContext context;  //context is a variable

   // 1. constructor create madi knowledge pass madta idivi (TestContext variable name-context)

   public AmazonHomePageSteps(TestContext context){  // 2. ivaga idhu local variable agide
       // 4. this keyword use madkondu context knowledge inject madbeku for particulat cls
    this.context = context;

   }

    @Given("user clicks the baby wishlist from accounts & lists")
    public void clickBabyWishlist(){

       context.pageObjectManager.getHomePage().clickBabyWish();

    }

    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {
      String actualTitle = context.pageObjectManager.getBabyWishListPage().getPageTitle();
        Assert.assertEquals("",actualTitle);
    }

    @And("click on Mobiles")
    public void clickOnMobiles() {
       context.pageObjectManager.getHomePage().clickMobiles();
    }
    public void clickmobile(){
       context.pageObjectManager.getHomePage().mobileMouseHover();
    }
}
