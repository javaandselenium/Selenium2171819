package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 {

	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
//	ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./Softwar/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();

	}

}
