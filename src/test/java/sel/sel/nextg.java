package sel.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nextg {
	
	public static void main(String ar[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver ob = new ChromeDriver();
		
		ob.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ob.get("http://10.204.182.12:9080/nextgenconfig-static/index.html");
	//	ob.get("google.com");
		ob.manage().window().maximize();
		
		ob.findElement(By.xpath("//*[@id=\"emailid\"]")).sendKeys("sandeep.lnu2@conduent.com");
		ob.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sandeep@123");
		ob.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[3]/div/button")).click();
		
		Select s = new Select(ob.findElement(By.xpath("//*[@id=\"platform\"]")));
		s.selectByValue("NEX GENERATION PORTAL BLANK");
		ob.findElement(By.xpath("//*[@id=\"rootId\"]/main/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[1]")).click();
		
		Actions a = new Actions(ob);
		a.moveToElement(ob.findElement(By.xpath("//*[@id=\"layoutBody\"]/div/div/div[3]/div/div/div/div/a"))).perform();
		a.doubleClick(ob.findElement(By.xpath("//*[@id=\"layoutBody\"]/div/div/div[3]/div/div/div/div/a"))).perform();
	//	a.moveToElement(ob.findElement(By.xpath("//*[@id=\\\"navSetting\\\"]/div[2]/div/div[2]"))).perform();
ob.findElement(By.xpath("//*[@id=\"dropdown-basic\"]")).click();
ob.findElement(By.xpath("//*[@id=\"nextgen-navbar-top\"]/ul/li[2]/div/div/a[1]")).click();

 List<WebElement> rowcount= ob.findElements(By.xpath("//div[@class='customModalBody']/table/tbody/tr"));
 List<WebElement> colcount= ob.findElements(By.xpath("//div[@class='customModalBody']/table/tbody/tr[1]/td"));
 System.out.println(rowcount.size());
 System.out.println(colcount.size());
//*[@id="profileModal"]/div/div[2]/table
// for(int i=1;i<=rowcount.size();i++)
// {
//	 for(int j=1;j<=colcount.size();j++)
//	 {
//		 System.out.println(ob.findElement(By.xpath("//div[@class='customModalBody']/table/tbody/tr["+rowcount+"]/td["+colcount+"]")).getText());
//	 }
// }
 //System.out.println(ob.findElement(By.xpath("//div[@class='customModalBody']/table/tbody/tr[1]/td")).getText());
 for(int i=1;i<=rowcount.size();i++)
 {	 
		 System.out.println(ob.findElement(By.xpath("//div[@class='customModalBody']/table/tbody/tr["+i+"]/td")).getText());
	
 }
	//	a.moveToElement(ob.findElement(By.xpath("//*[@id=\"navSetting\"]/div[2]/div/div[2]"))).click().perform();
	//	ob.findElement(By.xpath("//span[@class='glyphicons glyphicons-plus']")).click();
	//	ob.findElement(By.xpath("//*[@id=\"layoutBody\"]/div/div/div[3]/div/div[2]/button")).click();
		
//	a.dragAndDrop(ob.findElement(By.xpath("//*[@id=\"section_2\"]/div/div/div/div/div/a[1]")), ob.findElement(By.xpath("//*[@id=\"section_1\"]/div/div/div/div/div"))).perform();
	//a.clickAndHold(ob.findElement(By.xpath("//*[@id=\"section_2\"]/div/div/div/div/div/a[1]"))).moveToElement(ob.findElement(By.xpath("//*[@id=\"section_1\"]/div/div/div/div/div"))).release().build().perform();
	//	ob.findElement(By.xpath("//*[@id=\"layoutBody\"]/div/div/div[3]/div/div[2]/div/ul/li[1]/a[1]")).click();
	}

}
