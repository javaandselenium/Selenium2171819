package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		if(ele.isDisplayed())
		{
			System.out.println("Pass:Element is displayed");
			ele.sendKeys("admin");
		}
		else
		{
			System.out.println("Fail:element is not dispayed");
		}
        Thread.sleep(3000);
        WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
	    if(cb.isSelected())
	    {
	    	System.out.println("pass:checkbox is selected");
	    }
	    else
	    {
	    	System.out.println("fail:checkbox is not selected");
	    }
	    Thread.sleep(3000);
	    WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
	    if(btn.isEnabled())
	    {
	    	System.out.println("Pass:button is enabled");
	    }
	    else
	    {
	    	System.out.println("fail:button is not enabled");
	    }
	    Thread.sleep(3000);
	    driver.close();
	
	}

}
