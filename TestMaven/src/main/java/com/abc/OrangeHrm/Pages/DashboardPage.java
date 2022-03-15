package com.abc.OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
WebDriver driver;
	
	public DashboardPage (WebDriver driver ) {
		this.driver=driver;
	}
	
	public WebElement getDashboardLabel() {
		return driver.findElement(By.tagName("h1"));
	}

	public WebElement getDashboardClick() {
		return driver.findElement(By.xpath("//a[@href='/index.php/dashboard']"));
	}
}
