package org.example.July.Ex_11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab005 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        // WebDriver driver2 = new WebDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();

    }
}
