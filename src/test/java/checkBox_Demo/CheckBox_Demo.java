package checkBox_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/request-demo");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"LblmktoCheckbox_34508_1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("LblmktoCheckbox_34508_5")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
	}

}
