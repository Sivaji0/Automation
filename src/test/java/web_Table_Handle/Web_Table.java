package web_Table_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Web_Table {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		int rowsize = rows.size();

		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[3]/td"));
		System.out.println(columns.size());
		int columnsize = columns.size();

		for (int i = 1; i <= rowsize; i++) {
			for (int j = 1; j <= columnsize; j++) {

		//System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"))
			//					.getText() + "    ");
		
		System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" +  i  + "]/td[" +  j  + "]"))
				.getText() + "    ");

			}													
			System.out.println();
		}

		driver.close();
	}

}
