package com.ip.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
    }
     By submit = By.xpath("//*[@id=\"gb\"]/div/div[2]/a");


    public void clickbtn(){

        driver.findElement ( submit ).click ();
    }

}

