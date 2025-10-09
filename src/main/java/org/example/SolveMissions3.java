package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SolveMissions3 {
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

        driver.findElement(By.cssSelector("a#ui-id-3.ui-tabs-anchor")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(), 'Nivel 9')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='https://cotcampus.codeoftalent.com/participant/training/start?mission=1235']")).click();

        Thread.sleep(1000);

        WebElement uploadInput = driver.findElement(By.cssSelector("input[type='file']"));

        uploadInput.sendKeys("random_image"); //assuming the image i want to send exists.

        driver.findElement(By.id("submit-form")).click();

        // the confirming button found in the other missions

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button#button-submit.btn.btn-primary")).click();







    }
    
}
