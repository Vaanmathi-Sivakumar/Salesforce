package Opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NewOpportunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Actions action=new Actions(driver);
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",findElement);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='Name']"));
		je.executeScript("arguments[0].click();",findElement2);
		findElement2.sendKeys("Salesforce Automation by vaan");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		driver.findElement(By.xpath("//span[text()='--None--']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText());
		
	}

}
