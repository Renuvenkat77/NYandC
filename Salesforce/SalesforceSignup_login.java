package selHandsonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceSignup_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatasubramanian\\Desktop\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/");	
		driver.manage().window().maximize();
		String hphandle= driver.getWindowHandle();
		//WebElement popupclose=driver.findElement(By.id("dfc-cookie-info-bar-button"));
		//popupclose.click();
		WebElement signup= driver.findElement(By.xpath("//a[@class='btn btn-success']"));
	    signup.click();
	WebElement firstname= driver.findElement(By.id("first_name"));
	firstname.sendKeys("Renuka");
	WebElement lastname= driver.findElement(By.id("last_name"));
	lastname.sendKeys("Thyag");	
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("venrensan@gmail.com");
	WebElement Role= driver.findElement(By.id("job_role"));
	Select s= new Select(Role);
	s.selectByIndex(1);
	WebElement company= driver.findElement(By.id("company"));
	company.sendKeys("Dell");
	WebElement country= driver.findElement(By.id("country"));
	Select s1= new Select(country);
	s1.selectByValue("US");
	WebElement postalcode= driver.findElement(By.id("postal_code"));
	postalcode.sendKeys("75035");	
	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("sanju2002@gmail.com");	
	WebElement termschk= driver.findElement(By.xpath("//label[@for='eula']"));
	termschk.click();	
	WebElement signme= driver.findElement(By.id("submit_btn"));	
	signme.click();	
	Thread.sleep(45000);
	driver.navigate().back();
	Thread.sleep(25000);
	WebElement login= driver.findElement(By.id("login-button"));
	login.click();
	WebElement username1= driver.findElement(By.id("username"));
	username1.sendKeys("sanju2002@gmail.com");	
	WebElement pwd= driver.findElement(By.id("password"));
	pwd.sendKeys("Renuka123");
	WebElement login1= driver.findElement(By.id("Login"));
	login1.click();	
	Thread.sleep(25000);
	driver.quit();
	}

}
