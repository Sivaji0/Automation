package mouseOver_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		
		
		
		
		
	}

}
