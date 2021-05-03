package sel.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calculatelink {
@Test
	public void count() {
		// TODO Auto-generated method stub
		int count =0;
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	WebElement block= 	driver.findElement(By.xpath("//div[@class='other-projects']"));
	
	List<WebElement> l= block.findElements(By.tagName("a"));
	
	for(WebElement w :l)
	{
		System.out.println(w.getAttribute("href"));
		System.out.println(w.getTagName());
		count++;
	
	}
	System.out.println(count);
		
	driver.close();	

	}

}
