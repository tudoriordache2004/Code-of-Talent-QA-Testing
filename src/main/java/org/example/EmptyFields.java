package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyFields {
    public static void main(String[] args) {
        // Initialize browser
        WebDriver driver = new ChromeDriver();

        // Open login page
        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // valid credentials
        username.sendKeys("");
        password.sendKeys("");

        // Click login button
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        String expectedUrl = "https://cotcampus.codeoftalent.com/login";

        if (driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Login esuat cu succes -- please fill out the fields");
        } else {
            System.out.println("Eroare la login, login-ul a avut loc");
        }
    }
}
