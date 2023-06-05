package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_2 {
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String title=driver.getCurrentUrl();
		if(title.equals("https://j2store.net/free/"))
		{
			System.out.println("Url is Same");
		}
		else
		{
			System.out.println("Url is different");
		}
		driver.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
		if(driver.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("Url is Same");
		}
		else
		{
			System.out.println("Url is different");
		}
	}
}