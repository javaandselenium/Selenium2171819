package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		 WebElement ele = driver.findElement(By.xpath("//a[text()='3.141.59']"));
		
		 ele.sendKeys(Keys.CONTROL);
		 ele.sendKeys(Keys.TAB);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
