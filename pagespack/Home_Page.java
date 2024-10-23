package pagespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basepack.Base_class;

public class Home_Page extends Base_class {
	
	public Home_Page(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public Home_Page click_AppLaunchicon()  {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		return this;
		
	}
	
	public  Home_Page click_viewAll() {
		
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		return this;
	}
	
	public Sales_Page Click_Sales() {
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		return new Sales_Page(driver);
	}

}
