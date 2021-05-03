package sel.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop {
	
	public static void main(String ar[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver ob = new ChromeDriver();
		ob.get(" ");
		ob.manage().window().maximize();
		
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	List<WebElement> l=	ob.findElements(By.tagName("option"));
	
	System.out.println(l);
	
//for(WebElement r:l)
//{
//	
//	System.out.println(r.getText());
//}
	
	for(int i=0;i<=l.size();i++)
	{
		if(i==3)
		{
			System.out.println(l.get(i).getText());
		}
			
	}
		
		
		
		
	}

}
