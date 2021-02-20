package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	public   String AUTOMATE_USERNAME = "BROWSERSTACK_USERNAME";
	public   String AUTOMATE_ACCESS_KEY = "BROWSERSTACK_ACCESS_KEY";
	public    String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";
	 
	public   WebDriver driver;
	
		
	
}
