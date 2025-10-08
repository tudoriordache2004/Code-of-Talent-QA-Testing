package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SolveMissions2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("tudor@test.com");
        password.sendKeys("TudorQACOT1!");

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        WebElement startButton = driver.findElement(By.cssSelector("a.btn.btn-solve.btn-redesign.text-center.mr-5.ml-negative-45"));
        startButton.click();

        driver.findElement(By.cssSelector("a.btn.btn-solve.btn-redesign.btn-block")).click();

        Thread.sleep(2000);

        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox'][value='2210']"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }


        driver.findElement(By.cssSelector("button.btn.btn-primary.btn-next")).click();

        driver.findElement(By.xpath("//button[contains(., 'Trimite') or contains(., 'Înainte')]")).click();

        Thread.sleep(2000);

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[type='checkbox'][value='2215']"));
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(., 'Trimite') or contains(., 'Înainte')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button#button-submit.btn.btn-primary")).click();
    }
}
