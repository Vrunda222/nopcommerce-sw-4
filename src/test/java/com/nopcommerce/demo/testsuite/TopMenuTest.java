package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
HomePage homePage = new HomePage();

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    //1.2 This method should click on the menu whatever name is passed as parameter.

    public void selectMenu(String menu){
        homePage.clickOnMenuElement();
    }

    /**
     * 1.3. create the @Test method name verifyPageNavigation
     * use selectMenu method to select the Menu and click on it
     * and verify the page navigation.
     */
    @Test
    public void verifyPageNavigation(){
        //use selectMenu method to select the Menu and click on it
        selectMenu(PropertyReader.getInstance().getProperty("menu"));

        String menu = PropertyReader.getInstance().getProperty("menu");
        selectMenu(menu);

        // and verify the page navigation.
        String expectedUrl = "https://demo.nopcommerce.com/"+menu.toLowerCase();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl,"Page is not navigated properly");
    }

}
