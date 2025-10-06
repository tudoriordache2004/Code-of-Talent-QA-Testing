package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterWithCode {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://cotcampus.codeoftalent.com/login");

        WebElement registerCode = driver.findElement(By.className("have-code"));
        registerCode.click();

        String code = "grNTmJUN";

        for (int i = 0; i < code.length(); i++) {
            String fieldId = "app_user_registration_code_" + i;
            WebElement inputBox = driver.findElement(By.id(fieldId));
            inputBox.sendKeys(Character.toString(code.charAt(i)));
        }

        WebElement emailBox = driver.findElement(By.id("app_user_registration_email"));
        emailBox.sendKeys("tudor@test.com");

        WebElement repeatEmailBox = driver.findElement(By.id("app_user_registration_email2"));
        repeatEmailBox.sendKeys("tudor@test.com");

        WebElement nameBox = driver.findElement(By.id("app_user_registration_first_name"));
        nameBox.sendKeys("testnume");

        WebElement prenumeBox = driver.findElement(By.id("app_user_registration_last_name"));
        prenumeBox.sendKeys("testprenume");

        WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Register')]"));
        registerButton.click();

        WebElement password = driver.findElement(By.id("app_user_set_password_by_user_plainPassword"));
        password.sendKeys("TudorQACOT1!");

        WebElement repeatPassword = driver.findElement(By.id("app_user_set_password_by_user_plainPassword2"));
        repeatPassword.sendKeys("TudorQACOT1!");

        WebElement submitButton = driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block[type='submit']"));
        submitButton.click();

    }
}
