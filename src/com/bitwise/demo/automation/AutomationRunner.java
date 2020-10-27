package com.bitwise.demo.automation;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationRunner {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("http://google.com");

		// webLocatorIdentification();
		// handlingDropdowns();
		// handlingAlerts();
		task2();
		 //handingWindows();
		// handlingActions();
	}

	/*
	 * Locators -7 ways ID . Name Link Text and Partial link text Tag Name Class
	 * Name CSS Selector Xpath https://demoqa.com/automation-practice-form Site
	 * : https://demoqa.com/
	 */
	public static void webLocatorIdentification() {
		// driver.get("https://demoqa.com/text-box");
		//
		// WebElement txt_fullName = driver.findElement(By.id("userName"));
		// txt_fullName.sendKeys("Ravindra Mandage");
		//
		driver.get("https://demoqa.com/links");

		// WebElement link_home = driver.findElement(By.id("simpleLink"));
		// WebElement link_home = driver.findElement(By.tagName("a"));

		// WebElement link_home = driver.findElement(By.linkText("Home"));
		// WebElement link_home =
		// driver.findElement(By.partialLinkText("Home"));

		List<WebElement> link_allHomeLinks = driver.findElements(By
				.partialLinkText("Home"));

		System.out.println("Size = " + link_allHomeLinks.size());

		for (WebElement eachElement : link_allHomeLinks) {
			System.out.println(eachElement.getText());
		}

		// link_home.click();

	}

	// https://www.guru99.com/select-option-dropdown-selenium-webdriver.html

	public static void handlingDropdowns() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement drp_country = driver.findElement(By.name("country"));

		Select drp_coountryName = new Select(drp_country);
		// drp_coountryName.selectByVisibleText("INDIA");
		// drp_coountryName.selectByIndex(2);
		// drp_coountryName.selectByValue("ALGERIA");
	}

	/*
	 * https://www.toolsqa.com/selenium-webdriver/alerts-in-selenium/ Types
	 * Simple Prompt - input is needed Confirmation
	 */
	public static void handlingAlerts() throws InterruptedException {

		/*
		 * WebElement alert_simple = driver.findElement(By.id("alertButton"));
		 * alert_simple.click(); WebElement alert_confirmation = WebElement
		 * alert_prompt = Alert simpleAlert = driver.switchTo().alert();
		 * System.out.println(simpleAlert.getText()); simpleAlert.accept();
		 */

		driver.get("https://demoqa.com/automation-practice-form");
		WebElement txt_firstName = driver.findElement(By.id("firstName"));
		System.out.println(" Water mark = "
				+ txt_firstName.getAttribute("placeholder"));
		driver.get("https://demoqa.com/alerts");

		WebElement btn_simpleAlert = driver.findElement(By.id("alertButton"));
		btn_simpleAlert.click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();

		driver.findElement(By.id("promtButton")).click();
		Alert myAlert = driver.switchTo().alert();
		System.out.println("Alert text = " + myAlert.getText());
		myAlert.sendKeys("Test user");
		Thread.sleep(10000);
		myAlert.accept();

	}

	/*
	 * JavascriptExecutor jse = (JavascriptExecutor) driver;
	 * jse.executeScript("arguments[0].click()", btn_goToStore);
	 * jse.executeScript("scroll(0, 250)");
	 */
	public static void task2() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demoqa.com/login");

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(
				"RAVI_TEST_2020");
		driver.findElement(By.cssSelector("#password")).sendKeys("Test@2020");
		driver.findElement(By.id("login")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("main-header"))));
		
		// click on Goto Store button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 250)");

		driver.findElement(By.id("gotoStore")).click();
		
		Thread.sleep(10000);

		// finding a book
		driver.findElement(By.linkText("Git Pocket Guide")).click();

		Thread.sleep(10000);
		// click on add to your collection
		js.executeScript("scroll(0, 250)");
		List<WebElement> btn_bottomButtons  = driver.findElements(By.id("addNewRecordButton"));
		System.out.println("Botton button names ");

		btn_bottomButtons.get(1).click();
		
		Thread.sleep(10000);
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		// switching to alert
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Message = " + simpleAlert.getText());
		simpleAlert.accept();

	}

	public static void handingWindows() throws Exception {

		driver.get("http://demo.guru99.com/popup.php");

		String currentHandle =  driver.getWindowHandle();
		System.out.println(" page 1 handle = "+ driver.getWindowHandle());
		
		 Set<String> allhandlesBeforeClick= driver.getWindowHandles();
		 System.out.println("size = "+allhandlesBeforeClick.size());
		 
		
		driver.findElement(By.linkText("Click Here")).click();
		
		 Set<String> allhandlesAfterClick = driver.getWindowHandles();
		 System.out.println("Size = "+allhandlesAfterClick.size());
		 System.out.println("Title of first page = "+driver.getTitle());
		 
		 for(String eachHandle: allhandlesAfterClick){
			 if(!(eachHandle.equalsIgnoreCase(currentHandle))){
				 driver.switchTo().window(eachHandle);
				 driver.get("http:www.google.com");
				 System.out.println("Title of page 2 = "+driver.getTitle());
				 break;
			 }
		 }
		
		 driver.switchTo().window(currentHandle);
		 System.out.println("After switching back to original window ="+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void handlingActions() {

		driver.get("http://www.google.com");

		Actions actios = new Actions(driver);

		WebElement logo = driver.findElement(By.id("hplogo"));

		actios.moveToElement(logo).contextClick().sendKeys(Keys.DOWN)
				.sendKeys(Keys.DOWN).build().perform();

	}

}
