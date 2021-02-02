package scrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,5000)");
           Thread.sleep(3000);
           js.executeScript("window.scrollBy(0,-5000)");
           
           //y axis
           js.executeScript("window.scrollBy(5000,0)");
           Thread.sleep(3000);
           js.executeScript("window.scrollBy(-5000,0)");

	}

}
