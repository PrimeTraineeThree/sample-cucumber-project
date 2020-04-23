package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        driver.quit();
    }



}
