package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
public class Day7_5 {
  @Test(groups= {"SmokeTest"})
  public void verify() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  String word = driver.getTitle();
	  Assert.assertEquals(word,driver.getTitle());
	  Thread.sleep(2000);
	  String url=driver.getCurrentUrl();
	  Assert.assertEquals(url,"https://www.godaddy.com/" );
	  driver.quit();
  }
  @SuppressWarnings("deprecation")
@Test(groups= {"RegressionTest"})
  public void search() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  driver.findElement(By.linkText("Domain Name Search")).click();
  } 
  @Test (groups = "regressiontest")
  public void TestCase3() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.navigate().to("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Domain Name Search")).click();
	  Thread.sleep(2000);
	  String head=driver.getTitle();
	  Assert.assertEquals(head, "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("mydomain");
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
	  
	  
	  Thread.sleep(3000);
	  JavascriptExecutor js=  (JavascriptExecutor) driver;
	  js.executeScript("windoe.scrollBy(0,300)", "");
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span")).isDisplayed();
  }

}