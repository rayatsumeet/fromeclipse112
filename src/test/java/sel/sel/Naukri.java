package sel.sel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri {

	public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	Set<String> winid =	driver.getWindowHandles();
	
	Iterator<String> e=  winid.iterator();
	
	String win1= e.next();
	String win2= e.next();
	String win3= e.next();
	String win4= e.next();
	 
		
		driver.switchTo().window(win1);
		
		System.out.println(driver.getTitle());
		
	driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(win3);
	System.out.println(driver.getTitle());
	driver.switchTo().window(win4);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(win1);
	System.out.println(driver.getTitle());
	
	
	
		
	}

}
