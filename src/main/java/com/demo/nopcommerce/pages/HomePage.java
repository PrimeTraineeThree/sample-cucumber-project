package com.demo.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;


    public void clickOnLoginLink() {
        Reporter.addStepLog("Clicking on login link : " + _loginLink.toString());
        clickOnElement(_loginLink);
        log.info("Clicking on login link : " + _loginLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.addStepLog("Clicking on register link : " + _registerLink.toString());
        clickOnElement(_registerLink);
        log.info("Clicking on register link : " + _registerLink.toString());
    }


}
