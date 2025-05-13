package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo11 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement element=driver.findElement(By.xpath("//select[@class='form-control' and @id='country']"));
        Select dropdown=new Select(element);
        dropdown.selectByIndex(2);
        dropdown.selectByValue("germany");
        System.out.println("Selected: " + dropdown.getFirstSelectedOption().getText());
        driver.quit();
    }
}
