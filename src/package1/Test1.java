package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ProfilesIni profile = new ProfilesIni();
//        FirefoxProfile ffprofile = profile.getProfile("default");
//        WebDriver driver = new FirefoxDriver(ffprofile);
//		driver.get("https://facebook.com/");
		
//		ProfilesIni profile = new ProfilesIni();
//        FirefoxProfile ffprofile = profile.getProfile("default");
//		ffprofile.setPreference("browser.startup.homepage_override.mstone", "ignore");
//        ffprofile.setPreference("startup.homepage_welcome_url", "about:blank");
//        ffprofile.setPreference("startup.homepage_welcome_url.additional","about:blank");
//        ffprofile.setPreference("browser.startup.homepage","about:blank");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");

	}

}
