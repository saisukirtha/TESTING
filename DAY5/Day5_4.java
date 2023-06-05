package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_4{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}
}