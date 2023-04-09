package readAndWrite_Properties_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWrite_Properties_File {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		FileInputStream inputfile = new FileInputStream("C:\\Users\\Vgcb\\Selenium_Learning\\src\\main\\resources\\properties\\ReadAndWrite_Data.properties");
		properties.load(inputfile);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("URL"));
		
		FileOutputStream outputfile = new FileOutputStream("C:\\Users\\Vgcb\\Selenium_Learning\\src\\main\\resources\\properties\\ReadAndWrite_Data.properties");
		properties.setProperty("Customer Cell no", "0123456789");
		properties.store(outputfile, "This is new feature has been added");
		
	
	}

}
