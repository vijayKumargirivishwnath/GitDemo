package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
By email=By.cssSelector("[id='user_email']");
By Password=By.cssSelector("[type='password']");
By login=By.cssSelector("[value='Log In']");

//create constructor for webdriver inilization
public  LoginPage(WebDriver driver)
{
this.driver=driver;
}

public WebElement getEmail()
{
return driver.findElement(email);	
}

public WebElement getpassword()
{
return driver.findElement(Password);	
}

public WebElement getlogin()
{
return driver.findElement(login);	
}

}
