package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By logIn = By.xpath("//a[contains(text(),'Log in')]");
    By verifyText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailId = By.xpath("//input[@id='Email']");
    By passWord = By.xpath("//input[@id='Password']");
    By logInButton = By.xpath("//button[contains(text(),'Log in')]");
    By verifyLogOut = By.xpath("//a[contains(text(),'Log out')]");
    By verifyErrorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public void clickOnLogIn(){
        clickOnElement(logIn);
    }
    public String verifyTextSignIn(){
        return getTextFromElement(verifyText);
    }
    public void enterEmailId(String emil){
        sendTextToElement(emailId,emil);
    }
    public void enterPassWord(String pass){
        sendTextToElement(passWord,pass);
    }
    public void clickLogInButton(){
        clickOnElement(logInButton);
    }
    public String verifyLogOutButton(){
        return getTextFromElement(verifyLogOut);
    }
    public String verifyErrorMessage(){
        return getTextFromElement(verifyErrorMessage);
    }


}
