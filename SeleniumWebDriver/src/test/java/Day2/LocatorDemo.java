package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //For chrome browser
		
		driver.get("https://demo.opencart.com/");
		//name
		WebElement searchBox=driver.findElement(By.name("search"));
		searchBox.sendKeys("MacBook");


	}

}
