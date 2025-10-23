package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBioAndImage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("tudor@test.com");
        password.sendKeys("TudorQACOT1!");

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        driver.findElement(By.xpath("//span[@name='testnume testprenume']")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a[href='https://cotcampus.codeoftalent.com/user/view']")).click();

        driver.findElement(By.id("edit_profile")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("front_profile_form_userProfileFile_file"))
                .sendKeys("C:\\Users\\tudor\\OneDrive\\Imagini\\Capturi de ecran\\Screenshot 2025-09-08 203618.png");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("div.ql-editor")).sendKeys("Test");

        Thread.sleep(1000);

        driver.findElement(By.id("crop_form_submit")).click();

    }
}
