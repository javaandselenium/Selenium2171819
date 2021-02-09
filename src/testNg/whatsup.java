package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class whatsup {
	@Test(priority = 1,invocationCount = 2,enabled=false)
	public void  calls() {
		Reporter.log("calls,true");
	}
	
	@Test(invocationCount = 3)
	public void chats() {
		Reporter.log("chats,true");
	}
	
	@Test(priority = 1)
	public void settings() {
		Reporter.log("settings,true");
	}

}
