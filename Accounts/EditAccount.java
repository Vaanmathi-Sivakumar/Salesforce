package Accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Actions action=new Actions(driver);
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",findElement);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Vaanmathi",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//th[@class='slds-cell-edit cellContainer']")).click();
		driver.findElement(By.xpath("//a[text()='Vaanmathi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//a[@name='Edit']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[text()='--None--']/parent::button)[3]")).click();
		//driver.findElement(By.xpath("//span[text()='Healthcare']")).click();
		driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys("abcd");
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("efgh");
		driver.findElement(By.xpath("//button[@aria-label='Customer Priority, --None--']")).click();
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		driver.findElement(By.xpath("//button[@aria-label='SLA, --None--']")).click();
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Active, --None--']/parent::div")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("99999999999");
		driver.findElement(By.xpath("(//span[text()='--None--'])[10]")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		
	}

}
