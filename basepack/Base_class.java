package basepack;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test
public class Base_class {
	
	
	public  ChromeDriver driver;
	
	@BeforeMethod
	public void Pre_condition() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		
	}
	
	
	
	@AfterMethod
	public void PostCondition() {
		
		driver.quit();
	}
	
	
	
	
	
	

}
