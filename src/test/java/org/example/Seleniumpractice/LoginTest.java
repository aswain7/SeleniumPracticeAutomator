package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement waiter= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        waiter.sendKeys("Admin");
        WebElement waiter1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        waiter1.sendKeys("admin123");
        WebElement waiter2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")));
        waiter2.click();

//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://www.orangehrm.com/");
        System.out.println(driver.getCurrentUrl());

        String Title=driver.getTitle();
        System.out.println(Title);


        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        String orgTitle= driver.getTitle();
        System.out.println(orgTitle);
        System.out.println(driver.getWindowHandles());
        driver.quit();
    }
}
