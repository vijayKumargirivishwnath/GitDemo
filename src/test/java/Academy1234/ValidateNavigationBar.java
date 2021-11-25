package Academy1234;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base{
	@Test
	public void BasePageNavigation() throws IOException 
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
	}

}
