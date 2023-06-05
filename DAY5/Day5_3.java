package com.example.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_3 {

	public static void main(String[] args) 
	{
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		driver.get("https://j2store.net/free/");
		driver.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
		List<WebElement> name=driver.findElements(By.className("product-title"));
		for(WebElement list:name)
		{
			System.out.print(list.getText()+",");
		}

	}
}