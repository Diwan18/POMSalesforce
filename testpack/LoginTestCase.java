package testpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepack.Base_class;
import pagespack.Login_Page;

public class LoginTestCase extends Base_class{
	
	
	@BeforeTest
	public void getvalue() {
		datafile="ExcelSalesforce";
	}
	
	
	
	
	@Test(dataProvider="GetValue")
	public void login(String uname , String pass) throws InterruptedException {
	Login_Page tc = new Login_Page(driver);
	tc.Enter_UserName(uname).Enter_Password(pass).ClickLogin();
	
	}
	
	

}
