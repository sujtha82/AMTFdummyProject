package com.wbl.pages;

import com.wbl.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super ( driver );
    }

    public String search(String searchData) {
        driver.findElement ( By.id ( "global-search-input" )).sendKeys(searchData);
        driver.findElement(By.id("global-search-submit")).click();
        return  driver.getTitle ();



    }
}