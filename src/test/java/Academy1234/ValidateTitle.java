package Academy1234;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class ValidateTitle extends Base {

	@Test
	public void titlevalidatioin() throws IOException
	{
	driver=initializeDriver();
	driver.get("https://qaclickacademy.com/");
	LandingPage l=new LandingPage(driver);
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES1234");
	
	
	
	}
}
