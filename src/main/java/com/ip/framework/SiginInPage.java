package com.ip.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiginInPage {
    WebDriver driver;
    public SiginInPage(WebDriver driver) {
        this.driver = driver;
    }


        By username = By.xpath ("//*[@id=\"identifierId\"]");
        By click = By.xpath ( "//*[@id=\"identifierNext\"]/div/button/div[2]" );
        By password = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input/");
        //By click = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
        By click1 = By.xpath ("//*[@id=\"passwordNext\"]/div/button/div[2]");

        public void setUsername(String strusername){
            driver.findElement ( username ).sendKeys ( strusername );

        }
      public void setClick(){
        driver.findElement(click).click ();

        // public void setpassword(String strpassword){
        //    driver.findElement ( password ).sendKeys ( strpassword );

       }
        public void setPassword(String strpassword){
        driver.findElement ( password ).sendKeys(strpassword );

        }


        public void setClick1(){
            driver.findElement(click).click ();

       // public void setpassword(String strpassword){
        //    driver.findElement ( password ).sendKeys ( strpassword );

        }


        }



