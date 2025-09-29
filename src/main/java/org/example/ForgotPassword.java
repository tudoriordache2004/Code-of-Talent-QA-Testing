package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
    public static void main(String[] args) {
        // Initialize browser
        WebDriver driver = new ChromeDriver();

        // Open login page
        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement forgotPasswordButton = driver.findElement(By.partialLinkText("Forgot password?"));
        forgotPasswordButton.click();

        // Login verify
        String expectedUrl = "https://cotcampus.codeoftalent.com/resetting/request";
        if (driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Faza 1 - site-ul e responsive la request");
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("test@gmail.com");
            WebElement resetButton = driver.findElement(By.xpath("//button[contains(text(), 'Reset password')]"));
            resetButton.click();
            String expectedResetUrl = "https://cotcampus.codeoftalent.com/resetting/check-email?username=test%40gmail.com";
            if (driver.getCurrentUrl().equals(expectedResetUrl)) {
                System.out.println("Faza 2 - site-ul e responsive la link-ul de reset");
            }
            else {
                System.out.println("Faza 2 a esuat - nu poti trimite link-ul de reset");
                driver.quit();
            }
        } else {
            System.out.println("Faza 1 a esuat - nu poti reseta parola");
            driver.quit();
        }





    }
}
