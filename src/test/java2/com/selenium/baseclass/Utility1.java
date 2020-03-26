package com.selenium.baseclass;


import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility1 {
	public static WebDriver driver;

	// BROWSER_lAUNCH
	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user dir") + ("\\resources\\geckodriver.exe"));
			driver = new InternetExplorerDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user dir") + ("\\resources\\firefoxdriver.exe"));
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid BrowserName");
		}
		return driver;

	}

	// TO GET URL
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	// EXPLICITY WAIT
	public static void waitForElementVisiblity(WebElement element) {
		WebDriverWait wc = new WebDriverWait(driver, 40);
		wc.until(ExpectedConditions.visibilityOf(element));
	}

	// explicity particulAR
	public static void waitForElementVisiblity1(WebElement element) {
		WebDriverWait wc = new WebDriverWait(driver, 30);
		wc.until(ExpectedConditions.elementToBeSelected(element));
	}

	// IsDISPLAYED
	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		//System.out.println("The element is DisPlayed  :" + displayed);
		return displayed;
	}

	// IS ENABLED
	public static boolean elementisEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
	//System.out.println("The element is Enabled :" + enabled);
		return enabled;
	}

	// IS SELECTED
	public static boolean elementisSelected(WebElement element) {
		boolean selected = element.isSelected();
		//System.out.println("The element is Selected :" + selected);
		return selected;
	}

	// GET TEXT
	public static String getText(WebElement element) {
		waitForElementVisiblity(element);
		elementIsDisplayed(element);
		String text = element.getText();
		return text;
		//System.out.println("The values is " + text);
	}

	// GETATTRIBUTEVALUE
	public static String getAttribute(WebElement element, String options) {
		waitForElementVisiblity(element);
			String attribute = element.getAttribute(options);
		return attribute;
	}

	// GETTITLE
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("The Browser Title is :" + title);
	}

	// getCurrentUrl
	private void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current url is :" + currentUrl);
	}

	// clear
	private void clear(WebElement element) {
		waitForElementVisiblity(element);
		element.clear();
	}

	// Sendkeys
	public static void sendInput(WebElement element, String value) {
		waitForElementVisiblity(element);
		if (elementIsDisplayed(element) && (elementisEnabled(element))) {
			element.clear();
			element.sendKeys(value);
			//driver.switchTo().defaultContent();
		}

	}

	// CLICKONELEMENT
	public static void clickOnElement(WebElement element) {
		// waitForElementVisiblity(element);
		if (elementisEnabled(element) == true) {
			element.click();
		}

	}

	// DropDown
	public static void dropDown(WebElement element, String options, String i) {
		// waitForElementVisiblity(element);
		Select sc = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			sc.selectByIndex(Integer.parseInt(i));
		} else if (options.equalsIgnoreCase("value")) {
			sc.selectByValue(i);
		} else if (options.equalsIgnoreCase("text")) {
			waitForElementVisiblity(element);
			sc.selectByVisibleText(i);
		} else {
			System.out.println("Invalid Selector Option");
		}
	}

	// scroll
	public static void scrollToElement(WebElement element) {
		waitForElementVisiblity(element);
		JavascriptExecutor ji = (JavascriptExecutor) driver;
		ji.executeScript("arguments[0].scrollIntoView();", element);
	}

	// scrollbypixels
	public static void scrollByPixel(int a, int b) {
		JavascriptExecutor ju = (JavascriptExecutor) driver;
		ju.executeScript("window.scrollTo(" + a + "," + b + ")");

	}

	// mouseclick
	public static void performClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().build().perform();
	}
	public static void moveToElement(WebElement element) {
		waitForElementVisiblity(element);
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// Double click
	public static void performDoubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).doubleClick().build().perform();
	}

	// RightClick
	public static void performContextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).contextClick().build().perform();
	}

	// dragandDrop
	public static void dragAndDrop(WebElement element1, WebElement element2) {
		Actions as = new Actions(driver);
		as.dragAndDrop(element1, element2).build().perform();
	}

	// ScreenShot
	public static void takeScreenShot(String name) throws Throwable {
		String t=new SimpleDateFormat("yyyy-MM-dd HH-MM-SS").format(new Date(0));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\HP\\eclipse-workspace156\\MavenProject\\Reports" + name + ".png");
		FileUtils.copyFile(Source, Destination);
	}

	// Alerts simple
	public static void popUp1() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// confirm
	public static void popUp2(String option) {
		Alert al = driver.switchTo().alert();
		if (option.equalsIgnoreCase("Accept")) {
			al.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			al.dismiss();
		}

	}

	// prompt
	public static void popUp3(String option, String value) {
		Alert al = driver.switchTo().alert();
		if (option.equalsIgnoreCase("Accept")) {
			al.sendKeys(value);
			al.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			al.sendKeys(value);
			al.dismiss();
		}

	}

	// Navigation
	public static void navigate(String options, String url) {
		if (options.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (options.equalsIgnoreCase("to")) {
			driver.navigate().to(url);
		} else if (options.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else {
			System.out.println("No More Navigation");
		}
	}

	// ActionsUSingSendkeys
	public static void inputViaMouse(WebElement element, String value) {
		Actions af = new Actions(driver);
		af.sendKeys(element, value);
	}

	// SendMultiple
	public static String sendMultipleInput(WebElement element, String name) {
		waitForElementVisiblity(element);
		// RandomStringUtils rs = new RandomStringUtils();
		// String rand = rs.randomAlphanumeric(6);
		String a = name;
		String app = "@gmail.com";
		String A = a.concat(app);
		return A;
	}

	// click
	public static void click(WebElement element) {
		waitForElementVisiblity(element);
		element.click();
	}
//BrowserQuit
	public static void browserQuit() {
driver.quit();
	}
	//getData
	public static String Xcel(int r,int c) throws Throwable {
		// TODO Auto-generated method stub

	File f=new File("C:\\Users\\HP\\eclipse-workspace156\\Cucumber\\Exceladactin.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet sh = w.getSheetAt(0);
	Row row = sh.getRow(r);
	Cell cell = row.getCell(c);
	CellType d = cell.getCellType();
	String value1=null;
	if (d.equals(CellType.NUMERIC)) {
		double k = cell.getNumericCellValue();
		long l=(long)k;
		 value1 = String.valueOf(l);
	}
	else if (d.equals(CellType.STRING)) {
		value1=cell.getStringCellValue();
	}
	return value1;
	
	
	
	
	}
	
	
	
	
	
}