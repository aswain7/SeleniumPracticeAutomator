package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo24 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement upload_button= driver.findElement(By.xpath("//input[@id='filesToUpload']"));
        String file1="C:\\Users\\amrit\\OneDrive\\Desktop\\Text1.txt";
        String file2="C:\\Users\\amrit\\OneDrive\\Desktop\\Text2.txt";
        upload_button.sendKeys(file1+"\n"+file2);
        Thread.sleep(5000);
        driver.quit();
    }
}
