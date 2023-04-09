package handle_Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();

		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		driver.findElement(By.name("confirmalertbox")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		driver.findElement(By.name("promptalertbox1234")).click();
		driver.switchTo().alert().sendKeys("Sivaji");
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());

	}

}
