package com.abc.OrangeHRMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.abc.Commonfunctionality.BrowserLaunch;
import com.abc.OrangeHrm.Pages.MyInfo_Personal_Details_Page;

public class Myinfo_Personali_Details_Test extends BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		BrowserLaunch Driver = new BrowserLaunch();
		Driver.Browser_Initilisation();

		LoginPageTest logintext = new LoginPageTest();
		logintext.Login_Successfully("Admin", "admin123");

		Myinfo_Personali_Details_Test myinfotest = new Myinfo_Personali_Details_Test();
		myinfotest.Test_Myinfologo();
		myinfotest.Test_Personal_Details();
		myinfotest.Test_FirsnameISenabled();
		myinfotest.Test_Editbtn();
		myinfotest.Test_requirement_Field();
		myinfotest.Test_Firstname();
		myinfotest.Test_Middlename();
		myinfotest.Test_Lastname();
		myinfotest.Test_EmployeeID();
		
		

	}

	MyInfo_Personal_Details_Page myinfopage = new MyInfo_Personal_Details_Page(Driver);

	Actions actionsclass = new Actions(Driver);

	public void Test_Myinfologo() throws InterruptedException {

		if (myinfopage.getMyinfologo().isDisplayed()) {
			actionsclass.moveToElement(myinfopage.getMyinfologo()).build().perform();
			Thread.sleep(2000);
			myinfopage.getMyinfologo().click();
			System.out.println("Myinfo logo is display and highlighting and is clickable : pass" + "\n");
		} else {
			System.out.println("Myinfo logo is not desplay and is not clickable : fail" + "\n");
		}

	}

	public void Test_Personal_Details() {

		JavascriptExecutor jse = (JavascriptExecutor) Driver;
		if (myinfopage.getPersonal_Details_logo().isDisplayed()) {
			myinfopage.getPersonal_Details_logo().click();
			jse.executeScript("window.scrollBy(0,150)");
			System.out.println("Personal_Details logo is display and is clickable : pass" + "\n");
		} else {
			System.out.println("Personal_Details logo is not display and is not clickable : fail" + "\n");
		}
	}

	public void Test_FirsnameISenabled() throws InterruptedException {

		if (myinfopage.getFirstName().isSelected()) {
			Thread.sleep(2000);
			myinfopage.getFirstName().click();
			System.out.println("First Name field is display but is clickable : fail" + "\n");
		} else {
			System.out.println("First Name field is display but is not clickable : pass" + "\n");
		}
	}

	public void Test_Editbtn() {

		if (myinfopage.getEditbtn().isDisplayed()) {
			myinfopage.getEditbtn().click();
			System.out.println("Edit button is display and is clickable : pass" + "\n");
		} else {
			System.out.println("Edit button  logo is not desplay and is not clickable : fail" + "\n");
		}
	}
	public void Test_requirement_Field() throws InterruptedException {
		myinfopage.getFirstName().click();
		Thread.sleep(2000);
		myinfopage.getFirstName().clear();
		Thread.sleep(2000);
		
		String a =Keys.chord(Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		myinfopage.getFirstName().sendKeys(a);;
		Thread.sleep(2000);
		
		if (myinfopage.getRequired().isDisplayed()){
			Thread.sleep(2000);
			System.out.println("Field the first name is mandtory: pass" + "\n");
		} else {
			System.out.println("Field the first name is not mandtory: fail" + "\n");
		}
	}
	
	public void Test_Firstname() throws InterruptedException {
		Thread.sleep(2000);
		
		if (myinfopage.getFirstName().isDisplayed()) {
			Thread.sleep(1000);
			myinfopage.getFirstName().sendKeys("prashant");
			System.out.println("First Name field is disply & selected : pass" + "\n");
		} else {
			System.out.println("First Name field is not disply & not selected : fail" + "\n");
		}
	}
	
	public void Test_Middlename() throws InterruptedException {

		if (myinfopage.getMiddleName().isDisplayed()) {
			Thread.sleep(1000);
			myinfopage.getMiddleName().sendKeys("prashant");
			System.out.println("middle Name field is disply & selected : pass" + "\n");
		} else {
			System.out.println("middle Name field is not disply & not selected : fail" + "\n");
		}
	}
	public void Test_Lastname() throws InterruptedException {
		myinfopage.getLastName().click();
		Thread.sleep(2000);
		myinfopage.getLastName().clear();
		Thread.sleep(2000);
		
		String a =Keys.chord(Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		myinfopage.getLastName().sendKeys(a);;
		Thread.sleep(2000);
		
		if (myinfopage.getLastName().isDisplayed()) {
			Thread.sleep(1000);
			myinfopage.getLastName().sendKeys("prashant");
			
			System.out.println("last Name field is disply & selected : pass" + "\n");
		} else {
			System.out.println("middle Name field is not disply & not selected : fail" + "\n");
		}
	}

	public void Test_EmployeeID() throws InterruptedException {
		myinfopage.getEpmId().clear();
		
		if (myinfopage.getEpmId().isDisplayed()) {
			Thread.sleep(1000);
			myinfopage.getEpmId().sendKeys("123456789");
			System.out.println("Emp id is : pass"  +"\n");
			Thread.sleep(1000);
			System.out.println(myinfopage.getEpmId().getText());
		} 
	}
	public void Test_OtherID() throws InterruptedException {
		myinfopage.getOtherId().clear();
		
		if (myinfopage.getOtherId().isDisplayed()) {
			Thread.sleep(1000);
			myinfopage.getOtherId().sendKeys("123456789");
			System.out.println("Emp id is : pass"  +"\n");
			System.out.println(myinfopage.getEpmId().getText());
		} 
	}
	
	
	
	
}