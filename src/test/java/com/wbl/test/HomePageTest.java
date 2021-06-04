package com.wbl.test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage hm;

    @Test
    public void searchTest() {
        WebDriver driver = null;
        hm = new HomePage(driver);
        String actualTitle = hm.search(
                "Laptop");
       // Assert.assertEquals (actualTitle)
    }
}
