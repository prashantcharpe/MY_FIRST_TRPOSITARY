package com.abc.OrangeHRMTest;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.abc.Commonfunctionality.BrowserLaunch;
import com.abc.OrangeHrm.Pages.DashboardPage;
import com.abc.OrangeHrm.Pages.LoginPage;
import com.abc.OrangeHrm.Pages.MyInfo_Personal_Details_Page;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {

		
		
		// Login with valid credential
		BrowserLaunch Browser = new BrowserLaunch();
		Browser.Browser_Initilisation();
		LoginPageTest logintext = new LoginPageTest();
		
		logintext.Login_InSuccessfully("admin", "admin");
		logintext.LogoImgDisply();
		logintext.logInPanelHeadingDisply();
		logintext.TextField();
		logintext.LoginButton();
		logintext.ForgotPassword();
		logintext.SocialMedia();

		logintext.Login_Successfully("Admin", "admin123");

	}
	LoginPage loginpage = new LoginPage(BrowserLaunch.Driver);
	
	public void Login_InSuccessfully(String username, String password) throws InterruptedException {


		loginpage.getUsernameText().sendKeys(username);
		Thread.sleep(2000);
		loginpage.getPasswordText().sendKeys(password);
		Thread.sleep(2000);
		loginpage.getLoginbtn().click();

		Thread.sleep(1000);
		if (loginpage.getinvalidMessageLabel().isDisplayed()) {
			System.out.println("User is not able to login with invalid credential" + "\n");
		} else {
			System.out.println("User is able to login with invalid credential");
		}

	}

	public void LogoImgDisply() {
 

		if (loginpage.getLogoImg().isDisplayed()) {
			System.out.println("image is disply :  passs" + "\n");
		} else {
			System.out.println("image is not disply :  fail");
		}
	}

	public void logInPanelHeadingDisply() {

		
		if (loginpage.getlogInPanelHeadline().isDisplayed()) {
			System.out.println("logInPanelHeadline is disply :  passs" + "\n");
		} else {
			System.out.println("logInPanelHeadline is not disply :  fail" + "\n");
		}

		if (loginpage.getlogInPanelHeadline().getText().equals("LOGIN PANEL")) {
			System.out.println("logInPanelHeadline is in uppercase :  passs" + "\n");
		} else {
			System.out.println("logInPanelHeadline is not in uppercase :  fail" + "\n");
		}
	}

	public void TextField() throws InterruptedException {
		

		// username Text field
		if (loginpage.getUsernameText().isDisplayed()) {
			loginpage.getUsernameText().click();
			Thread.sleep(2000);
			System.out.println("Username test filed is clickable : pass");
			Thread.sleep(2000);
		} else {
			
				System.out.println("Username test filed is not clickable : fail");
			}

			// Password Text field
			if (loginpage.getPasswordText().isDisplayed()) {
				loginpage.getPasswordText().click();
				Thread.sleep(2000);
				System.out.println("Password test filed is clickable : pass" + "\n");
			} else {

				System.out.println("Password test filed is not clickable : fail");
			}
		}
	
	public void LoginButton() throws InterruptedException {
		
		if(loginpage.getLoginbtn().isDisplayed()) {
			loginpage.getLoginbtn().click();
			Thread.sleep(2000);
			System.out.println("Loging button is disply and clickable : pass"+"\n");
		}else {
			System.out.println("Loging button is disply and clickable : pass");
		}
	}
	
	public void ForgotPassword() throws InterruptedException {
		
		if(loginpage.getForgotPassword().isDisplayed()) {
			loginpage.getForgotPassword().click();
			System.out.println("ForgotPassword name is diplay and is clickable : pass " + "\n");
		}else {
			System.out.println("ForgotPassword name is not diplay and is clickable : fail " + "\n");
		}Thread.sleep(2000);
		
		System.out.println(BrowserLaunch.Driver.getTitle()+ "\n");
		BrowserLaunch.Driver.navigate().back();	
	}
	
	public void SocialMedia() throws InterruptedException {

		//use for scrolling
		JavascriptExecutor jse = (JavascriptExecutor) BrowserLaunch.Driver;
		jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(1000);
		
		String CurrentWindowID = BrowserLaunch.Driver.getWindowHandle();
		
		//Linkedin
		if(loginpage.getLinkedinImage().isDisplayed()) {
			loginpage.getLinkedinImage().click();
			System.out.println("Linkedin icon is diplay to the footer of the login page and is clickable : pass " + "\n");
		}else {
			System.out.println("Linkedin icon is not diplay to the footer of the login page and is clickable : fail " + "\n");
		}Thread.sleep(2000);
		
		//to gate access back from linkedin window
		BrowserLaunch.Driver.switchTo().window(CurrentWindowID);
		
		//Facebook
		if(loginpage.getFacebookmage().isDisplayed()) {
			loginpage.getFacebookmage().click();
			System.out.println("Facebook icon is diplay to the footer of the login page and is clickable : pass " + "\n");
		}else {
			System.out.println("Facebook icon is not diplay to the footer of the login page and is clickable : fail " + "\n");
		}Thread.sleep(2000);
		BrowserLaunch.Driver.switchTo().window(CurrentWindowID);
		
		//twitter
		Thread.sleep(2000);
		if(loginpage.gettwitterImage().isDisplayed()) {
			loginpage.gettwitterImage().click();
			System.out.println("twitter icon is diplay to the footer of the login page and is clickable : pass " + "\n");
		}else {
			System.out.println("twitter icon is not diplay to the footer of the login page and is clickable : fail " + "\n");
		}Thread.sleep(2000);
		BrowserLaunch.Driver.switchTo().window(CurrentWindowID);
		
		//youtube
		Thread.sleep(2000);
		if(loginpage.getyoutubeImage().isDisplayed()) {
			loginpage.getyoutubeImage().click();
			System.out.println("youtube icon is diplay to the footer of the login page and is clickable : pass " + "\n");
		}else {
			System.out.println("youtube icon is not diplay to the footer of the login page and is clickable : fail " + "\n");
		}Thread.sleep(2000);
		BrowserLaunch.Driver.switchTo().window(CurrentWindowID);
	}
	
	
	
	
	public void Login_Successfully(String username, String password) throws InterruptedException {

		loginpage.getUsernameText().sendKeys(username);
		Thread.sleep(2000);
		loginpage.getPasswordText().sendKeys(password);
		Thread.sleep(2000);
		loginpage.getLoginbtn().click();
		
		DashboardPage dashboard = new DashboardPage(BrowserLaunch.Driver);
		if(dashboard.getDashboardLabel().isDisplayed()) {
			System.out.println("User is able to login with valid credential" + "\n");
		}else {
			System.out.println("User is not able to login with valid credential");
		}
	}


}
