package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo13 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("No of rows "+rows.size());
        List<WebElement> coloumns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
        System.out.println("No of coloumns "+coloumns.size());
        List<WebElement> total_datas=driver.findElements(By.xpath("//table[@name='BookTable']//tr//td"));
        System.out.println("Total no of datas "+total_datas.size());
        for(int i=2;i< rows.size();i++){
            for(int j=1;j<= coloumns.size();j++){
               String DataTable=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
                System.out.print(DataTable+" | ");

            }
            System.out.println();

        }
        driver.quit();
    }
}
