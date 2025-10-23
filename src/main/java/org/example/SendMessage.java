package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendMessage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("tudor@test.com");
        password.sendKeys("TudorQACOT1!");

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        driver.findElement(By.cssSelector("a.dropdown-toggle[data-toggle='dropdown']")).click();

        Thread.sleep(1000);

        driver.findElement(By.linkText("Toate mesajele")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[normalize-space(.)='Compune']")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("span.caret")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[normalize-space(.)='Alina Stirbu']")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("send_message_form_message")).sendKeys("Mesaj test");

        driver.findElement(By.xpath("//button[normalize-space(.)='Trimite']")).click();

    }
}
