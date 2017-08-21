package CrmTest1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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
  public void f() throws InterruptedException {
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
   d.findElement(By.xpath("//input[@id='searchtb']")).sendKeys("con");
   d.findElement(By.xpath("//div/ol/li/label[contains(text(),'con+Int_4pane_conversiontab_test')]")).click();

 //Actions   
 Actions act=new Actions(d);
WebElement ele=d.findElement(By.xpath("[@id='ottv3tv']/li[1]"));
// //ul[@id='ottv3tv']/li[contains(text(),'New')]
// //ul[@id='ottv3tv']/li[1]
act.moveToElement(ele).build().perform();
Thread.sleep(15000);



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
