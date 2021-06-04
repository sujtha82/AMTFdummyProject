package com.ip.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty ("webdriver.chrome.driver" ,"C:\\Users\\BDAdmin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get ("https://www.google.com/" );
        driver.manage ().timeouts ().implicitlyWait ( 10 , TimeUnit.SECONDS );
     }

    @Test
    public void homepageTest() {
        HomePage hp = new HomePage ( driver );
        hp.clickbtn ();

      }
    @Test
    public void signinpageTest() {
        SiginInPage sp = new SiginInPage ( driver );
        sp.setUsername ( " sujatha.naren9@gamil.com" );
        sp.setClick ();
        sp.setPassword ( "Fremont9" );
        sp.setClick1 ();
     }
    public void teardown(){
        driver.close ();

     }

}
