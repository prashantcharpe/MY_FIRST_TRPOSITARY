package com.abc.OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver Driver;
	
	public LoginPage(WebDriver Driver) {
		this.Driver=Driver;
	}
	
	public WebElement getLogoImg() {
		return Driver.findElement(By.xpath("//img[@src='/webres_622c1bfeebcab0.03534043/themes/custom/images/login/logo.png']"));
	}
	
	public WebElement getlogInPanelHeadline() {
		return Driver.findElement(By.id("logInPanelHeading"));
	}
	
	public WebElement getUsernameText() {
		return Driver.findElement(By.id("txtUsername"));
	}
	
	public WebElement getPasswordText(){
		return Driver.findElement(By.id("txtPassword"));
	}
	
	public WebElement getLoginbtn(){
		return Driver.findElement(By.id("btnLogin"));
	}
	
	public WebElement getForgotPassword(){
		return Driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
	}
	
	public WebElement getinvalidMessageLabel() {
		return Driver.findElement(By.xpath("//span[@id='spanMessage']"));
	}
	
	public WebElement getLinkedinImage() {
		return Driver.findElement(By.xpath("//img[@src='/webres_622c1bfeebcab0.03534043/themes/custom/images/login/linkedin.png']"));
	}
	
	public WebElement getFacebookmage() {
		return Driver.findElement(By.xpath("//img[@src='/webres_622c1bfeebcab0.03534043/themes/custom/images/login/facebook.png']"));
	}
	public WebElement gettwitterImage() {
		return Driver.findElement(By.xpath("//img[@src='/webres_622c1bfeebcab0.03534043/themes/custom/images/login/twiter.png']"));
	}
	public WebElement getyoutubeImage() {
		return Driver.findElement(By.xpath("//img[@src='/webres_622c1bfeebcab0.03534043/themes/custom/images/login/youtube.png']"));
	}
}
