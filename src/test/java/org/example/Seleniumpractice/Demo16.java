package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Demo16  {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(5)));
        driver.get("https://demoqa.com/menu");
//        WebElement widget=driver.findElement(By.xpath("//div[@class='category-cards']//div[4]"));
//        widget.click();
//        WebElement Menu=driver.findElement(By.xpath("//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-7']"));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='element-list collapse show']//ul[@class='menu-list']//li[@id='item-7']")));
//        Menu.click();
        WebElement MainItem2=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        WebElement sub_list=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        Actions hover=new Actions(driver);
        //mouse hover action
        Action check=hover.moveToElement(MainItem2).moveToElement(sub_list).build();
        check.perform();


        driver.quit();


    }
}
