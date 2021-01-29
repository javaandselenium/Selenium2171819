package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("course"));
	   Actions a=new Actions(driver);
	   a.moveToElement(ele).perform();
	   driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	WebElement ele1 = driver.findElement(By.id("add"));
	for(int i=1;i<=6;i++) {
	a.doubleClick(ele1).perform();
	
	}

}
}