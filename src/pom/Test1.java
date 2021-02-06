package pom;

import javax.swing.plaf.basic.BasicTreeUI.TreePageAction;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.html5.RemoteWebStorage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	Test1(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void username(String us) {
		usernametb.sendKeys(us);
	}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void button() {
		loginbtn.click();
	}

}
