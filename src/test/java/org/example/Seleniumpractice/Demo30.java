package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Demo30 {
    public static void main(String[] args)  {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int total_links=links.size();
        System.out.println(total_links);
        int count=0;
        for(WebElement link:links){
            String hrefattr=link.getAttribute("href");
            if(hrefattr==null || hrefattr.isEmpty()){
                System.out.println("sorry this url is not brokem since its empty and contains null value");
                continue;
            }

            try {
                URL u1 = new URL(hrefattr);//convert the string to URL
                HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();//open the connection to server
                h1.connect();//connect to the server
                if(h1.getResponseCode()>=400){
                    System.out.println(h1+" Broken links");
                    count=count+1;
                }
                else{
                    System.out.println(h1+"woeking fine");
                }
            }
            catch (Exception e){

            }

        }
        System.out.println(count);
        driver.quit();
    }
}
