package pagespack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basepack.Base_class;

public class Sales_Page extends Base_class{
	
	public Sales_Page(ChromeDriver driver) {
		
		this.driver=driver;
		
	}
	
	public OpportunityPage click_Opportunitytab() throws InterruptedException {
		
		WebElement opportunityTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor Executer = (JavascriptExecutor) driver;
		Executer.executeScript("arguments[0].click();",opportunityTab);
		
		return new OpportunityPage(driver);
		
		
	}

	

}
