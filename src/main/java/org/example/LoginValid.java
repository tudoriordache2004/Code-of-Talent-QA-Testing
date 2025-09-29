package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValid {
    public static void main(String[] args)
    {
        // Firefox driver set
        System.setProperty("webdriver.gecko.driver", "/home/tudoriordache/Downloads/geckodriver-v0.36.0-linux64/geckodriver");

        // Initialize browser
        WebDriver driver = new FirefoxDriver();

        // Open login page
        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // valid credentials
        username.sendKeys("tudor-dimitrie.iordache@s.unibuc.ro");
        password.sendKeys("test123");

        // invalid credentials
//        username.sendKeys("gresit@gmail.com");
//        password.sendKeys("gresit");

        // Click login button
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        // Login verify
        String expectedUrl = "https://cotcampus.codeoftalent.com/participant/trainings";
        if (driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Test trecut!");
        } else {
            System.out.println("Test esuat!");
        }

        // Close browser
        driver.quit();
    }
}
