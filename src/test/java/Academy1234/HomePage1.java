package Academy1234;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class HomePage1 extends Base{
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password) throws IOException
	{
	driver=initializeDriver();
	driver.get("https://qaclickacademy.com/");
	LandingPage l=new LandingPage(driver);
	l.getLogin().click();
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(username);
	lp.getpassword().sendKeys(password);
	lp.getlogin().click();
}
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different data types test should run
		//column stands for how many values per each test
		Object[][] data=new Object[2][2];
		//oth row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		//1st row
		data[1][0]="restricteduser@qw.com";
		data[1][1]="56843893";
		return data;
}
}
