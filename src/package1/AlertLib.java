package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

public class AlertLib {
public static void handleAlert(WebDriver ldriver){
	if(IsAlertPresent(ldriver)){
		Alert alert=ldriver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
}
public static boolean isAlertPresent(WebDriver ldriver){
	 
    try{

    ldriver.switchTo().alert();

    return true;

    }catch(NoAlertPresentException ex){

    return false;

    }

    }

	private static boolean IsAlertPresent(WebDriver ldriver) {
	// TODO Auto-generated method stub
	return false;
}
	public static void main(String[] args) {
		

	}

}
