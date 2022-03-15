package com.abc.Commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {

	public static WebDriver Driver;
	public static Properties property;
	
	public void prctice1() {
		
		ReadProperty();
		String Browsername = property.getProperty("Browsername");
		if(Browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "ser/man/resources/chromedriver");
		 Driver = new ChromeDriver();
		 
		}else if(Browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "ser/man/resources/geckodriver");
		 Driver = new FirefoxDriver();
		}else {
		
		System.setProperty("webdriver.edge.driver", "ser/man/resources/msegdedriver");
		 Driver = new EdgeDriver();
		}
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
