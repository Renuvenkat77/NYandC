package selHandsonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceCreateUser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatasubramanian\\Desktop\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		WebElement username1= driver.findElement(By.id("username"));
		username1.sendKeys("sanju2002@gmail.com");	
		WebElement pwd= driver.findElement(By.id("password"));
		pwd.sendKeys("Renuka123!");
		WebElement login1= driver.findElement(By.id("Login"));
		login1.click();	
		
		Thread.sleep(40000);
		String win= driver.getWindowHandle();
		WebElement createmenu= driver.findElement(By.xpath("//span[@class='label']"));
        createmenu.click();
		WebElement useroption= driver.findElement(By.xpath("//span[@class='slds-align-middle'][1]"));
        useroption.click();
       Thread.sleep(40000);
       
        for(int i=8; i<=10; i++)
		{
       WebElement frame1= driver.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
       driver.switchTo().frame(frame1);
       String newuserwin=driver.getWindowHandle();
        	//WebElement ufirstname= driver.findElement(By.xpath("//label[@for='name_firstName']"));
       driver.findElement(By.id("name_firstName")).sendKeys("Shravan"+i);
        //WebElement ufirstname= driver.findElement(By.xpath("//*[@id=\'name_firstName\']"));
       driver.findElement(By.id("name_lastName")).sendKeys("venkat"+i); 
        // WebElement ulastname= driver.findElement(By.xpath("//input[@id='name_lastName']"));
        //WebElement ulastname= driver.findElement(By.xpath("//*[@id=\'name_lastName\']"));
       driver.findElement(By.id("Alias")).sendKeys("Shra"+i);
       driver.findElement(By.id("Email")).sendKeys("Shravan"+i+"@gmail.com"); 
       driver.findElement(By.id("Username")).sendKeys("Shravanv"+i+"@gmail.com");
       
        /*WebElement profile= driver.findElement(By.xpath("//select[@id='Profile']"));
        profile.click();
        Select s1= new Select(profile);
        s1.selectByIndex(0);*/
        WebElement savennew= driver.findElement(By.xpath("//td[@class='pbButton']/*[2]"));
	    savennew.click();
	    Thread.sleep(7000);
driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--neutral uiButton forceActionButton']//*[1]")).click();
	driver.switchTo().window(newuserwin);
	
	
		}
	
	
	
	
	
	
	
	
	}

}
