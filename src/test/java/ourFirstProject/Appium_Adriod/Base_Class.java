package ourFirstProject.Appium_Adriod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base_Class {
	public AndroidDriver driver;
	
	@BeforeClass
	public void configure() throws Exception{
		UiAutomator2Options option = new UiAutomator2Options(); 
		option.setDeviceName("pixel_5");
		option.setApp(System.getProperty("user.dir")+ "\\src\\test\\resources\\recources\\ApiDemos-debug.apk");
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
	}
		

	@AfterClass
	public void closingApp() {
		driver.quit();	
			
		}
}
