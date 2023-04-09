package ssl_Certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_SSL_Certificate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setAcceptInsecureCerts(true);

		ChromeOptions options = new ChromeOptions();
		options.merge(DC);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

	}

}
