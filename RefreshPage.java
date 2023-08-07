package learnselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RefreshPage {

	public static void main(String[] args) throws AWTException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Agni");
		//driver.findElement(By.name("q")).sendKeys(Keys.F5);
		//if we use navigate
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		//use get current url
		driver.get(driver.getCurrentUrl());
		//javaScriptExecutor
		JavascriptExecutor executor =driver;
		executor.executeScript("location.reload()");//history.go(0)
		//use robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

	}

}
