package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLaunch {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver chd= new ChromeDriver();
		chd.get("https://www.facebook.com/");
		chd.manage().window().maximize();
		@SuppressWarnings("deprecation")
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		chd.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		//Thread.sleep(5000);
		chd.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("atext");
		chd.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("btext");
		chd.findElement(By.xpath("//div[contains(text(), 'number or email')]/following-sibling:: input")).sendKeys("abc@gmail.com");
		chd.findElement(By.xpath("//div[contains(text(), 'Re-enter email address')]/following-sibling:: input")).sendKeys("abc@gmail.com");
		
		chd.findElement(By.xpath("//div[contains(text(), 'New password')]/following-sibling:: input")).sendKeys("abc@123");
		WebElement SD=chd.findElement(By.xpath("//select[@id= 'day']"));
	    Select dd=new Select(SD);
	    dd.selectByVisibleText("28");
	    WebElement SM=chd.findElement(By.xpath("//select[@id= 'month']"));
	    Select dd1=new Select(SM);
	    dd1.selectByVisibleText("Apr");
	    WebElement SY=chd.findElement(By.xpath("//select[@id= 'year']"));
	    Select dd2=new Select(SY);
	    dd2.selectByVisibleText("1998");
	    chd.findElement(By.xpath("//label[contains(text(), 'Female')]/following-sibling:: input")).click();
	    chd.findElement(By.xpath("//button[@name= 'websubmit']")).click();
	    

	}

}
