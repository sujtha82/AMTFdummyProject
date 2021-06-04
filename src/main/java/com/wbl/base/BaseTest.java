package com.wbl.base;

import com.wbl.utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver(
                "chrome");
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
