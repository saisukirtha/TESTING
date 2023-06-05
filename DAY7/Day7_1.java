package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_1 {
  @Test
  public void verifyTitle() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, driver.getTitle());
  }
}
