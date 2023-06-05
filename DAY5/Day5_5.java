package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_5 {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.smart-hospital.in/site/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
	driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
	String tag=driver.findElement(By.xpath("//*[@id=\'sibe-box\']/ul[2]/li[4]/a/span")).getTagName();
	String text=driver.findElement(By.xpath("//*[@id=\'sibe-box\']/ul[2]/li[4]/a/span")).getText();
	Dimension size=driver.findElement(By.id("search-btn")).getSize();
	String colour=driver.findElement(By.id("search-btn")).getCssValue("color");
	driver.findElement(By.name("search_text")).sendKeys("Arvind");
	driver.findElement(By.id("search-btn")).click();
	System.out.println("Tag: "+tag);
	System.out.println("Text: "+text);
	System.out.println("Size: "+size);
	System.out.println("Colour: "+colour);
}
}
