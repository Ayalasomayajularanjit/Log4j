package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn_log4j {
	
	public static void main(String[] args) 
	{
		 Logger logger=Logger.getLogger(Learn_log4j.class);
		 
		//BasicConfigurator.configure();

		//Configure log4jproperties File
		PropertyConfigurator.configure("./Libraries\\log4j.properties");
		
		
		WebDriver driver=new FirefoxDriver();
		logger.info("Browser Opened");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");
		
		driver.get("https://www.google.co.in");
		logger.info("URL opened");
		
		driver.findElement(By.name("q")).sendKeys("Ranjit");
        logger.info("type Keyword"); 
        
        driver.findElement(By.name("btnG")).click();
        logger.info("Search Sucessfull");
	}

}
