package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ComputersTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        //1.2 Click on Desktop
        computersPage.clickOnDesktopMenuLink();
        //1.3 Select Sort By position "Name: Z to A"
        computersPage.clickOnSortBy();
        computersPage.clickOnZToADropdown();
        //1.4 Verify the Product will arrange in Descending order.
      //  computersPage.verifyTheProductIsDisplayInAscendingOrDescendingOrder();

        /** Repeat code with A to Z */

        //1.3 Select Sort By position "Name: A to Z"
        computersPage.clickOnSortBy();
        computersPage.clickOnAToZDropdown();
        //1.4 Verify the Product will arrange in Ascending order.

        List<WebElement> jacketsElementsList = getListOfElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: A to Z");

        Thread.sleep(1000);

        // After Sorting value
        jacketsElementsList = getListOfElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();

        Thread.sleep(1000);

        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER); // Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        //2.2 Click on Desktop
        computersPage.clickOnDesktopMenuLink();
        //2.3 Select Sort By position "Name: A to Z"
        computersPage.clickOnSortBy();
        computersPage.clickOnAToZDropdown();
        //2.4 Click on "Add To Cart"
        computersPage.clickOnAddToCart();
        //2.5 Verify the Text "Build your own computer"
        String actualMessage = computersPage.getTitleText();
        Assert.assertEquals(actualMessage,"Build your own computer", "Page is not navigated correctly");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computersPage.selectProcessorFromDropdown();
        //2.7.Select "8GB [+$60.00]" using Select class.
        computersPage.selectRamFromDropdown();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        computersPage.clickOnHddRadioButton();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computersPage.clickOnOsRadioButton();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
       // computersPage.clickOnSoftwareCheckboxButtonOne();
        computersPage.clickOnSoftwareCheckboxButtonThree();
        //2.11 Verify the price "$1,475.00"
        //Assert.assertEquals(computersPage.getTotalFromSingleProductPage(),"Shopping cart","Page is not navigated properly");
        //2.12 Click on "ADD TO CARD" Button.
        computersPage.clickOnSingleProductAddToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        Assert.assertEquals(computersPage.getTextFromSuccessMessage(),"The product has been added to your shopping cart", "Product does not added successfully");
        computersPage.clickOnCrossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computersPage.mouseHoverOnShoppingCart();
        computersPage.clickOnSubMenuGoToCart();
        //2.15 Verify the message "Shopping cart"
        Assert.assertEquals(computersPage.getTextFromCartPage(),"Shopping cart","Page is not navigated properly");
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        //computersPage.clearTheTextFromTextField();
        //computersPage.sendValueToTheTextFromTextField();
        //Thread.sleep(8000);
        //2.17 Verify the Total"$2,950.00"
        //Assert.assertEquals(computersPage.getTotalFromCartPage(),"$2,950.00","Price is not matching");
        //2.18 click on checkbox “I agree with the terms of service”
        computersPage.clickOnCheckboxIAgree();
        //2.19 Click on “CHECKOUT”
        computersPage.clickOnCheckoutButton();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(computersPage.getTextFromCheckoutPage(),"Welcome, Please Sign In!","Page is not navigated properly");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        computersPage.clickOnCheckoutAsGuestButton();
        //2.22 Fill the all mandatory field
        //enter firstname
        computersPage.sendValueToFirstNameField();
        //enter lastname
        computersPage.sendValueToLastNameField();
        //enter email
        computersPage.sendValueToEmailField();
        // select country
        computersPage.selectCountryFromDropdown();
        //Add city
        computersPage.sendValueToCityField();
        //Add address
        computersPage.sendValueToAddressField();
        //Add zip code
        computersPage.sendValueToZipCodeField();
        //Add phone number
        computersPage.sendValueToPhoneNumberField();
        //2.23 Click on “CONTINUE”
        computersPage.clickOnContinueButton();
        Thread.sleep(3000);
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        computersPage.clickOnNextDayAirRadioButton();
        //2.25 Click on “CONTINUE”
        computersPage.clickOnContinueButtonNextNextDayAirRadioButton();
        //2.26 Select Radio Button “Credit Card”
        computersPage.clickOnCreditCardRadioButton();
        computersPage.clickOnPaymentMethodNextStepButton();
        //2.27 Select “Master card” From Select credit card dropdown
        computersPage.selectCreditCardFromDropdown();
        //2.28 Fill all the details
        //add cardholder name
        computersPage.sendValueToCardHolderNameField();
        //add card number
        computersPage.sendValueToCardNumberField();
        // select expiry date
        computersPage.selectExpiryDateFromDropdown();
        // select expiry year
        computersPage.selectExpiryYearFromDropdown();
        // add card code
        computersPage.sendValueToCardCodeField();
        //2.29 Click on “CONTINUE”
        computersPage.clickOnPaymentInfoNextStepContinueButton();
        Thread.sleep((3000));
        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(computersPage.getTextFromPaymentMethod(), "Credit Card","Payment method is not credit card");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(computersPage.getTextFromShippingMethod(), "Next Day Air","Shipping method is not Next Day Air");
        //2.33 Verify Total is “$2,950.00”
        //Assert.assertEquals(computersPage.getTextFromTotalSummaryValue(), "$2,950.00","Total is not matching");
        //2.34 Click on “CONFIRM”
        computersPage.clickOnConfirmButton();
        //2.35 Verify the Text “Thank you”
        Assert.assertEquals(computersPage.getTextFromThankYouMessage(), "Thank you");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(computersPage.getTextFromOrderSuccessfulMessage(), "Your order has been successfully processed!");
        //2.37 Click on “CONTINUE”
        computersPage.clickOnContinueButtonAfterProductSuccess();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(computersPage.getTextFromWelcomeMessage(), "Welcome to our store","Page is not redirected properly");
    }

}
