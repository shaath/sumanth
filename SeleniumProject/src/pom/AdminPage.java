package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage 
{
	@FindBy(linkText="Admin")
	WebElement admin;
	
	@FindBy(linkText="PIM")
	WebElement pim;
	
	@FindBy(linkText="Leave")
	WebElement leave;
	
	@FindBy(linkText="Time")
	WebElement time;
	
	@FindBy(linkText="Recruitement")
	WebElement recruitement;
	
	@FindBy(linkText="Performance")
	WebElement performance;
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;
	
	@FindBy(linkText="Directory")
	WebElement directory;
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome;
	
	@FindBy(linkText="About")
	WebElement about;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void adminclick()
	{
		admin.click();
	}
	
	public void pimclick()
	{
		pim.click();
	}
	
	public void leaveclick()
	{
		leave.click();
	}
	
	public void timeclick()
	{
		time.click();
	}
	
	public void recruitmentclick()
	{
		recruitement.click();
	}
	
	public void performaneclick()
	{
		performance.click();
	}
	
	public void directoryclick()
	{
		directory.click();
	}
	
	public void direcotoryclick()
	{
		directory.click();
	}
	
	public void welcomeclick()
	{
		welcome.click();
	}
	
	public void aboutclick()
	{
		about.click();
	}
	
	public void logoutclick()
	{
		logout.click();
	}

}
