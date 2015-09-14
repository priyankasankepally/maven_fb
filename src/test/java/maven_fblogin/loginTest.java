package maven_fblogin;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTest {
	
	@Test
	
	public void dologin(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

}
