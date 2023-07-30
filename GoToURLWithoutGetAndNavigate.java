package learnselenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoToURLWithoutGetAndNavigate {

	public static void main(String[] args) {
		String url="https://www.google.com";
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.location = \'"+url+"\'");
           
	}

}
