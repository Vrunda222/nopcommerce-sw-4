package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsMenu();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhonesSubMenu();
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals(electronicsPage.getTextFromTitle(), "Cell phones", "Page not redirected successfully");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicsMenu();
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhonesSubMenu();
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals(electronicsPage.getTextFromTitle(), "Cell phones", "Page not redirected successfully");
        //2.4 Click on List View Tab
        electronicsPage.clickOnListViewGrid();
        Thread.sleep(2000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        electronicsPage.clickOnProductName();
        //2.6 Verify the text “Nokia Lumia 1020”
        Assert.assertEquals(electronicsPage.getTextFromProductNameFromSingleProductPage(), "Nokia Lumia 1020");
        //2.7 Verify the price “$349.00”
        //Assert.assertEquals(electronicsPage.getTextFromPriceFromSingleProductPage(), "$349.00");

        //2.9 Click on “ADD TO CART” tab
        electronicsPage.clickOnAddToCartFromSingleProductPage();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        Assert.assertEquals(electronicsPage.GetTextFromProductSuccessMessageFromSingleProductPage(), "The product has been added to your shopping cart");
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicsPage.clickOnShoppingCartFromSingleProductPage();
        //2.12 Verify the message "Shopping cart"
        Assert.assertEquals(electronicsPage.getTextFromShoppingCartFromCartPage(), "Shopping cart");
        //2.13 Verify the quantity is 2
        //Assert.assertEquals(electronicsPage.getTextFromQtyFromCartPage(), "2");
        //2.14 Verify the Total $698.00
        //Assert.assertEquals(electronicsPage.getTextFromPriceFromCartPage(), "$698.00");
        //2.15 click on checkbox “I agree with the terms of service”
        electronicsPage.clickOnIAgreeCheckboxFromCartPage();
        //2.16 Click on “CHECKOUT”
        electronicsPage.clickOnCheckoutFromCartPage();
        Thread.sleep(3000);
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(electronicsPage.getTextFromWelcomeTextFromCheckoutPage(), "Welcome, Please Sign In!");
        //2.18 Click on “REGISTER” tab
        electronicsPage.clickOnRegisterTabFromCheckoutPage();
        //2.19 Verify the text “Register”
        Assert.assertEquals(electronicsPage.getTextFromRegistrationTitle(), "Register");
        //2.20 Fill the mandatory fields
        // enter firstname
        electronicsPage.addValueToFirstNameField();
        // enter lastname
        electronicsPage.addValueToLastNameField();
        // enter email
        electronicsPage.addValueToEmailField();
        // enter password
        electronicsPage.addValueToPasswordField();
        //enter confirm password
        electronicsPage.addValueToConfirmPasswordField();
        //2.21 Click on “REGISTER” Button
        electronicsPage.clickOnRegisterButton();
        Thread.sleep(3000);
        //2.22 Verify the message “Your registration completed”
        Assert.assertEquals(electronicsPage.getTextFromRegistrationSuccessMessage(), "Your registration completed");
        //2.23 Click on “CONTINUE” tab
        electronicsPage.clickOnContinueButton();
        Thread.sleep(3000);
        //2.24 Verify the text “Shopping cart”
        Assert.assertEquals(electronicsPage.getTextFromShoppingCartTitle(), "Shopping cart");
        //2.25 click on checkbox “I agree with the terms of service”
        electronicsPage.clickOnIAgreeCheckboxFromCartPage();
        //2.26 Click on “CHECKOUT”
        electronicsPage.clickOnCheckoutFromCartPage();
        Thread.sleep(3000);
        //2.27 Fill the Mandatory fields
        //enter firstname
        electronicsPage.addValueToFirstNameFieldInAddress();
        //enter lastname
        electronicsPage.addValueToLastNameFieldInAddress();
        // enter email
        //electronicsPage.addValueToEmailIdFieldInAddress();
        //Thread.sleep(6000);
        // select country
        electronicsPage.selectCountryFromDropdown();
        // enter city
        electronicsPage.addValueToCityFieldInAddress();
        // enter address
        electronicsPage.addValueToAddressFieldInAddress();
        // enter zip code
        electronicsPage.addValueToZipCodeFieldInAddress();
        // enter phone number
        electronicsPage.addValueToPhoneNumberFieldInAddress();
        //2.28 Click on “CONTINUE”
        electronicsPage.clickOnContinueButtonInBillingForm();
        Thread.sleep(3000);
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronicsPage.clickOnRadioButtonInShippingMethod();
        //2.30 Click on “CONTINUE”
        electronicsPage.clickOnContinueButtonInShippingMethod();
        //2.31 Select Radio Button “Credit Card”
        electronicsPage.clickRadioButtonCreditCard();
        electronicsPage.clickOnContinueButtonAfterPaymentMethod();
        //2.32 Select “Visa” From Select credit card dropdown
        electronicsPage.selectVisaFromDropdown();
        //2.33 Fill all the details
        // enter name
        electronicsPage.addNameInPaymentForm();
        // enter card number
        electronicsPage.addCardNumberInPaymentForm();
        // select expiry date
        electronicsPage.selectExpiryDateInPaymentForm();
        // select expiry year
        electronicsPage.selectExpiryYearInPaymentForm();
        // enter card code
        electronicsPage.addCardCodeInPaymentForm();

        //2.34 Click on “CONTINUE”
        electronicsPage.clickOnContinueButtonInPaymentInfo();
        Thread.sleep(3000);
        //2.35 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(electronicsPage.getTextFromPaymentMethodTitle(), "Credit Card");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Assert.assertEquals(electronicsPage.getTextFromShippingMethodTitle(), "2nd Day Air");
        //2.37 Verify Total is “$698.00”
        //Assert.assertEquals(electronicsPage.getTextFromTotalPriceTitle(), "$698.00");
        //2.38 Click on “CONFIRM”
        electronicsPage.clickOnConfirmButton();
        Thread.sleep(3000);
        //2.39 Verify the Text “Thank You”
        Assert.assertEquals(electronicsPage.getTextFromThankYouMessage(), "Thank you");
        //2.40 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(electronicsPage.GetTextFromOrderSuccessMessage(), "Your order has been successfully processed!");
        //2.41 Click on “CONTINUE”
        electronicsPage.clickOnContinueButtonAfterOrderSuccess();
        Thread.sleep(3000);
        //2.42 Verify the text “Welcome to our store”
        Assert.assertEquals(electronicsPage.getTextFromWelcomeMessage(), "Welcome to our store");
        //2.43 Click on “Logout” link
        electronicsPage.clickOnLogOutButton();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
    }
}
