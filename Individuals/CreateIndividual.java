package Individuals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateIndividual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		Actions  action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement element= driver.findElement(By.xpath("//p[text()='Invoices']"));
		action.scrollToElement(element).perform();
		driver.findElement(By.xpath("//p[text()='Individuals']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//button[@title='Save & New']/following::span[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(text);
	}

}
