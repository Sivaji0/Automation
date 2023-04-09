package window_Handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_Windows {

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--disable notifications");
//		DesiredCapabilities DC = new DesiredCapabilities();
//		DC.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(DC);
//		ChromeDriver driver = new ChromeDriver(options);
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();

		
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]")).click();

		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();

		String parentwindow = iterator.next();
		String childwindow = iterator.next();

		driver.switchTo().window(childwindow);

		driver.findElement(By.name("UserFirstName")).sendKeys("Sivaji");
		driver.findElement(By.name("UserLastName")).sendKeys("S");

	}

}
