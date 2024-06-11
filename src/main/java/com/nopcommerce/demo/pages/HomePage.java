package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    String menu = PropertyReader.getInstance().getProperty("menu");
    String computerMenu = PropertyReader.getInstance().getProperty("computerMenu");
    String electronicsMenu = PropertyReader.getInstance().getProperty("electronicsMenu");
    String cellPhonesSubMenu = PropertyReader.getInstance().getProperty("cellPhonesSubMenu");


    By menuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='"+ menu  +"']");
    By computerMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='"+ computerMenu  +"']");
    By electronicsMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='"+ electronicsMenu  +"']");
    By cellPhonesSubMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='"+ cellPhonesSubMenu  +"']");



    public void clickOnMenuElement(){
        clickOnElement(menuLink);
    }
    public void clickOnComputerMenu(){
        clickOnElement(computerMenuLink);
    }
    public void mouseHoverOnElectronicsMenu(){
        mouseHoverToElement(electronicsMenuLink);
    }
    public void clickOnCellPhonesSubMenu(){
        clickOnElement(cellPhonesSubMenuLink);
    }


}
