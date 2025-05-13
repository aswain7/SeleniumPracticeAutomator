package org.example.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Demo21 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions act=new Actions(driver);
        WebElement inputArea1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));

        inputArea1.sendKeys("Welcome");

        //cntrl+A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //cntr+c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        //tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //cntr+v
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        WebElement compare_button= driver.findElement(By.xpath("//button[@class='compareButton btn btn-success']"));
        compare_button.click();

        WebElement confirmation= driver.findElement(By.xpath("//span[text()='The two texts are identical!']"));

        String confirmation_text=confirmation.getText();
        if(confirmation_text.equals("The two texts are identical!")){
            System.out.println("succesfully copied");

        }
        else{
            System.out.println("Failure");
        }

        Thread.sleep(5000);

        driver.quit();
    }
}
