package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
	WebElement ele = driver.findElement(By.id("Mayas"));
	Select s =new Select(ele);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("c");
	Thread.sleep(2000);
	s.selectByVisibleText("dosa");
	
	System.out.println(s.isMultiple());
	
	if(s.isMultiple())
	{
		Thread.sleep(2000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("c");
		Thread.sleep(2000);
		s.deselectByVisibleText("dosa");
	}
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	

	}

}
