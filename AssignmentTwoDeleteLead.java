package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoDeleteLead {

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
		chd.findElement(By.xpath("//a[text()= 'Leads']")).click();
		chd.findElement(By.xpath("//a[text()= 'Find Leads']")).click();
		String S=chd.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println("The text is"+ S);
		chd.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		chd.findElement(By.xpath("//a[contains(text(), 'Delete')]")).click();
		chd.findElement(By.xpath("//a[text()= 'Find Leads']")).click();
		chd.findElement(By.xpath("//input[@name= 'id']")).sendKeys(S);
		chd.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		String S1=chd.findElement(By.xpath("//div[contains(text(), 'No records to display')]")).getText();
		System.out.println("verified that"+ S1);
		chd.close();
		
		
		
		
		
		
		

	}

}
