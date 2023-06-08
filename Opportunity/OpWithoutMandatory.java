package Opportunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpWithoutMandatory {

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
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		System.out.println(findElement2.getText());
	}

}
