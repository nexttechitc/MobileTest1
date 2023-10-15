package ourFirstProject.Appium_Adriod;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class appium_demo extends Base_Class {
	
	
	
	@Test (priority = 1)
	public void happy() throws Exception{
		//UiAutomator2Options option = new UiAutomator2Options(); 
		//option.setDeviceName("pixel_5");
		//option.setApp(System.getProperty("user.dir")+ "\\src\\test\\resources\\recources\\ApiDemos-debug.apk");
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
		driver.findElement(By.xpath("	\r\n"
				+ "//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		// By tag name
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		Thread.sleep(3000);
		boolean tom =  driver.findElement(By.id("android:id/alertTitle")).isDisplayed();
		Assert.assertTrue(tom);
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/edit")).sendKeys("Jahan");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
		
		

		
		
		
		
	}

}
