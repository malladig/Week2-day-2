package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AssignmentTwoEditLead {

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
		chd.findElement(By.xpath("(//input[@name = 'firstName' ])[3]")).sendKeys("test");
		chd.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(5000);
		chd.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).click();
		//get the title of the page after click on first resulting name
		chd.findElement(By.xpath("//div[@class= 'x-panel-header sectionHeaderTitle']")).click();
		String tit=chd.getTitle();
		System.out.println("the title is"  +tit);
		Thread.sleep(3000);
		chd.findElement(By.xpath("//a[contains(text(), 'Edit')]")).click();
		
		WebElement ccompanyname=chd.findElement(By.xpath("//input[ @id= 'updateLeadForm_companyName']"));
		ccompanyname.clear();
		ccompanyname.sendKeys("testtesttest");
		chd.findElement(By.xpath("//input[ @value= 'Update']")).click();
		
		//updated company name
		String ucompanyname=chd.findElement(By.xpath("//span[@id= 'viewLead_companyName_sp']")).getText();
		System.out.println("updated company name is" +ucompanyname);
		
			
		if(ucompanyname.contains("testtesttest")) {
			System.out.println("both are same");
		}
		else {
			System.out.println("both are nt same");
		}
		
		



	}

}
