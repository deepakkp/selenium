package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver d=new FirefoxDriver();
	  d.get("http://btptal014/webclient/login.aspx");
	 d.findElement(By.xpath("//input[@id='username']")).sendKeys("deep");
	 d.findElement(By.xpath("//input[@id='password']")).sendKeys("d");
	 d.findElement(By.xpath("//input[@id='Submit']")).click();
	 Thread.sleep(10000);
	 d.findElement(By.className("i-home")).click();
	 
	  d.close();
	  
  }
}
