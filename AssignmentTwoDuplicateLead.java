package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		chd.findElement(By.xpath("//a[text()= 'Leads']")).click();
		chd.findElement(By.xpath("//a[text()= 'Find Leads']")).click();
		chd.findElement(By.xpath("//span[contains(text(), 'Email')]")).click();
		chd.findElement(By.xpath("//input[@name= 'emailAddress']")).sendKeys("abc");
		chd.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		String s=chd.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
		System.out.println("The first title is "    +s);
		Thread.sleep(5000);
		chd.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).click();
		chd.findElement(By.xpath("//a[contains(text(), 'Duplicate Lead')]")).click();
		String S1=chd.findElement(By.xpath("//div[contains(text(), 'Duplicate Lead')]")).getText();
		System.out.println("verified that title is "+ S1);
		chd.findElement(By.xpath("//input[@value= 'Create Lead']")).click();
		String t=chd.findElement(By.xpath("//span[@id= 'viewLead_firstName_sp']")).getText();
		System.out.println("The first title is "    +t);
		Thread.sleep(2000);
		if(s.equals(t)) {
			System.out.println("both are same");
		}
		
		
		chd.close();
	
		

	}

}
