package tek.bdd.guardians.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser implements Browser {

	@Override
	public WebDriver openBrowser(String url) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		return driver;
	}

}
