package com.abc.Commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//We are developing framework ---Skeleton --Chrome
public class BrowserLaunch {

	public static WebDriver Driver;
	public static Properties property;
	
	public void Browser_Initilisation() {
		
		ReadProperty();
		String Browsername = property.getProperty("Browsername");
		if(Browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		 Driver = new ChromeDriver();
		 Driver.manage().window().maximize();
		 
		}else if(Browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
		 Driver = new FirefoxDriver();
		}else {
		
		System.setProperty("webdriver.edge.driver","src/main/resources/msegdedriver.exe");
		 Driver = new EdgeDriver();
		}
		Driver.get(property.getProperty("Url"));
	}
	
	public static void ReadProperty() {
		try {
		    property = new Properties();
			property.load(new FileInputStream("src/main/resources/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}