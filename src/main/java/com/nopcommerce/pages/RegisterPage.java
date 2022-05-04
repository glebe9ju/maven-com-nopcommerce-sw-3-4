package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By clickOnRegLink = By.xpath("//a[contains(text(),'Register')]");
    By verifyRegister = By.xpath("//h1[contains(text(),'Register')]");
    By selectFemaleButton = By.xpath("//input[@id='gender-female']");
    By selectMaleButton = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By selectDay = By.xpath("//select[@name='DateOfBirthDay']");
    By selectMonth = By.xpath("//select[@name='DateOfBirthYear']");
    By selectYear = By.xpath("//select[@name='DateOfBirthYear']");
    By userName = By.xpath("//input[@id='Email']");
    By passWord = By.xpath("//input[@id='Password']");
    By confirmPass = By.xpath("//input[@id='ConfirmPassword']");
    By clickOnRegiButton = By.xpath("//button[@id='register-button']");
    By verifyRegis = By.xpath("//div[@class='result']");

    public void clickOnRegisterLink() {
        clickOnElement(clickOnRegLink);
    }
    public String verifyRegi() {
        return getTextFromElement(verifyRegister);
    }
    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("female")) {
            clickOnElement(selectFemaleButton);
        } else {
            clickOnElement(selectMaleButton);
        }
    }
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }
    public void enterPassWord(String last) {
        sendTextToElement(lastName, last);
    }
    public void selectDey(String d) {
        sendTextToElement(selectDay, d);
    }
    public void selectMon(String mon) {
        sendTextToElement(selectMonth, mon);
    }
    public void selectYea(String y) {
        sendTextToElement(selectYear, y);
    }
    public void enterUser(String name) {
        sendTextToElement(userName, name);
    }
    public void enterPass(String pass) {
        sendTextToElement(passWord, pass);
    }
    public void conFirmpass(String con) {
        sendTextToElement(confirmPass, con);
    }

    public void clickOnRegi() {
        clickOnElement(clickOnRegiButton);
    }
    public String verifyReg() {
       return getTextFromElement(verifyRegis);
    }
}

