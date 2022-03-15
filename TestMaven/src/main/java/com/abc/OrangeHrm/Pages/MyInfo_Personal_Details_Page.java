package com.abc.OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfo_Personal_Details_Page {

	WebDriver Driver;

	public MyInfo_Personal_Details_Page(WebDriver Driver) {
		this.Driver = Driver;
	}

	public WebElement getMyinfologo() {
		return Driver.findElement(By.xpath("//b[text()='My Info']"));
	}

	public WebElement getPersonal_Details_logo() {
		return Driver.findElement(By.xpath("//a[@href='/index.php/pim/viewPersonalDetails/empNumber/7']"));
	}

	public WebElement getEditbtn() {
		return Driver.findElement(By.id("btnSave"));
	}

	public WebElement getRequired() {
		return Driver.findElement(By.xpath("//span[@for='personal_txtEmpFirstName']"));
	}

	public WebElement getFirstName() {
		return Driver.findElement(By.id("personal_txtEmpFirstName"));
	}

	public WebElement getMiddleName() {
		return Driver.findElement(By.id("personal_txtEmpMiddleName"));
	}

	public WebElement getLastName() {
		return Driver.findElement(By.id("personal_txtEmpLastName"));
	}

	public WebElement getEpmId() {
		return Driver.findElement(By.id("personal_txtEmployeeId"));
	}

	public WebElement getOtherId() {
		return Driver.findElement(By.id("personal_txtOtherID"));
	}

	public WebElement getDriversLicenseNumber() {
		return Driver.findElement(By.id("personal_txtLicenNo"));
	}

	public WebElement getLicenseExpiryDate() {
		return Driver.findElement(By.id("personal_txtLicExpDate"));
	}

	public WebElement getYearDate() {
		return Driver.findElement(By.id("ui-datepicker-year"));
	}

	public WebElement getMonthDate() {
		return Driver.findElement(By.id("ui-datepicker-month"));
	}

	public WebElement getSSNNumber() {
		return Driver.findElement(By.id("personal_txtNICNo"));
	}

	public WebElement getSINNumber() {
		return Driver.findElement(By.id("personal_txtSINNo"));
	}

	public WebElement getGender() {
		return Driver.findElement(By.id("personal_txtEmpLastName"));
	}

	public WebElement get_gender_Female() {
		return Driver.findElement(By.xpath("//label[text()='Female']"));
	}

	public WebElement get_Select_Material_status() {
		return Driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']"));
	}

	public WebElement get_Material_status() {
		return Driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']"));
	}

	// Select status=new Select(get_Material_status()); //STATUS SELECT

	public WebElement get_Select_Nationality() {
		return Driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
	}

	public WebElement get_Nationality() {
		return Driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
	}

	// Select nationality=new Select(get_Nationality()); //NATIONALITY SELECT

	public WebElement get_click_birth_date() {
		return Driver.findElement(By.xpath("//input[@name='personal[DOB]']"));
	}

	public WebElement get_Select_birth_year() {
		return Driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	}

	// Select birth_year=new Select(get_Select_birth_year()); //BIRTH YEAR SELECT

	public WebElement get_Select_birth_month() {
		return Driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	}

	// Select birth_month=new Select(get_Select_birth_month()); //BIRTH MONTH SELECT

	public WebElement get_Nick_Name() {
		return Driver.findElement(By.xpath("//input[@name='personal[txtEmpNickName]']"));
	}

	public WebElement get_Smoker_Checkbox() {
		return Driver.findElement(By.xpath("//input[@name='personal[chkSmokeFlag]']"));
	}

	public WebElement get_Military_Service() {
		return Driver.findElement(By.xpath("//input[@name='personal[txtMilitarySer]']"));
	}

	public WebElement get_edit_custom() {
		return Driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
	}

	public WebElement get_edit_custom_headline() {
		return Driver.findElement(By.xpath("//h1[text()='Attachments']"));
	}

	public WebElement get_add_attachment() {
		return Driver.findElement(By.xpath("//input[@class='addbutton']"));
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

	public WebElement get_all_file_name() {
		return Driver.findElement(By.xpath("//input[@id='attachmentsCheckAll']"));
	}

	public WebElement get_check_box_1() {
		return Driver.findElement(By.xpath("//td//input[@value='2']"));
	}

	public WebElement get_check_box_2() {
		return Driver.findElement(By.xpath("//td//input[@value='3']"));
	}

	public WebElement get_check_box_3() {
		return Driver.findElement(By.xpath("//td//input[@value='1']"));
	}

	public WebElement get_attachment_delete_button() {
		return Driver.findElement(By.xpath("//input[@id='btnDeleteAttachment']"));
	}

	public WebElement get_Required_feild_informatory_message() {
		return Driver.findElement(By.xpath("//li[@class='required new']"));
	}

}
