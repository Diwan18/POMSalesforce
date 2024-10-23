package testpack;

import org.testng.annotations.Test;

import basepack.Base_class;
import pagespack.Login_Page;

public class LoginTest2 extends Base_class {
	
	@Test
	public void login() throws InterruptedException {
		Login_Page tc = new Login_Page(driver);
		tc.Enter_UserName().Enter_Password().ClickLogin()
		.click_AppLaunchicon().click_viewAll()
		.Click_Sales().click_Opportunitytab().click_Newtab().EnterNameField().EnterAmount().EnterTodayDate()
		.clickStageoption().selectNeedAnalysis().ClickSave().verifyName();
		
	}

}
