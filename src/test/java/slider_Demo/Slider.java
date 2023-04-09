package slider_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);

		WebElement greenslider = driver.findElement(By.xpath("//*[@id='green']"));

		Actions actions = new Actions(driver);
		actions.dragAndDropBy(greenslider, -100, 125).perform();

	}

}
