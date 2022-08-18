package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("cat");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ckk11061995@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ckk11061995@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
		
       WebElement source=driver.findElement(By.xpath("//select[@id='day']"));
       Select obj=new Select(source);
       obj.selectByIndex(11);
       
       WebElement source1=driver.findElement(By.xpath("//select[@id='month']"));
       Select obj1=new Select(source1);
       obj1.selectByIndex(8);
       
       WebElement source2=driver.findElement(By.xpath("//select[@id='year']"));
       Select obj2=new Select(source2);
       obj2.selectByIndex(28);
       
       driver.findElement(By.xpath("//label[@for='u_b_5_Ev']")).click();
       
       
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       
     
	}

}
