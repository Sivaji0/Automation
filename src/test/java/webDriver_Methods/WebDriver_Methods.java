package webDriver_Methods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Methods {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

//		String URL= driver.getCurrentUrl();
//		System.out.println(URL);
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
//		
//		driver.navigate().to("https://www.youtube.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> wb = driver.findElements(By.xpath("//div[@class='inventory_list']"));
		System.out.println(wb);
		
		driver.navigate().to("https://www.sugarcrm.com/");
		String WH = driver.getWindowHandle();
		System.out.println(WH);
		
		driver.findElement(By.xpath("//*[@id=\"slide-6408335b615c1\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
		Set<String> WHs= driver.getWindowHandles();
		System.out.println(WHs);
	

		driver.close();

	}

}
