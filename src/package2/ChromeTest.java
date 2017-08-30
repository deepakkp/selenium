package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Chromedriver\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  d.get("http://btptal014/webclient/login.aspx");
	 d.findElement(By.xpath("//input[@id='username']")).sendKeys("deep");
	 d.findElement(By.xpath("//input[@id='password']")).sendKeys("d");
	 d.findElement(By.xpath("//input[@id='Submit']")).click();
	 Thread.sleep(10000);
	 d.findElement(By.className("i-home")).click();
	 
	  d.close();
	  
  }
}
