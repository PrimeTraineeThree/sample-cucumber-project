package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jay
 */
public class LoginTest extends TestBase {

    HomePage homePage ;
    LoginPage loginPage;

    @Before
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test()
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }
}
