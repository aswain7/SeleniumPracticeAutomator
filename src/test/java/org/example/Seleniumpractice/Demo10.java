package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo10 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> country=driver.findElements(By.xpath("//select[@class='form-control' and @id='country']//option"));
        System.out.println(country.size());
        for(WebElement country1:country){
            System.out.println(country1.getText());
        }
        driver.quit();

    }
}
