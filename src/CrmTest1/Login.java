package CrmTest1;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

import package1.AlertLib;

public class Login {
  @Test
  public void f() throws InterruptedException, AWTException {
	  FirefoxProfile ffprofile = new FirefoxProfile();
	  ffprofile.setPreference("dom.webnotifications.enabled", false);
	  //WebDriver driver = new FirefoxDriver();
	  WebDriver d=new FirefoxDriver(ffprofile);
	  d.get("http://btptal014/webclient/login.aspx");
	  d.manage().window().maximize();
	 d.findElement(By.xpath("//input[@id='username']")).sendKeys("deep");
	 d.findElement(By.xpath("//input[@id='password']")).sendKeys("d");
	 d.findElement(By.xpath("//input[@id='Submit']")).click();
  // System.out.println(d.switchTo().alert().getText());
   if(IsAlertPresent(d))
   {
	   Alert alert = d.switchTo().alert();
	   System.out.println(alert.getText());
       alert.accept();
       
    }
   Thread.sleep(10000);
   if(IsAlertPresent(d))
   {
	   Alert alert = d.switchTo().alert();
	   System.out.println(alert.getText());
       alert.accept();
       
    }
   d.findElement(By.xpath("//input[@id='searchtb']")).sendKeys("con");
   d.findElement(By.xpath("//div/ol/li/label[contains(text(),'con+Int_4pane_conversiontab_test')]")).click();

  
   
  // Robot class for Mouse hover
   
  d.findElement(By.xpath("//div/span[contains(text(),'con+Int_4pane_conversiontab_test')]")).click();;
   
  /* Point p = ele1.getLocation();
   int x=p.getX();
   int y=p.getY();
   Dimension d1=ele1.getSize();
   int h=d1.getWidth();
   int w=d1.getHeight();
   Robot r=new Robot();
   r.mouseMove(x+(w/2), y+(h/2)+ 80); */
  
   Thread.sleep(10000);
   
   Robot r=new Robot();
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_ALT);
   r.keyPress(KeyEvent.VK_N);
   
   r.keyRelease(KeyEvent.VK_CONTROL);
   r.keyRelease(KeyEvent.VK_ALT);
   r.keyRelease(KeyEvent.VK_N);
   
   d.findElement(By.xpath("")).click();
   
   Thread.sleep(10000);
   
   



  }
 
  //
private boolean IsAlertPresent(WebDriver d) {
	// TODO Auto-generated method stub
	try{
      d.switchTo().alert();
       // System.out.println(d.switchTo().alert().getText());
        return true;
        }
	catch(NoAlertPresentException ex){
    System.out.println("No Alert");
        return false;
        }
	//d.findElement(By.xpath("//div/ol/li/label[contains(text(),'con+Int_4pane_conversiontab_test')]")).sendKeys("con");
	
}
}
