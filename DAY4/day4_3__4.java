package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_3__4 {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("ravi");
		 driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("ravi@gmaill.com");
		  driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("ram");
		  driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("ram@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy Birthday");
		  driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
		  Thread.sleep(2000);
	}

}
