package com.abc.OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myinfo_Contact_Details_Page {
	WebDriver Driver;

	public Myinfo_Contact_Details_Page(WebDriver Driver) {
		this.Driver = Driver;
	}
	
	public WebElement get_contact_details() {
		return Driver.findElement(By.xpath("//a[@href='/index.php/pim/contactDetails/empNumber/7']"));
	}
	
	public WebElement get_edit_button() {
		return Driver.findElement(By.xpath("//input[@id='btnSave']"));
	}
	
	public WebElement get_address_street_1() {
		return Driver.findElement(By.xpath("//input[@id='contact_street1']"));
	}
	
	public WebElement get_address_street_2() {
		return Driver.findElement(By.xpath("//input[@id='contact_street2']"));
	}
	
	public WebElement get_city() {
		return Driver.findElement(By.xpath("//input[@id='contact_city']"));
	}
	
	public WebElement get_state() {
		return Driver.findElement(By.xpath("//input[@id='contact_province']"));
	}
	
	public WebElement get_Zip_postal_code() {
		return Driver.findElement(By.xpath("//input[@id='contact_emp_zipcode']"));
	}
	
	public WebElement get_country() {
		return Driver.findElement(By.xpath("//select[@id='contact_country']"));
	}
	
	public WebElement get_home_telephone_number() {
		return Driver.findElement(By.xpath("//input[@id='contact_emp_hm_telephone']"));
	}
	
	public WebElement get_mobile_number() {
		return Driver.findElement(By.xpath("//input[@id='contact_emp_mobile']"));
	}
	
	public WebElement get_work_telephone_number() {
		return Driver.findElement(By.xpath("//input[@id='contact_emp_work_telephone']"));
	}
	
	public WebElement get_work_email() {
		return Driver.findElement(By.xpath("//input[@id='contact_emp_work_email']"));
	}
	
	public WebElement get_home_email() {
		return Driver.findElement(By.xpath("//input[@id='contact_emp_oth_email']"));
	}
	
	public WebElement get_attachment_heading() {
		return Driver.findElement(By.xpath("//input[@id='btnAddAttachment"));
	}
	
	public WebElement get_attachment_button() {
		return Driver.findElement(By.xpath("//h1[text()='Attachments']"));
	}
	
	public WebElement get_choose_file() {
		return Driver.findElement(By.xpath("//input[@name='ufile']"));
	}
	
	public WebElement get_comment() {
		return Driver.findElement(By.xpath("//textarea[@name='txtAttDesc']"));
	}
	
	public WebElement get_upload_button() {
		return Driver.findElement(By.xpath("//input[@value='Upload']"));
	}
	
	public WebElement get_cancel_button() {
		return Driver.findElement(By.xpath("//input[@id='cancelButton']"));
	}
	
	

}
