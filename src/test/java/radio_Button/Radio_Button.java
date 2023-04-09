package radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		driver.manage().window().maximize();

		WebElement radio1 = driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/form[1]/div[1]/label[1]"));
		WebElement radio2 = driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/form[1]/div[2]/label[1]"));
		radio2.click();
		radio2.isDisplayed();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
	}

}
