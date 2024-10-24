package testpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepack.Base_class;
import pagespack.Login_Page;

public class LoginTest2 extends Base_class {
	
	@BeforeTest
	public void getvalue() {
		datafile = "ExcelSalesforce2";
	}
	
	
	
	@Test(dataProvider = "GetValue")
	public void login(String uname , String pass) throws InterruptedException {
		Login_Page tc = new Login_Page(driver);
		tc.Enter_UserName(uname).Enter_Password(pass).ClickLogin()
		.click_AppLaunchicon().click_viewAll()
		.Click_Sales().click_Opportunitytab().click_Newtab().EnterNameField().EnterAmount().EnterTodayDate()
		.clickStageoption().selectNeedAnalysis().ClickSave().verifyName();
		
	}

}
