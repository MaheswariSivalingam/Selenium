package learnselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class ActiveElement {
	static  WebElement q;
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		//not use findelement
		//driver.switchTo().activeElement().sendKeys("chennai  \n");
        //or use page factory
		PageFactory.initElements( driver,ActiveElement.class);
		q.sendKeys("chennai");
		
	}

}
