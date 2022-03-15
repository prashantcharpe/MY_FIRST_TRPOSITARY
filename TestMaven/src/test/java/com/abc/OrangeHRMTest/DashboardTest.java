package com.abc.OrangeHRMTest;

import java.util.concurrent.TimeUnit;

import com.abc.Commonfunctionality.BrowserLaunch;
import com.abc.OrangeHrm.Pages.DashboardPage;
import com.abc.OrangeHrm.Pages.LoginPage;


public class DashboardTest {
	
public static void main(String[] args) throws InterruptedException {
	
	BrowserLaunch Driver = new BrowserLaunch();
	Driver.Browser_Initilisation();

	LoginPageTest logintext = new LoginPageTest();
	logintext.Login_Successfully("Admin", "admin123");
	
	DashboardTest obj = new DashboardTest();
	obj.test_dashboard_label();
	
}

DashboardPage dashpage= new DashboardPage(BrowserLaunch.Driver);

public void test_dashboard_label() throws InterruptedException {
	
	if(dashpage.getDashboardLabel().isDisplayed()) {
		Thread.sleep(3000);
		dashpage.getDashboardClick().click();
		System.out.println("dashboard is disply and clickable : pass");
	}else {
		System.out.println("dashboard is not disply and not clickable : fail");
	}
	
}



}
