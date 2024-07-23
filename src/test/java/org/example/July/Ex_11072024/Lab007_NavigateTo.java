package org.example.July.Ex_11072024;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Lab007_NavigateTo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(500);

        //  // No back, forward allowed in case of get

        driver.navigate().to("https://google.com");
        Thread.sleep(500);
        driver.navigate().to("https://amazon.com");
        Thread.sleep(500);
        driver.navigate().to(new URL("https://facebook.com"));
        Thread.sleep(500);
        driver.navigate().back();
        System.out.println("Should be amazon - " + driver.getTitle());
        Thread.sleep(500);
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
