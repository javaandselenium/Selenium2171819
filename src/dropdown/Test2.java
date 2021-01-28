package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));
	
		Select s=new Select(ele);
		s.selectByIndex(2);
		
		List<WebElement> alloption = s.getOptions();
		System.out.println(alloption.size());
		
		for(WebElement b:alloption)
		{
			System.out.println(b.getText());
		}
		
		driver.close();

	}

}
