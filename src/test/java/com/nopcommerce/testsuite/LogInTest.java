package com.nopcommerce.testsuite;

import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    LoginPage logInPage = new LoginPage();
    TopMenuPage topMenuPage = new TopMenuPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        logInPage.clickOnLogIn();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = logInPage.verifyTextSignIn();
        Assert.assertEquals(actualMessage, expectedMessage, "text correct");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        logInPage.clickOnLogIn();
        logInPage.enterEmailId("katy123@yahoo.com");
        logInPage.enterPassWord("katy123");
        logInPage.clickLogInButton();
        String expectedLogOut = "Log out";
        String actualLogOut = logInPage.verifyLogOutButton();
        Assert.assertEquals(actualLogOut, expectedLogOut, "invalid message");
    }

    @Test
    public void verifyTheErrorMessage() {
        logInPage.clickOnLogIn();
        logInPage.enterEmailId("katy13@yahoo.com");
        logInPage.enterPassWord("katy123");
        logInPage.clickLogInButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = logInPage.verifyErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error in message");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        topMenuPage.clickOnComputer();
        String expectedComputerTab = "Computers";
        String actualComputerTab = topMenuPage.verifyComputer();
        Assert.assertEquals(actualComputerTab, expectedComputerTab, "invalid message");
        topMenuPage.clickOnElectronic();
        String expectedElectronicTab = "Electronics";
        String actualElectronicTab = topMenuPage.verifyElectronic();
        Assert.assertEquals(actualElectronicTab, expectedElectronicTab, "invalid message");
        topMenuPage.clickOnApparel();
        String expectedApparelTab = "Apparel";
        String actualApparelTab = topMenuPage.verifyApparel();
        Assert.assertEquals(actualApparelTab, expectedApparelTab, "invalid message");
        topMenuPage.clickOnDigitalDown();
        String expectedDigitalDownTab = "Digital downloads";
        String actualDigitalDownTab = topMenuPage.verifyDigital();
        Assert.assertEquals(actualDigitalDownTab, expectedDigitalDownTab, "invalid message");
        topMenuPage.clickOnBook();
        String expectedBookTab = "Books";
        String actualBookTab = topMenuPage.verifyBook();
        Assert.assertEquals(actualBookTab, expectedBookTab, "invalid message");
        topMenuPage.clickOnJewelry();
        String expectedJewelryTab = "Jewelry";
        String actualJewelryTab = topMenuPage.verifyJewelry();
        Assert.assertEquals(actualJewelryTab, expectedJewelryTab, "invalid message");
        topMenuPage.clickOnGiftCard();
        String expectedGiftCardTab = "Gift Cards";
        String actualGiftCardTab = topMenuPage.verifyGifCard();
        Assert.assertEquals(actualGiftCardTab, expectedGiftCardTab, "invalid message");
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        registerPage.clickOnRegisterLink();
        String expectedReg = "Register";
        String actualReg = registerPage.verifyRegi();
        Assert.assertEquals(actualReg, expectedReg, "invalid message");
        registerPage.selectGender("female");
        registerPage.enterFirstName("Katy");
        registerPage.enterPassWord("katy123");
        registerPage.selectDey("5 ");
        registerPage.selectMon("April");
        registerPage.selectYea("1914");
        registerPage.enterUser("katy223@yahoo.com");
        registerPage.enterPass("katy123");
        registerPage.conFirmpass("katy123");
        registerPage.clickOnRegi();
        String expectedRegis = "Your registration completed";
        String actualRegis = registerPage.verifyReg();
        Assert.assertEquals(actualRegis,expectedRegis,"invalid message");
    }
}

