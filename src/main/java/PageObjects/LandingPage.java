package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
//constructor use for initize webdriver
public  LandingPage (WebDriver driver)
{
this.driver=driver;
}
By signin=By.cssSelector("a[href*='sign_in']");

public WebElement getLogin()
{
return driver.findElement(signin);
	
}
 
By title=By.cssSelector(".text-center>h2");
public WebElement getTitle()
{
return driver.findElement(title);
}

By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
public WebElement getNavigationBar()
{
return driver.findElement(NavBar);
	
}

}
