package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//getting the title of the page
//		System.out.println(driver.getTitle());
		//getting the url
//		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());

	}

}
