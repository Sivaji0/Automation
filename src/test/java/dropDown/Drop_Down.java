package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://saucelabs.com/request-demo");
		  driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("Country"));
		Select oneway = new Select(dropdown);
		 //oneway.selectByVisibleText("India");
		 oneway.selectByValue("India");
		 
		 
		 
	}

}
