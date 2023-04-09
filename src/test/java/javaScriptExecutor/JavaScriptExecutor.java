package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Print the title of the page
		String script = "return document.title";
		String title=(String) js.executeScript(script);
		System.out.println(title);
		
		//Click button
		driver.switchTo().frame("iframeResult");
		js.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Heighlight the button
		
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		js.executeScript("arguments[0].style.border='5px solid red'", button);
		
		//Scroll By view
		
		driver.navigate().to("https://www.ebay.com/");
		WebElement Shopnow=driver.findElement(By.xpath("//*[@id=\"rtm_list3\"]/div/div[2]/a/div[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", Shopnow);
		
		
		
		
	}

}
