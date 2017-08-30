package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IETest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.ie.driver","G:\\Selenium\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
	  WebDriver d=new InternetExplorerDriver();
	  d.get("http://btptal014/webclient/login.aspx");
	 d.findElement(By.xpath("//input[@id='username']")).sendKeys("deep");
	 d.findElement(By.xpath("//input[@id='password']")).sendKeys("d");
	 d.findElement(By.xpath("//input[@id='Submit']")).click();
	 Thread.sleep(10000);
	 d.findElement(By.className("i-home")).click();
	 
	  d.close();
	  
  }
}
