package printAll_Links;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_AllLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		
		List<WebElement> AllTags=driver.findElements(By.tagName("a"));
		System.out.println("Total Tags are" +AllTags.size());
		
		for (int i = 0; i < AllTags.size(); i++) {
			System.out.println("Total Links are in Page" +AllTags.get(i).getAttribute("href"));
			System.out.println("Total Links are in Page" +AllTags.get(i).getText());
		}
		
	}

}
