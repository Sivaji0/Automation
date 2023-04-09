package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Suggestion_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		// span[text()='From']

		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[1]")).click();
		WebElement From=driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		From.sendKeys("Goa");
		Thread.sleep(2000);
		From.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		From.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

}
