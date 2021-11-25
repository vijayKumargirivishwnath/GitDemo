package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public WebDriver driver;
public Properties prop;
public WebDriver initializeDriver() throws IOException
{
 prop=new Properties();
FileInputStream fis=new FileInputStream("E:\\allworkspace\\seleniumnew\\E2EProject1234\\src\\main\\java\\resources\\data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "F:\\driver\\chrome driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
else if(browserName.equals("firfox"))
{
	driver=new FirefoxDriver();
}
else if(browserName.equals("IE"))
{
 //ie code
}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
//screenshort if method or testcase is fail
public String getSreenShortPath(String testcaseName, WebDriver driver) throws IOException
{
TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
String destinationfile=System.getProperty("user.dir")+"//reports//"+testcaseName+".png";
FileUtils.copyFile(source,new File(destinationfile));
return destinationfile;

}
}
