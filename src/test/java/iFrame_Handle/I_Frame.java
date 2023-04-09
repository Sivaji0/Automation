package iFrame_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Sivaji");
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		
	}

}
