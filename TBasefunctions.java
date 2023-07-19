package com.greens.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TBasefunctions {

	public static WebDriver driver;
	

	// Launch browser
	public static void browserlauncher(String option) {

		if (option.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			
		} else if (option.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	// launch url
	public static void gourl(String url) {

		driver.get(url);

	}

	// close window
	public void close() {
		driver.close();
	}

	// quit window
	public static void quit() {
		driver.quit();
	}

	// navigate to
	public static void navigateto(String url) {
		driver.navigate().to(url);

	}

	// navigate back
	public static void navigateback() {
		driver.navigate().back();
	}

	// navigate forward
	public static void navigateforward() {
		driver.navigate().forward();
	}

	// navigate refresh
	public static void navigaterefresh() {
		driver.navigate().refresh();

	}

	// Is enabled
	public static void isenable(WebElement ele) {
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
	}

	// Is displayed
	public static void isdisplayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		System.out.println(displayed);
	}

	// send keys
	public static void sendkeys(String text, WebElement ele) {
		ele.sendKeys(text);

	}

	// click
	public static void click(WebElement ele) {
		ele.click();

	}

	// clear
	public static void clear(WebElement ele) {
		ele.clear();

	}

	// Take screenshot
	public static void takescreenshot(String name) throws IOException {

		try {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File source = screen.getScreenshotAs(OutputType.FILE);
			File destination = new File("E:\\Selenium\\" + name + ".png");
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void elementscreenshot(WebElement ele, String name) throws IOException {

		try {
			File source1 = ele.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("E:\\Selenium\\" + name + ".png");
			FileUtils.copyFile(source1, destination1);
		} catch (WebDriverException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	// implicit wait
	public static void implicitwait(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}

	// Explicit wait
		public static void explicitwait(By ele, String options) 
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			if(options.equalsIgnoreCase("visibility"))
			{
			WebElement until1 = wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
			String text1 = until1.getText();
			System.out.println("Visible element: "+text1);
			}
			else if(options.equalsIgnoreCase("invisibility"))
			{
				Boolean until2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(ele));
				System.out.println(until2 + "It is invisible");
			}
			else if(options.equalsIgnoreCase("clickable"))
			{
				WebElement until3 = wait.until(ExpectedConditions.elementToBeClickable(ele));
				String text2 = until3.getText();
				System.out.println("Clickable element: "+text2);
			}
		}
		
		public static void explicitwait(By ele, String options,String text) 
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			 if(options.equalsIgnoreCase("texttobepresent"))
			{
				Boolean until4 = wait.until(ExpectedConditions.textToBePresentInElementLocated(ele,text));
				System.out.println(until4);	
			}

			

		}	

	// accept Alert
	public static void closealert() {
		driver.switchTo().alert().accept();

	}

	// dismiss alert
	public static void dismissalert() {
		driver.switchTo().alert().dismiss();
	}

	// get the text
	public static void gettext(WebElement ele) {
		String text2 = ele.getText();
		System.out.println(text2);
		
	}

	// robot enter
	public static void robotenter() throws AWTException {
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);

	}

	// robot down
	public static void robotdown(int count) throws InterruptedException {
		try {
			for (int i = 0; i <= count; i++) {
				Robot rc = new Robot();
				rc.keyPress(KeyEvent.VK_DOWN);
				rc.keyRelease(KeyEvent.VK_DOWN);
			}
			robotenter();

		} catch (AWTException e) {

			e.printStackTrace();
		}
	}

	// Actions context click
	public static void contextclick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.contextClick(ele).perform();
		;

	}

	// Actions move to element
	public static void movetoelement(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		

	}
	//Actions drag and drop
			public static void draganddrop(WebElement src,WebElement target) {

			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, target).perform();
			}

	// Dropdown index
	public static void dropindex(WebElement ele, int index) {
		Select sc = new Select(ele);
		sc.selectByIndex(index);

	}

	// Drop down text
	public static void droptext(WebElement ele, String text) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);

	}

	// Dropdown value
	public static void dropindex(WebElement ele, String text) {
		Select sc = new Select(ele);
		sc.selectByValue(text);
	}

	// Single or multiple dropdown
	public static void dropsingleormulti(WebElement ele) {
		Select sc = new Select(ele);
		boolean multiple = sc.isMultiple();
		if (multiple == true) {
			System.out.println("It is a multiple dropdown");
		} else {
			System.out.println("it is a single dropdown");
		}
	}

	// To print all the options in the dropdown
	public static void dropalloptions(WebElement ele) {
		Select sc = new Select(ele);
		List<WebElement> options = sc.getOptions();
		for (WebElement op : options) {
			String text2 = op.getText();
			System.out.println(text2);

		}

	}
	// To print the first selected option

	public static void dropfirstselect(WebElement ele, String text3) {
		Select sc = new Select(ele);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		System.out.println("The first selected option is" + text2);
		boolean equals = text3.equals(text2);
		if (equals == true) {
			System.out.println("The first selected option is validated");
		}}
		
		// Frame Handling
		public static void frame(WebElement ele) {
			
			driver.switchTo().frame(ele);	
	}
		//coming out of nested frame
		public static void parentframe(WebElement ele) {
		driver.switchTo().parentFrame();
		}
		////coming out of all frames to main page
		public static void defaultframe(WebElement ele) {
		driver.switchTo().defaultContent();
		}
}
