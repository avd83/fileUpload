import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuth {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/");
		driver.get("http:admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
	}

}
