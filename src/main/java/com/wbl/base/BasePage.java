package com.wbl.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver ;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public String Search(String SearchData) {
        driver.findElement ( By.id ( "" ) ).sendKeys ();

        return driver.getTitle ();

    }
}
