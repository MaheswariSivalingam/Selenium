package learnselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InputWithOutSendkeys {

	public static void main(String[] args) throws AWTException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        //option 1
        executor.executeScript("document.getElementsByName('q')[0].value='testing'", "");
        //option 2
        executor.executeScript("arguments[0].value='testing'", searchbox);
        //option 3
        driver.switchTo().activeElement();
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
	}

}
