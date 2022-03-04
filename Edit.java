package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		ChromeDriver chd= new ChromeDriver();
		chd.get("http://leafground.com/pages/Edit.html");
		chd.manage().window().maximize();
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//Enter email address
		chd.findElement(By.xpath("//input[@id= 'email']")).sendKeys("malladigayathriqa@gmail.com");
		//Append text
		chd.findElement(By.xpath("//input[@value= 'Append ']")).sendKeys("adding text");
		//Get default text entered
		System.out.println(chd.findElement(By.xpath("(//input[@name= 'username'])[1]")).getAttribute("value"));
		
		//clear the text
		chd.findElement(By.xpath("//input[@value= 'Clear me!!']")).clear();
		//verifying that is text filed enabled or not
		System.out.println(chd.findElement(By.xpath("//input[@disabled= 'true']")).isEnabled());
		
		
		

	}

}
