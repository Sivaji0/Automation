package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {

		Date currentdate = new Date();
		System.out.println(currentdate);
		String screenshotfilename= currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		File Screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshotfile, new File(".//screenshot//"+screenshotfilename+".png"));

	}

}
