package com.example.testing;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class day4_1_3 
{
	
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sample");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("sample1");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sample123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123abc");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)","");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();  
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        //driver.quit();
    }
}