package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchResultLink {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("12 angry men \n");
		Thread.sleep(5000);
		/*List<WebElement> totalLink = driver.findElements(By.xpath("//a"));
		//this will print all the URLs in the page
        for (WebElement links : totalLink) {
			System.out.println(links.getAttribute("href"));
		}*/
		//Fetch main links
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		for(WebElement links:elements) {
			System.out.println(links.getText());
		}
	}

}
