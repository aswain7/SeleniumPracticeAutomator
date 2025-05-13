package org.example.Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo7 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(500)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement alert3button=driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        alert3button.click();
        Alert alert1=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert1.getText());
        alert1.accept();
        driver.quit();


    }
}
