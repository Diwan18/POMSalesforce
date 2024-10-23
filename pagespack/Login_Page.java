package pagespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basepack.Base_class;

public class Login_Page extends Base_class{
	
	public Login_Page(ChromeDriver driver) {
		this.driver = driver;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Login_Page Enter_UserName() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		return this;

	}
	
	public Login_Page Enter_Password() {
	driver.findElement(By.id("password")).sendKeys("leaf@2024");
	return this;}
	
	
	public Home_Page ClickLogin() {
		driver.findElement(By.id("Login")).click();
		return new Home_Page(driver);
		
		
	}

}
