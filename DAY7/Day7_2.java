package testing;

import org.testng.annotations.Test;

import org.testng.Assert;

public class Day7_2 {
	int num1=30;
	 int num2=10;
  @Test(priority = 1)
  public void addition() {
	int sum=num1+num2;
	Assert.assertEquals(sum, 40);  
  }
  @Test(priority = 2)
  public void subtraction() {
	int minus=num1-num2;
	Assert.assertEquals(minus, 20);  
  }
  @Test(priority = 3)
  public void multiplication() {
	int product=num1*num2;
	Assert.assertEquals(product, 300);  
  }
  @Test(priority = 4)
  public void division() {
	int quotient=num1/num2;
	Assert.assertEquals(quotient, 3);  
  }
}
