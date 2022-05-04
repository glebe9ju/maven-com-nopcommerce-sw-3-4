package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By clickOnComputerTab = By.partialLinkText("Computers");
    By verifyComputerTab  = By.xpath("//h1[contains(text(),'Computers')]");
    By clickOnElectronicTab = By.partialLinkText("Electronics");
    By verifyElectronicTab = By.xpath("//h1[contains(text(),'Electronics')]");
    By clickOnApparelTab = By.partialLinkText("Apparel");
    By verifyApparelTab = By.xpath("//h1[contains(text(),'Apparel')]");
    By clickOnDigitalDownTab = By.partialLinkText("Digital downloads");
    By verifyDigitalDownTab = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By clickOnBookTab = By.partialLinkText("Books");
    By verifyBookTab = By.xpath("//h1[contains(text(),'Books')]");
    By clickOnJewelryTab =By.partialLinkText("Jewelry");
    By verifyJewelryTab = By.xpath("//h1[contains(text(),'Jewelry')]");
    By clickOnGiftCardTab = By.partialLinkText("Gift Cards");
    By verifyGiftCardTab = By.xpath("//h1[contains(text(),'Gift Cards')]");

    public void clickOnComputer(){
        clickOnElement(clickOnComputerTab);
    }
    public String verifyComputer() {
        return getTextFromElement(verifyComputerTab);
    }
    public void clickOnElectronic(){
        clickOnElement(clickOnElectronicTab);
    }
    public String verifyElectronic() {
        return getTextFromElement(verifyElectronicTab);
    }
    public void clickOnApparel(){
        clickOnElement(clickOnApparelTab);
    }
    public String verifyApparel() {
        return getTextFromElement(verifyApparelTab);
    }
    public void clickOnDigitalDown(){
        clickOnElement(clickOnDigitalDownTab);
    }
    public String verifyDigital() {
        return getTextFromElement(verifyDigitalDownTab);
    }
    public void clickOnBook(){
        clickOnElement(clickOnBookTab);
    }
    public String verifyBook() {
        return getTextFromElement(verifyBookTab);
    }
    public void clickOnJewelry(){
        clickOnElement(clickOnJewelryTab);
    }
    public String verifyJewelry() {
        return getTextFromElement(verifyJewelryTab);
    }
    public void clickOnGiftCard(){
        clickOnElement(clickOnGiftCardTab);
    }
    public String verifyGifCard() {
        return getTextFromElement(verifyGiftCardTab);
    }






}
