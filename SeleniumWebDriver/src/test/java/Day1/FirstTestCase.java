package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Test case
-------
1) Launch browser (chrome)
2) Open URL  https://demo.opencart.com/
3) Validate title should be   "Your Store"
4) close browser

*/

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Launch browser (chrome)
		// ChromeDriver driver=new ChromeDriver();
		//Chrome Browser
		
	WebDriver driver=new ChromeDriver(); //For chrome browser
				
		//2) Open URL  https://demo.opencart.com/
				
	 driver.get("https://demo.opencart.com/");
	 
	 // 3) Validate title should be   "Your Store"
	 
	 String act_title=driver.getTitle();
	 
	 if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	 //4) close browser
	 //driver.close();
	 //driver.quit();
	 

	 

	 
	}

}
