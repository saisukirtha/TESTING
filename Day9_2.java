package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day09_02 {
	WebDriver driver;;
  @Test
  public void testCase1() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.navigate().to("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.godaddy.com/en-in" );
//	  driver.quit();
	  System.out.println("Thread Count is : "+ Thread.currentThread().getId());
  }
  
  @Test
