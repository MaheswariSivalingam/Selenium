package learnselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		//option 3
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        //option 1
        driver.manage().window().maximize();
        //option 2 and also used for resize the window
        Dimension dimension=new Dimension(1366,768);
        driver.manage().window().setSize(dimension);
        driver.close();
	}

}
