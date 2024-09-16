package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //For chrome browser
		
		driver.get("https://demo.opencart.com/");
		//name
		// WebElement searchBox=driver.findElement(By.name("search"));
		// searchBox.sendKeys("MacBook");
		
		// driver.findElement(By.name("search")).sendKeys("MacBook");   // single step
		
		//id
		
		//WebElement logo=driver.findElement(By.id("logo"));
		//boolean status=logo.isDisplayed();
		
		//boolean status=driver.findElement(By.id("logo")).isDisplayed();
				//System.out.println("Display status:"+ status);
				
		//linkText & partialLinkText   --  only for link
				
				//driver.findElement(By.linkText("Tablets")).click();   //linkText  //preferable
				//driver.findElement(By.partialLinkText("Tab")).click();  //partialLinkText
		
		//classname
				//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
				//System.out.println(headerLinks.size()); // 7
				
		//tagname
				List<WebElement> links=driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				

				
		




		



	}

}
