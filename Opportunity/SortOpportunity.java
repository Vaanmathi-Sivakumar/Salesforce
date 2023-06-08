package Opportunity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SortOpportunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
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
		
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon slds-button_icon-more'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='slds-truncate']/lightning-primitive-icon")).click();
		//driver.findElement(By.xpath("(//span[text()='Sort'])[5]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='toggle slds-th__action slds-text-link--reset '])[5]"));
		action.doubleClick(findElement2).perform();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='uiOutputDate']"));
		for(int i=1;i<findElements.size();i++)
		{
			Thread.sleep(2000);
			String text = driver.findElement(By.xpath("(//span[@class='uiOutputDate'])["+i+"]")).getText();
			System.out.println(text);
		}
	}

}
