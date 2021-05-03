package sel.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbusdate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver ob = new ChromeDriver(op);
		ob.get("http://redbus.in");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ob.findElement(By.xpath("//label[normalize-space()='Date']")).click();
		
		String mon = "Jun";
		String year= "2021";
		String date="7";
		
		while(true)
		{
		String monyear= 	ob.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(monyear);
		String ar[]=monyear.split(" ");
		String monexp = ar[0];
		String yearexp= ar[1];
		
		if(mon.equals(monexp) && year.equals(yearexp))
		{
		List<WebElement> el= 	ob.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement expdate:el)
		{
			if(expdate.getText().equals(date))
			{
				expdate.click();
				
			}
		}
		}
		else
		{
			ob.findElement(By.xpath("//button[normalize-space()='>']")).click();
			
		}
		}
		
		
 
 

	}

}
