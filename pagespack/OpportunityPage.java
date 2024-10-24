package pagespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basepack.Base_class;

public class OpportunityPage extends Base_class{
	
	public OpportunityPage(ChromeDriver driver) {
		
		this.driver=driver;
		
	}
	
	public OpportunityPage click_Newtab() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		return this;
	}
	
	public OpportunityPage EnterNameField() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Mohammad");
		
		
		return this;
	}
	
	public OpportunityPage EnterAmount() {
	driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75,000");
	return this;}
	
	public OpportunityPage EnterTodayDate() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@name='today']")).click();
	Thread.sleep(5000);
	return this;
	}
	
	
	public OpportunityPage clickStageoption() {
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		return this;
	}
	public OpportunityPage selectNeedAnalysis() {
		 driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		 return this;
	}
   
	public OpportunityViewPage ClickSave() {
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    return new OpportunityViewPage(driver);
	}

}
