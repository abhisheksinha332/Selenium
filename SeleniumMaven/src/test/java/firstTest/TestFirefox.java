package firstTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\ABHISHEK\\Udemy\\selenium\\executables\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://abhishek-sinha.netlify.app/");
	}

}
