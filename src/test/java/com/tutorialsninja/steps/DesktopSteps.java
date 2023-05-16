package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HPLP3065Page;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DesktopSteps {
//
//        homePage.hoverOnDesktopsTabAndClick();

    //1.2 Click on “Show All Desktops”
    @And("^click on \"([^\"]*)\"$")
    public void clickOn(String showDesktop) {
         new HomePage().callSelectMenuMethodAndClick("Show AllDesktops");
    }
    //1.3 Select Sort By position "Name: Z to A"
    @And("^select sort by position \"([^\"]*)\"$")
    public void selectSortByPosition(String zToa) {
        new DesktopsPage().clickOnSortByDropDown();
        new DesktopsPage().selectNameZToAFromDropdown();
    }
    //1.4 Verify the Product will arrange in Descending order.
    @Then("^I can see the products in descending order$")
    public void iCanSeeTheProductsInDescendingOrder()throws InterruptedException {
        new DesktopsPage().verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }

    //2.3 Select Sort By position "Name: A to Z"
    @And("^select sort by the position \"([^\"]*)\"$")
    public void selectSortByThePosition(String aToz)  {
        new DesktopsPage().clickOnSortByDropDown();
        new DesktopsPage().selectNameAToZFromDropdown();
    }
    //2.4 Select product “HP LP3065”
    @And("^select product 'HP LP(\\d+)'$")
    public void selectProductHPLP(int arg0) {
        new DesktopsPage().selectHPLP3065();
    }
    //2.5 Verify the Text "HP LP3065"
    @Then("^I can see the text \"([^\"]*)\"$")
    public void iCanSeeTheText(String arg0)  {
        Assert.assertEquals(new HPLP3065Page().getTextHPLP3065(),"HP LP3065","Error");
    }
    //2.6 Select Delivery Date "2022-11-30"
    @And("^select delivery date '(\\d+)-(\\d+)-(\\d+)'$")
    public void selectDeliveryDate(int arg0, int arg1, int arg2) {
        new HPLP3065Page().selectDeliveryDate();
    }
    //2.7.Enter Qty "1” using Select class.
    @And("^enter qty (\\d+) using select class$")
    public void enterQtyUsingSelectClass(int arg0) {
        new HPLP3065Page().enterQuantity();
    }
    //2.8 Click on “Add to Cart” button
    @And("^click on 'Add to Cart' button$")
    public void clickOnAddToCartButton() {
        new HPLP3065Page().clickOnAddToCartButton();
    }
    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    //2.10 Click on link “shopping cart” display into success message
    @And("^I click on link 'shopping cart' display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        Assert.assertEquals(new HPLP3065Page().getTextMessageSuccess(),"Success: You have added HP LP3065 to your shopping cart!\n" +
                "×","Error");
        new HPLP3065Page().clickOnLinkShoppingCart();
    }
    //2.11 Verify the text "Shopping Cart"
    @Then("^I can see the text 'Shopping Cart'$")
    public void iCanSeeTheTextShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextShoppingCart(),"Shopping Cart  (1.00kg)","Error");
    }

    //2.12 Verify the Product name "HP LP3065"

    @Then("^I can see the Product name \"([^\"]*)\"$")
    public void iCanSeeTheProductName(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextProductName(),"HP LP3065","Error");
    }
    //2.13 Verify the Delivery Date "2022-11-30"
    @Then("^I can see the Delivery Date \"([^\"]*)\"$")
    public void iCanSeeTheDeliveryDate(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextDeliveryDate(),"Delivery Date:2022-11-30","Error");
    }
    //2.14 Verify the Model "Product21"
    @Then("^I can see the Model \"([^\"]*)\"$")
    public void iCanSeeTheModel(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextModel(),"Product 21","Error");
    }
    //2.15 Verify the Total "£74.73"
    @Then("^I can see the Total \"([^\"]*)\"$")
    public void iCanSeeTheTotal(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getTextTotal(),"$122.00","Error");
    }
}
