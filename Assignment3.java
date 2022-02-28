package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chd= new ChromeDriver();
		chd.get("https://acme-test.uipath.com/login");
		chd.manage().window().maximize();
		@SuppressWarnings("deprecation")
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		chd.findElement(By.xpath("//label[contains(text(), 'Email')]/following-sibling:: input")).sendKeys("kumar.testleaf@gmail.com");
		chd.findElement(By.xpath("//label[contains(text(), 'Password')]/following-sibling:: input")).sendKeys("leaf@12");
		chd.findElement(By.xpath("//button[@type= 'submit']")).click();
		String s=chd.getTitle();
		System.out.println("title of the page is" +s);
		chd.findElement(By.xpath("//a[contains(text(), 'Log Out')]")).click();
		chd.close();
	}

}
