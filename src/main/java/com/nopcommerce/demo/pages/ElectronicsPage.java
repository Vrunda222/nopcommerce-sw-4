package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    String firstName = PropertyReader.getInstance().getProperty("firstName");
    String lastName = PropertyReader.getInstance().getProperty("lastName");
    String emailId = PropertyReader.getInstance().getProperty("emailId");
    String password = PropertyReader.getInstance().getProperty("password");
    String confirmPassword = PropertyReader.getInstance().getProperty("confirmPassword");
    String countryDropdown = PropertyReader.getInstance().getProperty("countryDropdown");
    String city = PropertyReader.getInstance().getProperty("city");
    String address = PropertyReader.getInstance().getProperty("address");
    String zipCode = PropertyReader.getInstance().getProperty("zipCode");
    String phoneNumber = PropertyReader.getInstance().getProperty("phoneNumber");
    String creditCard = PropertyReader.getInstance().getProperty("creditCard");
    String cardNumber = PropertyReader.getInstance().getProperty("cardNumber");
    String expiryDate = PropertyReader.getInstance().getProperty("expiryDate");
    String expiryYear = PropertyReader.getInstance().getProperty("expiryYear");
    String cardCode = PropertyReader.getInstance().getProperty("cardCode");
    String email = PropertyReader.getInstance().getProperty("email");



    By titleText = By.xpath("//h1[normalize-space()='Cell phones']");
    By listViewGrid = By.xpath("//a[normalize-space()='List']");
    By productName = By.xpath("//a[normalize-space()='Nokia Lumia 1020']");
    By productNameFromSingleProductPage = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By addToCartFromSingleProductPage = By.xpath("//button[@id='add-to-cart-button-20']");
    By priceFromSingleProductPage = By.xpath("//span[@id='price-value-20']");
    By productSuccessMessageFromSingleProductPage = By.xpath("//p[@class='content']");
    By shoppingCartFromSingleProductPage = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartTextFromCartPage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By qtyFromCartPage = By.xpath("//input[@id='itemquantity11220']");
    By priceFromCartPage = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By iAgreeCheckboxFromCartPage = By.xpath("//input[@id='termsofservice']");
    By checkoutFromCartPage = By.id("checkout");
    By welcomeTextFromCheckoutPage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By registerTabFromCheckoutPage = By.xpath("//button[normalize-space()='Register']");
    By registrationTitleText = By.xpath("//h1[normalize-space()='Register']");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailIdField = By.name("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationSuccessMessage = By.xpath("//div[@class='result']");
    By continueButton = By.xpath("//a[normalize-space()='Continue']");
    By shoppingCartTitle = By.xpath("//h1[normalize-space()='Shopping cart']");
    By firstNameFieldInAddress = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameFieldInAddress = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailIdFieldInAddress = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryFromDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityFieldInAddress = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressFieldInAddress = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCodeFieldInAddress = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberFieldInAddress = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButtonInBillingForm = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");
    By radioButtonInShippingMethod = By.xpath("//input[@id='shippingoption_2']");
    By continueButtonInShippingMethod = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radioButtonCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By continueButtonAfterPaymentMethod = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By VisaFromDropdown = By.xpath("//select[@id='CreditCardType']");
    By nameInPaymentForm = By.xpath("//input[@id='CardholderName']");
    By cardNumberInPaymentForm = By.xpath("//input[@id='CardNumber']");
    By expiryDateInPaymentForm = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearInPaymentForm = By.xpath("//select[@id='ExpireYear']");
    By cardCodeInPaymentForm = By.xpath("//input[@id='CardCode']");
    By continueButtonInPaymentInfo = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By textFromPaymentMethodTitle = By.xpath("//span[normalize-space()='Credit Card']");
    By textFromShippingMethodTitle = By.xpath("//span[normalize-space()='2nd Day Air']");
    By textFromTotalPriceTitle = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By textFromThankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By textFromOrderSuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonAfterOrderSuccess = By.xpath("//button[normalize-space()='Continue']");
    By textFromWelcomeMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logOutButton = By.xpath("//a[normalize-space()='Log out']");




    public String getTextFromTitle(){
        return getTextFromElement(titleText);
    }
    public void clickOnListViewGrid(){
        clickOnElement(listViewGrid);
    }
    public void clickOnProductName(){
        clickOnElement(productName);
    }
    public String getTextFromProductNameFromSingleProductPage(){
        return getTextFromElement(productNameFromSingleProductPage);
    }
    public String getTextFromPriceFromSingleProductPage(){
        return getTextFromElement(priceFromSingleProductPage);
    }
    public void clickOnAddToCartFromSingleProductPage(){
        clickOnElement(addToCartFromSingleProductPage);
    }
    public String GetTextFromProductSuccessMessageFromSingleProductPage(){
        return getTextFromElement(productSuccessMessageFromSingleProductPage);
    }
    public void clickOnShoppingCartFromSingleProductPage(){
        clickOnElement(shoppingCartFromSingleProductPage);
    }
    public String getTextFromShoppingCartFromCartPage(){
        return getTextFromElement(shoppingCartTextFromCartPage);
    }
    public String getTextFromQtyFromCartPage(){
        return getTextFromElement(qtyFromCartPage);
    }
    public String getTextFromPriceFromCartPage(){
        return getTextFromElement(priceFromCartPage);
    }
    public void clickOnIAgreeCheckboxFromCartPage(){
        clickOnElement(iAgreeCheckboxFromCartPage);
    }
    public void clickOnCheckoutFromCartPage(){
        clickOnElement(checkoutFromCartPage);
    }
    public String getTextFromWelcomeTextFromCheckoutPage(){
        return getTextFromElement(welcomeTextFromCheckoutPage);
    }
    public void clickOnRegisterTabFromCheckoutPage(){
        clickOnElement(registerTabFromCheckoutPage);
    }
    public String getTextFromRegistrationTitle(){
        return getTextFromElement(registrationTitleText);
    }
    public void addValueToFirstNameField(){
        sendTextToElement(firstNameField, firstName);
    }
    public void addValueToLastNameField(){
        sendTextToElement(lastNameField, lastName);
    }
    public void addValueToEmailField(){
        sendTextToElement(emailIdField, emailId);
    }
    public void addValueToPasswordField(){
        sendTextToElement(passwordField, password);
    }
    public void addValueToConfirmPasswordField(){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getTextFromRegistrationSuccessMessage(){
        return getTextFromElement(registrationSuccessMessage);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String getTextFromShoppingCartTitle(){
        return getTextFromElement(shoppingCartTitle);
    }
    public void addValueToFirstNameFieldInAddress(){
        sendTextToElement(firstNameFieldInAddress, firstName);
    }
    public void addValueToLastNameFieldInAddress(){
        sendTextToElement(lastNameFieldInAddress, lastName);
    }
    public void selectCountryFromDropdown(){
        selectByVisibleTextFromDropDown(countryFromDropdown, countryDropdown);
    }
    public void addValueToEmailIdFieldInAddress(){
        sendTextToElement(emailIdFieldInAddress, email);
    }
    public void addValueToCityFieldInAddress(){
        sendTextToElement(cityFieldInAddress, city);
    }
    public void addValueToAddressFieldInAddress(){
        sendTextToElement(addressFieldInAddress, address);
    }
    public void addValueToZipCodeFieldInAddress(){
        sendTextToElement(zipCodeFieldInAddress, zipCode);
    }
    public void addValueToPhoneNumberFieldInAddress(){
        sendTextToElement(phoneNumberFieldInAddress, phoneNumber);
    }
    public void clickOnContinueButtonInBillingForm(){
        clickOnElement(continueButtonInBillingForm);
    }
    public void clickOnRadioButtonInShippingMethod(){
        clickOnElement(radioButtonInShippingMethod);
    }
    public void clickOnContinueButtonInShippingMethod(){
        clickOnElement(continueButtonInShippingMethod);
    }
    public void clickRadioButtonCreditCard(){
        clickOnElement(radioButtonCreditCard);
    }
    public void clickOnContinueButtonAfterPaymentMethod(){
        clickOnElement(continueButtonAfterPaymentMethod);
    }
    public void selectVisaFromDropdown(){
        selectByVisibleTextFromDropDown(VisaFromDropdown, creditCard);
    }
    public void addNameInPaymentForm(){
        sendTextToElement(nameInPaymentForm, firstName);
    }
    public void addCardNumberInPaymentForm(){
        sendTextToElement(cardNumberInPaymentForm, cardNumber);
    }
    public void selectExpiryDateInPaymentForm(){
        selectByVisibleTextFromDropDown(expiryDateInPaymentForm, expiryDate);
    }
    public void selectExpiryYearInPaymentForm(){
        selectByVisibleTextFromDropDown(expiryYearInPaymentForm, expiryYear);
    }
    public void addCardCodeInPaymentForm(){
        sendTextToElement(cardCodeInPaymentForm, cardCode);
    }
    public void clickOnContinueButtonInPaymentInfo(){
        clickOnElement(continueButtonInPaymentInfo);
    }
    public String getTextFromPaymentMethodTitle(){
        return getTextFromElement(textFromPaymentMethodTitle);
    }
    public String getTextFromShippingMethodTitle(){
        return getTextFromElement(textFromShippingMethodTitle);
    }
    public String getTextFromTotalPriceTitle(){
        return getTextFromElement(textFromTotalPriceTitle);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String getTextFromThankYouMessage(){
        return getTextFromElement(textFromThankYouMessage);
    }
    public String GetTextFromOrderSuccessMessage(){
        return getTextFromElement(textFromOrderSuccessMessage);
    }
    public void clickOnContinueButtonAfterOrderSuccess(){
        clickOnElement(continueButtonAfterOrderSuccess);
    }
    public String getTextFromWelcomeMessage(){
        return getTextFromElement(textFromWelcomeMessage);
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }

}
