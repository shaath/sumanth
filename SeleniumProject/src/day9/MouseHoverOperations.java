package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverOperations {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTight(5000);
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span[1]"));
		
		act.moveToElement(books).build().perform();
		Sleeper.sleepTight(5000);
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[4]/div[1]/div/a[8]/span")).click();

	}

}
