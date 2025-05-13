package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Demo12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'fswFld') and .//span[text()='From']]"))).click();
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/input[1]")));

        inputField.sendKeys("Ban");
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//ul[@class='sc-12foipm-27 fOrNYO']//li")));

        // Iterate through the suggestions and click on "Bangalore Airport"
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().contains("Bengaluru International Airport")) {
                suggestion.click();
                break;
            }
        }
        Thread.sleep(10);
        driver.quit();
    }
    }

