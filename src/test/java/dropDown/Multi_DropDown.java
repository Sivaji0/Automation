package dropDown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.mobiscroll.com/select/multiple-select");
		driver.manage().window().maximize();

		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/label/span[2]/span[1]"));
		
		Select options = new Select(dropdown);
		options.selectByValue("6");
		options.selectByVisibleText("Home, Garden & Tools");
		List<WebElement> all= options.getAllSelectedOptions();
		System.out.println(all.size());
		
		
	}

}
