import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//button[@id='browse']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("F:/15dec22_laptop/Selenium/Section 30- File Uploading Downloading with Selenium/chck doc/upload.exe");
		
	}	

}
