package learnselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Pagination {
 static String nextClassName;
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
        driver.manage().window().maximize();
        List<String> namelist=new ArrayList<String>();
        List<WebElement> listname;
        int sizeof=driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();
            System.out.println(sizeof);
            if(sizeof>0) {
            	do {
            		listname=driver.findElements(By.xpath("//td[@class='sorting_1']"));
                	for (WebElement name : listname) {
    					namelist.add(name.getText());
                	}
            	WebElement findElements = driver.findElement(By.id("dtBasicExample_next"));
            	nextClassName=findElements.getAttribute("class");
            	if(!nextClassName.contains("disabled")) {
            		findElements.click();
            	}else {
            		break;
            	}
            	}
            	while(true);
	}else
            {
            	System.out.println("no pagination in this page");
            }
            for (String web :namelist) {
				System.out.println(web);
			}
            driver.close();
	}
}


