package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@id='comboBox']")).click();
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='option']"));

        System.out.println(options.size());
        for (WebElement opt : options) {
            if (opt.getText().equals("Item 2")) {
                System.out.println(opt.getText());
                opt.click();


                Thread.sleep(5000);
            }

        }

        driver.quit();
    }


    }

