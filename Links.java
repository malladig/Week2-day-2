package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver chd= new ChromeDriver();
		chd.get("http://leafground.com/pages/Link.html");
		chd.manage().window().maximize();
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//click on the home page link
		chd.findElement(By.xpath("(//*[text()='Go to Home Page'])[1]")).click();
		chd.navigate().back();
		//get the link 
		System.out.println(chd.findElement(By.xpath("//a[contains(text(), 'Find where am')]")).getAttribute("href"));
		//verify the broken
		String errorurl=chd.findElement(By.xpath("//a[contains(text(),  'Verify')]")).getAttribute("href");
		System.out.println("the broken URL is"+errorurl);
		if(errorurl.contains("error")) {
			System.out.println("the URL is Errored out");
		}
		Thread.sleep(5000);	
		chd.findElement(By.xpath("(//*[text()='Go to Home Page'])[1]")).click();
		chd.navigate().back();
		List<WebElement> alllinks=chd.findElements(By.xpath("//a"));
		System.out.println("Number of links are"+alllinks.size());
		chd.close();
	}

}
