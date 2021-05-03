package sel.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooksignup {
public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		driver.findElement(By.xpath("//*[@id=\"u_0_2_SD\"]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name= 'firstname']"))).sendKeys("ved");
	
	
		
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("rana");
	driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("ved.rana@gmail.com");
	driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("ved.rana@gmail.com");
	
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("9990932148");
	Select sel = new Select(driver.findElement(By.xpath("//*[@title='Day']")));
	sel.selectByValue("18");
	Select sel1 = new Select(driver.findElement(By.xpath("//*[@title='Month']")));
		sel1.selectByValue("2");
	
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@title='Year']")));
	sel2.selectByValue("1998");
		
		driver.findElement(By.xpath("//input[@type= 'radio'][@value='2']")).click();//radio burtton
	
		
		
	//	driver.close();

	}
	

}
