package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Gmaillogin {

	public static void main(String[] args)
	{
		//Launching the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launch gmail Application
		driver.get("http://gmail.com");
		//Maximizing the window
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Identifying email text box
		WebElement email=driver.findElement(By.id("Email"));
		
		//Sending the text into email text box
		email.sendKeys("sharathqedge449");
		
//		Sleeper.sleepTightInSeconds(5);
		
		//Clear the text in email text box 
//		email.clear();
		
		//Clicking on next button
		
		driver.findElement(By.name("signIn")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		//entering the password into password field
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("123456789");
		//clicking on the sign in button
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
