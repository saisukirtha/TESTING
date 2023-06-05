package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3__2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String link="https://demo.opencart.com";
        //String link1="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
        driver.navigate().to(link);
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.name("search"));
        search.sendKeys("mobiles");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)","");
        Thread.sleep(5000);
        WebElement returns =driver.findElement(By.linkText("Returns"));
        returns.click();
        driver.navigate().back();
        //driver.quit();
        Thread.sleep(5000);
        WebElement gift =driver.findElement(By.linkText("Gift Certificates"));
        gift.click();
        driver.navigate().back();
	}
}