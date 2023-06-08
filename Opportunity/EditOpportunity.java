package Opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditOpportunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
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
		Thread.sleep(2000);

		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		findElement2.click();
		findElement2.sendKeys("Salesforce Automation by vaan",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();

		
		driver.findElement(By.xpath("//a[@name='Edit']/span")).click();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[7]/span")).click();

		
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='--None--'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='In progress']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']//span"));
		System.out.println(findElement3.getText());

		
	}

}
