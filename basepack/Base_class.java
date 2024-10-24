package basepack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilPack.Excelread;



public class Base_class {
	public ChromeOptions option;
	public String datafile;
	public  ChromeDriver driver;
	@Parameters({"url"})
	@BeforeMethod
	public void Pre_condition(String url) {
		
		option = new ChromeOptions();
		option.addArguments("disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	
	
	
	@AfterMethod
	public void PostCondition() {
		
		driver.quit();
	}
	
	
	@DataProvider(name="GetValue")
	public String[][] data() throws IOException{
		
		return Excelread.readexcel(datafile);
	}
	
	
	

}
