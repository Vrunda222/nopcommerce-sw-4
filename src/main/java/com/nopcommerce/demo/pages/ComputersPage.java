package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    String desktopLink = PropertyReader.getInstance().getProperty("desktopLink");
    String processorDropdown = PropertyReader.getInstance().getProperty("processorDropdown");
    String ramDropdown = PropertyReader.getInstance().getProperty("ramDropdown");
    String firstName = PropertyReader.getInstance().getProperty("firstName");
    String lastName = PropertyReader.getInstance().getProperty("lastName");
    String email = PropertyReader.getInstance().getProperty("email");
    String countryDropdown = PropertyReader.getInstance().getProperty("countryDropdown");
    String city = PropertyReader.getInstance().getProperty("city");
    String address = PropertyReader.getInstance().getProperty("address");
    String zipCode = PropertyReader.getInstance().getProperty("zipCode");
    String phoneNumber = PropertyReader.getInstance().getProperty("phoneNumber");
    String creditCardDropdown = PropertyReader.getInstance().getProperty("creditCardDropdown");
    String cardHolderName = PropertyReader.getInstance().getProperty("cardHolderName");
    String cardNumber = PropertyReader.getInstance().getProperty("cardNumber");
    String expiryDate = PropertyReader.getInstance().getProperty("expiryDate");
    String expiryYear = PropertyReader.getInstance().getProperty("expiryYear");
    String cardCode = PropertyReader.getInstance().getProperty("cardCode");




    By desktopCategoryLink = By.xpath("//li[@class='inactive']//a[normalize-space()='"+ desktopLink  +"']");
    By sortBy = By.xpath("//select[@id='products-orderby']");
    By zToADropdown = By.xpath("//option[normalize-space()='Name: Z to A']");
    By productTitle = By.xpath("//h2[@class='product-title']/a");

    By aToZDropdown = By.xpath("//option[normalize-space()='Name: A to Z']");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    By titleText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processorFromDropdown = By.xpath("//select[@id='product_attribute_1']");
    By ramFromDropdown = By.xpath("//select[@id='product_attribute_2']");
    By hddRadioButton = By.xpath("//input[@id='product_attribute_3_7']");
    By osRadioButton = By.xpath("//input[@id='product_attribute_4_9']");
    By softwareCheckboxButtonOne = By.xpath("//input[@id='product_attribute_5_10']");
    By softwareCheckboxButtonThree = By.xpath("//input[@id='product_attribute_5_12']");
    By singleProductAddToCart = By.id("add-to-cart-button-1");
    By textFromSuccessMessage= By.xpath("//p[@class='content']");
    By crossButton= By.xpath("//span[@title='Close']");
    By hoverOnShoppingCart = By.xpath("//span[@class='cart-label']");
    By subMenuGoToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By textFromCartPage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By qtyTextField = By.xpath("//input[@id='itemquantity11248']");
    By totalFromSingleProductPage = By.xpath("//span[@id='price-value-1']");
    By totalFromCartPage = By.xpath("//span[@class='product-subtotal']");
    By checkboxIAgree = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.id("checkout");
    By textFromCheckoutPage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkoutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By valueToFirstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By valueToLastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By valueToEmailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryFromDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By valueToCityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By valueToAddressField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By valueToZipCodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By valueToPhoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");
    By nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_1']");
    By continueButtonNextNextDayAirRadioButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");
    By paymentMethodNextStepButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardFromDropdown = By.xpath("//select[@id='CreditCardType']");
    By valueToCardHolderNameField = By.xpath("//input[@id='CardholderName']");
    By valueToCardNumberField = By.xpath("//input[@id='CardNumber']");
    By expiryDateFromDropdown = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearFromDropdown = By.xpath("//select[@id='ExpireYear']");
    By valueToCardCodeField = By.xpath("//input[@id='CardCode']");
    By paymentInfoNextStepContinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By textFromPaymentMethod = By.xpath("//span[normalize-space()='Credit Card']");
    By textFromShippingMethod = By.xpath("//span[normalize-space()='Next Day Air']");
    By textFromTotalSummaryValue = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$1,475.00')]");
    By textFromThankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By textFromOrderSuccessfulMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By textFromWelcomeMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By continueButtonAfterProductSuccess = By.xpath("//button[normalize-space()='Continue']");



    public void clickOnDesktopMenuLink(){
        clickOnElement(desktopCategoryLink);
    }
    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void clickOnZToADropdown(){
        clickOnElement(zToADropdown);
    }

    /** 1.4 Verify the Product will arrange in Descending order. */

    public void verifyTheProductIsDisplayInAscendingOrDescendingOrder(){
        selectAllProductNames(productTitle);
    }

    public void clickOnAToZDropdown(){
        clickOnElement(aToZDropdown);
        //waitUntilVisibilityOfElementLocated(addToCart,4000);
    }
    public void clickOnAddToCart() throws InterruptedException {
     //  waitForElementWithFluentWait(addToCart,20, 3);
        Thread.sleep(2000);
       // waitUntilVisibilityOfElementLocated(addToCart,4000);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement demoAddToCart = wait.until(ExpectedConditions.presenceOfElementLocated(addToCart));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(demoAddToCart).perform();
//        actions.click();

        clickOnElement(addToCart);
    }
    public String getTitleText(){
        //waitForElementWithFluentWait(titleText,20, 3);
        return getTextFromElement(titleText);
    }
    public void selectProcessorFromDropdown(){
        selectByVisibleTextFromDropDown(processorFromDropdown, processorDropdown);
    }
    public void selectRamFromDropdown(){
        selectByVisibleTextFromDropDown(ramFromDropdown, ramDropdown);
    }
    public void clickOnHddRadioButton(){
        clickOnElement(hddRadioButton);
    }
    public void clickOnOsRadioButton(){
        clickOnElement(osRadioButton);
    }
    public void clickOnSoftwareCheckboxButtonOne(){
        clickOnElement(softwareCheckboxButtonOne);
    }
    public boolean resultOfSoftwareCheckboxButtonOne(){

        return false;
    }
    public void clickOnSoftwareCheckboxButtonThree(){
        clickOnElement(softwareCheckboxButtonThree);
    }
    public void clickOnSingleProductAddToCart(){
        clickOnElement(singleProductAddToCart);
    }
    public String getTextFromSuccessMessage(){
        return getTextFromElement(textFromSuccessMessage);
    }
    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }
    public void mouseHoverOnShoppingCart(){
        //waitForElementWithFluentWait(hoverOnShoppingCart,20, 3);
        mouseHoverToElement(hoverOnShoppingCart);
    }
    public void clickOnSubMenuGoToCart(){
        //waitForElementWithFluentWait(subMenuGoToCart,20, 3);
        clickOnElement(subMenuGoToCart);
    }
    public String getTextFromCartPage(){
       // waitForElementWithFluentWait(textFromCartPage,20, 3);
        return getTextFromElement(textFromCartPage);
    }
    public void clearTheTextFromTextField(){
        clearTheText(qtyTextField);
    }
    public void sendValueToTheTextFromTextField(){
        sendTextToElement(qtyTextField, "2");
    }
    public String getTotalFromSingleProductPage(){
        return getTextFromElement(totalFromSingleProductPage);
    }
    public String getTotalFromCartPage(){
        return getTextFromElement(totalFromCartPage);
    }
    public void clickOnCheckboxIAgree(){
        clickOnElement(checkboxIAgree);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }
    public String getTextFromCheckoutPage(){
        return getTextFromElement(textFromCheckoutPage);
    }
    public void clickOnCheckoutAsGuestButton(){
        clickOnElement(checkoutAsGuestButton);
    }
    public void sendValueToFirstNameField(){
        sendTextToElement(valueToFirstNameField, firstName);
    }
    public void sendValueToLastNameField(){
        sendTextToElement(valueToLastNameField, lastName);
    }
    public void sendValueToEmailField(){
        sendTextToElement(valueToEmailField, email);
    }
    public void selectCountryFromDropdown(){
        selectByVisibleTextFromDropDown(countryFromDropdown, countryDropdown);
    }
    public void sendValueToCityField(){
        sendTextToElement(valueToCityField, city);
    }
    public void sendValueToAddressField(){
        sendTextToElement(valueToAddressField, address);
    }
    public void sendValueToZipCodeField(){
        sendTextToElement(valueToZipCodeField, zipCode);
    }
    public void sendValueToPhoneNumberField(){
        sendTextToElement(valueToPhoneNumberField, phoneNumber);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayAirRadioButton);
    }
    public void clickOnContinueButtonNextNextDayAirRadioButton(){
        clickOnElement(continueButtonNextNextDayAirRadioButton);
    }
    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
    }
    public void clickOnPaymentMethodNextStepButton(){
        clickOnElement(paymentMethodNextStepButton);
    }
    public void selectCreditCardFromDropdown(){
        selectByVisibleTextFromDropDown(creditCardFromDropdown, creditCardDropdown);
    }
    public void sendValueToCardHolderNameField(){
        sendTextToElement(valueToCardHolderNameField, cardHolderName);
    }
    public void sendValueToCardNumberField(){
        sendTextToElement(valueToCardNumberField, cardNumber);
    }
    public void selectExpiryDateFromDropdown(){
        selectByVisibleTextFromDropDown(expiryDateFromDropdown, expiryDate);
    }
    public void selectExpiryYearFromDropdown(){
        selectByVisibleTextFromDropDown(expiryYearFromDropdown, expiryYear);
    }
    public void sendValueToCardCodeField(){
        sendTextToElement(valueToCardCodeField, cardCode);
    }
    public void clickOnPaymentInfoNextStepContinueButton(){
        clickOnElement(paymentInfoNextStepContinueButton);
    }
    public String getTextFromPaymentMethod(){
        return getTextFromElement(textFromPaymentMethod);
    }
    public String getTextFromShippingMethod(){
        return getTextFromElement(textFromShippingMethod);
    }
    public String getTextFromTotalSummaryValue(){
        return getTextFromElement(textFromTotalSummaryValue);
    }
    public String getTextFromOrderSuccessfulMessage(){
        return getTextFromElement(textFromOrderSuccessfulMessage);
    }
    public String getTextFromThankYouMessage(){
        return getTextFromElement(textFromThankYouMessage);
    }
    public String getTextFromWelcomeMessage(){
        return getTextFromElement(textFromWelcomeMessage);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public void clickOnContinueButtonAfterProductSuccess(){
        clickOnElement(continueButtonAfterProductSuccess);
    }

}
