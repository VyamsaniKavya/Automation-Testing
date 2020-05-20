package in.amazon.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This is the End to End Script
 * @author-Kavya
 * 
*/
public class CommonTestBase {
	public static WebDriver driver;
	public static Properties prop;

	public CommonTestBase() {
		try {
			//creating an Instance for property file
			prop = new Properties();
			//Locationg the path of the property file
			String path = "E:\\Kavya_workspace\\amazon_Capgemini_Automation\\src\\test\\resources\\property\\configurations.properties";
			//Getting data from property file with the help of path
			FileInputStream fis = new FileInputStream(path);
			//Loading  the inputs from property file
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		//Setting the location of Chromedriver
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Page Load Wait
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
        //Taking data which is present in property file 
        driver.get(prop.getProperty("url"));
	}
	
}
