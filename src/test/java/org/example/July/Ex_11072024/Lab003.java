package org.example.July.Ex_11072024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lab003 {
    public static void main(String[] args) {

         SearchContext driver = new EdgeDriver();// Dynamic Dispatch (RunTime Polymorphism)

        // Possible but two functions, which is not much used.
        //driver.findElement()
        //driver.findElements()


        WebDriver driver2 = new EdgeDriver();

        // 12 which are good

         RemoteWebDriver driver3 = new EdgeDriver();
        // 15 which are good

        ChromiumDriver driver4 = new EdgeDriver();


         EdgeDriver driver5 = new EdgeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
//        ChromeDriver driver = new ChromeDriver();
//        EdgeDriver driver2 = new EdgeDriver();


        // 2  Do you want to run on Chrome then change to Edge ? -- user WebDriver
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver(); 90%



        // 3. do you want to run on multiple browsers?  -- use RemoteWebDriver
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)

    }
}
