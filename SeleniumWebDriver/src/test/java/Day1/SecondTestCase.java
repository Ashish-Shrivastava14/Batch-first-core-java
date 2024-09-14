package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*1) Launch browser (chrome)
2) Open URL  https://demo.nopcommerce.com/
3) Validate title should be   "nopCommerce demo store"
4) close page
*/



public class SecondTestCase {

	public static void main(String[] args) {
		
		//WebDriver driver=new ChromeDriver(); //For chrome browser
		WebDriver driver=new EdgeDriver();
		
		//2) Open URL  https://demo.opencart.com/
				
	 driver.get("https://demo.nopcommerce.com/");
	 
	 // 3) Validate title should be   "Your Store"
	 
	 String act_title=driver.getTitle();
	 
	 if(act_title.equals("nopCommerce demo store"))
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
