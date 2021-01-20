package selHandsonPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\venkatasubramanian\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		WebElement username1= driver.findElement(By.id("username"));
		username1.sendKeys("sanju2002@gmail.com");	
		WebElement pwd= driver.findElement(By.id("password"));
		pwd.sendKeys("Renuka123");
		WebElement login1= driver.findElement(By.id("Login"));
		login1.click();	
		Thread.sleep(40000);
		//below lines of code will select user option from multiple drop down options	
	 driver.findElement(By.xpath("//a[@title='Create Menu']//span")).click();
	List <WebElement> dropdown= driver.findElements(By.xpath("//span[@class='slds-align-middle']"));	
	for(int i=0;i<dropdown.size();i++) {
	String desiredText= dropdown.get(i).getText();
	if(desiredText.equalsIgnoreCase("user")) {
		dropdown.get(i).click();
		Thread.sleep(5000);
		break;
	}
	}
	
	/* user selection logic ends here*/
	/*There is a frame in the webpage and lets identify the frame and switch to it*/
	/* WebElement frame1= driver.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
     driver.switchTo().frame(frame1);
     driver.findElement(By.id("name_firstName")).clear();/*jus to clr the field*/
    /* driver.findElement(By.id("name_firstName")).sendKeys("Shravan");
     driver.findElement(By.xpath("//img[@alt='Individual Lookup (New Window)']")).click();
     Thread.sleep(3500);
     /*In this instance, another window is opened.  there r two windows now
      * using window handles we r getting all the windows information and 
      * storing in a set
      * List and Set are used to store multiple values.  one diff is list accepts 
      * duplicates whereas no duplicates are allowed in  set*/
     /*Set <String> wins= driver.getWindowHandles();
     //iterator will place the cursor at the starting position of the set
     Iterator <String> iter= wins.iterator();
     String first= iter.next();
     String second= iter.next();
     driver.switchTo().window(second);
     driver.switchTo().frame("searchFrame");
     driver.findElement(By.id("lksrch")).sendKeys("Renu");
     driver.close();//closes current window
     driver.switchTo().defaultContent();//or window(first)
     */
     
	
	
	
	
	
	}

}
