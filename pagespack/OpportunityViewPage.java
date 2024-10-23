package pagespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import basepack.Base_class;

public class OpportunityViewPage extends Base_class {
	
	public OpportunityViewPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public OpportunityViewPage verifyName() {
	    WebElement OppName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
	    
	    
	    String OpportunityName = OppName.getText();
	    System.out.println(OpportunityName);
	    
	    String ExpectingText = "Salesforce Automation by Mohammad";
	    
	    Assert.assertEquals(OpportunityName, ExpectingText);
	    System.out.println("The opportunity Name is Verified");
	    driver.close();
	    
	    return this;
	}
	

}
