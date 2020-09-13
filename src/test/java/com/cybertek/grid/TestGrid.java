package com.cybertek.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestGrid {

    static WebDriver driver;
    static String nodeURL;

    public static void main(String[] args) {
        try {
        nodeURL = "http://192.168.1.49:4444/wd/hub";

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.MAC);


            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
            driver.get("http://www.amazon.in");
            driver.findElement(By.linkText("Today's Deals")).click();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
