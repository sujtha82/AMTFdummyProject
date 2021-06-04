package com.wbl.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WebDriverUtil {
    @Test

    public static WebDriver getDriver(@org.jetbrains.annotations.NotNull String browserName) {
        WebDriver driver;
        switch (browserName) {
            case "chrome":
                System.setProperty ( "webdriver.chrome.driver" , "C:/Users/BDAdmin/IdeaProjects/SeleniumMaven/src/main/java/resources/chromedriver.exe" );

                driver = new ChromeDriver ();
                break;
            case "firefox":
                System.setProperty ( "webdriver.gecko.driver" , System.getProperty ( "user.dir" ) + "//resources//geckodriver.exe" );
                driver = new FirefoxDriver ();
                break;


            default:
                System.setProperty ( "webdriver.chrome.driver" , "C:/Users/BDAdmin/IdeaProjects/SeleniumMaven/src/main/java/resources/chromedriver.exe" );
                driver = new ChromeDriver ();
        }
        return driver;

    }




 }

