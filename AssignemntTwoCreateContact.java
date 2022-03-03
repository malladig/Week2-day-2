package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignemntTwoCreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver chd= new ChromeDriver();
		chd.get("http://leaftaps.com/opentaps/control/main");
		chd.manage().window().maximize();
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement uname=chd.findElement(By.id("username"));
		uname.sendKeys("Demosalesmanager");
		WebElement pwd=chd.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement login=chd.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement link=chd.findElement(By.linkText("CRM/SFA"));
		link.click();
		chd.findElement(By.linkText("Contacts")).click();
		chd.findElement(By.linkText("Create Contact")).click();
		chd.findElement(By.id("firstNameField")).sendKeys("Gayathri");
	    
	    chd.findElement(By.id("lastNameField")).sendKeys("Malladi");
	    
	   
		chd.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gayathri");
		chd.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Malladi");
		chd.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		WebElement ED=chd.findElement(By.id("createContactForm_description"));
		ED.sendKeys("IT");
		chd.findElement(By.id("createContactForm_primaryEmail")).sendKeys("malladigayathriqa@gmail.com");
		WebElement sp=chd.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select dd=new Select(sp);
	    dd.selectByVisibleText("New York");
	    chd.findElement(By.className("smallSubmit")).click();
	    chd.findElement(By.linkText("Edit")).click();
	    
	    chd.findElement(By.id("updateContactForm_description")).clear();
	    
	    chd.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is important");
	    chd.findElement(By.xpath("(//input[@type= 'submit'])[1]")).click();
	    System.out.println("The title of the page is"  +chd.getTitle());
	    
		
		
		
		
		
		

	}

}
