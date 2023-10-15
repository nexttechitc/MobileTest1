package ourFirstProject.Appium_Adriod;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ourSecondClass extends Base_Class{
	
	@Test (priority = 0)
	public void texttext() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Text']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Marquee']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Linkify']")).click();
		Thread.sleep(2000);
		String t =  driver.findElement(By.id("io.appium.android.apis:id/text4")).getText();
		System.out.println(t);
		Thread.sleep(2000);
		boolean y = driver.findElement(By.id("io.appium.android.apis:id/text4")).isDisplayed();
		Assert.assertTrue(y);
		
	}

}
