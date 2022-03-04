package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver chd= new ChromeDriver();
		chd.get("http://leafground.com/pages/Button.html");
		chd.manage().window().maximize();
		Timeouts implicitlyWait = chd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//click the button to go to home page
		chd.findElement(By.xpath("//button[@id= 'home']")).click();
		System.out.println("Button clicked");
		chd.navigate().back();
		//Find the position of button(x,y)
		System.out.println(chd.findElement(By.xpath("//button[@id= 'position']")).getLocation());
		//find the button colour
		System.out.println(chd.findElement(By.xpath("//button[@id= 'color']")).getCssValue("background-color"));
		//get the size
		System.out.println(chd.findElement(By.xpath("//button[@id= 'size']")).getSize());

	}

}
