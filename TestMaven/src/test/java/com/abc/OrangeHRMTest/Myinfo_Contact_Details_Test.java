package com.abc.OrangeHRMTest;

import com.abc.Commonfunctionality.BrowserLaunch;
import com.abc.OrangeHrm.Pages.Myinfo_Contact_Details_Page;

public class Myinfo_Contact_Details_Test extends BrowserLaunch{
	
public static void main(String[] args) throws InterruptedException {
	
	BrowserLaunch Browser = new BrowserLaunch();
	Browser.Browser_Initilisation();
	
	LoginPageTest loginpage = new LoginPageTest();
	loginpage.Login_Successfully("Admin", "admin123");
	
	Myinfo_Contact_Details_Test contact_detail_test = new Myinfo_Contact_Details_Test();
	

}
 Myinfo_Contact_Details_Page ContactDetailPage = new Myinfo_Contact_Details_Page(Driver);










}
