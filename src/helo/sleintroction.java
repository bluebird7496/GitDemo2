package helo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sleintroction{

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C://Users//chromedriver.exe");
		    //WebDriver driver =new ChromeDriver();
		    
		    System.setProperty("webdriver.edge.driver", "C:/Users/msedgedriver.exe");
		    WebDriver driver =new EdgeDriver();
		    
		    
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			}

}
