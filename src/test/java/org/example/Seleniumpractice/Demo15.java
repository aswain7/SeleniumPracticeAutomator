package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tr"));
//        System.out.println(rows.size());

        List<WebElement> coloumns = driver.findElements(By.xpath("//table[@id='productTable']//tr//th"));
//        System.out.println(coloumns.size());

        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
//        System.out.println(pages.size());

        for (int k = 1; k <= pages.size(); k++) {
            driver.findElement(By.xpath("//ul[@id='pagination']//li["+k+"]//a")).click();
//            System.out.println("page no : "+k);
            for (int i = 1; i < rows.size(); i++) {
                for (int j = 1; j <= coloumns.size(); j++) {
                    WebElement data = driver.findElement(By.xpath("//table[@id='productTable']//tr[" + i + "]//td[" + j + "]"));
//                    System.out.print(data.getText() + " | ");
                    if(j==coloumns.size()){
                       String product_name= driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[2]")).getText();
                        if(product_name.toLowerCase().startsWith("s")){
                            System.out.println(product_name);
                            WebElement checkbutton=driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td["+j+"]//input"));
                            checkbutton.click();
                            Thread.sleep(3000);
                            if(checkbutton.isSelected()){
                                checkbutton.click();
                                Thread.sleep(3000);
                            }
                        }


                    }

                }
//                System.out.println();
            }
        }


            driver.quit();

        }
    }

