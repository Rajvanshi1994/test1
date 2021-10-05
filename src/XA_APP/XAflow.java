package XA_APP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XAflow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://xa-ui-appservice-mvp2.azurewebsites.net/";

		driver.get(url);

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Login User name: Ben.barber@xagroup.com
		        //Password: @ben.barber


		driver.findElement(By.id("userName")).sendKeys("Ben.barber@xagroup.com");
		driver.findElement(By.id("password")).sendKeys("@ben.barber");
		driver.findElement(By.xpath("//*[@id=\'root\']/div/section/div/div[2]/div[3]/button")).click();

		WebElement uploadElement = driver.findElement(By.id("camera"));

		Thread.sleep(3000);

		uploadElement.sendKeys("C:\\ddata\\IMG_1661.jpg");

		Thread.sleep(15000);

		// ANALYZE
		driver.findElement(By.xpath("//*[@id=\'root\']/div/section/div/div[3]/button")).click();

		Thread.sleep(15000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("scroll(500, 0)"); // if the element is on top.

		jse.executeScript("scroll(0, 500)"); // if the element is on bottom.

		Thread.sleep(3000);

		// CALCULATE ESTIMATE
		driver.findElement(By.xpath("//*[@id=\'root\']/div/section/div/div[3]/button")).click();
		System.out.println("Calculate the Estimate");

		Thread.sleep(3000);

		// APPROVE
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/section/div/div[2]/div[3]/button[1]")).click();
		System.out.println("Approve");
		
		Thread.sleep(3000);

		// SAVE ESTIMATE
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/section/div/div[2]/div[4]/button")).click();
		System.out.println("Save Estimate");
		Thread.sleep(9000);

		// HOME IMG
		driver.findElement(By.xpath("/html/body/div/div/div[2]/section/div/div[1]/a[2]/img")).click();
		System.out.println("Go to Home page");

		Thread.sleep(3000);

		// LOGOUT
		driver.findElement(By.xpath("//*[@id=\'root\']/div/section/div/div[2]/div[3]/a[3]")).click();
		System.out.println("Logout");
		System.out.println("Smoke testing Done ");

		Thread.sleep(8000);
		driver.close();
		
		}
	
		}

		
		
	

