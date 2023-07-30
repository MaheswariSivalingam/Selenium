package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Game of Thrones");
		Thread.sleep(5000);
		List<WebElement> searchSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		//int position=0;
		for (WebElement webElement : searchSuggestions) {
			String text=webElement.getText();
			System.out.println(text);
			if(text.contains("cast")) {
				webElement.click();
				break;
			}
			//position++;
			/*if(position==3) {
				webElement.click();
				break;
			}*/
		}
	}

}
