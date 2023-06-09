package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Tasks']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
		driver.findElement(By.xpath("//span[contains(@class,'triggerLinkText selectedListView')]")).click();
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bootcamp']")).click();
		driver.findElement(By.xpath("//li[contains(@class,'slds-button slds-button--')][4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText());
	}

}
