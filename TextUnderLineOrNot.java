package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TextUnderLineOrNot {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		//a[contains(text(),'tamil')]//tamil word is not working so i give english
		WebElement tamil = driver.findElement(By.xpath("//a[contains(text(),'english')]"));
        String hoveringtamil = tamil.getCssValue("text-decoration");
        System.out.println("before hovering "+hoveringtamil);
        Actions actions = new Actions(driver);
        actions.moveToElement(tamil).perform();
        String afterhoveringtamil = tamil.getCssValue("text-decoration");
        System.out.println("after hovering "+afterhoveringtamil);
        
	}

}
