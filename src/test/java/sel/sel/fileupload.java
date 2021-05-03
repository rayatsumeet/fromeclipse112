package sel.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {
	
	public static WebDriver driver;
	@Test

public void file()
{
	
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\52066174\\Desktop\\post\\api faq");
		
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		
		
		
		
}
	
	

}
