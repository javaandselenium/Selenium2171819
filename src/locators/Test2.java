package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,3);
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement ele = driver.findElement(By.name("pwd"));
		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("manager");
		
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login ']"))).click();
		
		
		String t = driver.getTitle();
		System.out.println(t);
		//	Verfication
		if(t.equals("actiTIME - Login"))
		{
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:Home page is not dispalyed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.close();
	}

}
