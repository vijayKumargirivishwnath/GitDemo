package Academy1234;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
@Test
public void basePageNavigation() throws IOException
{
driver.get(prop.getProperty("url"));
LandingPage l=new LandingPage(driver);
l.getLogin().click();
LoginPage lp=new LoginPage(driver);
lp.getEmail().sendKeys("vijay@gmail.com");
lp.getpassword().sendKeys("123456");
lp.getlogin().click();
}

@BeforeTest
public void initialize() throws IOException
{
driver=initializeDriver();
}
@AfterTest
public void teardown()
{
driver.close();
}}
