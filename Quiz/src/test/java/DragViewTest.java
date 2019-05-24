import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragViewTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/main/resources/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		//options.setHeadless(true);
		driver = new FirefoxDriver(options);
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void successfulDrag() {
driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		
		
		WebElement dragged = driver.findElement(By.cssSelector(".v-grid-row-focused"));
		WebElement dropped = driver.findElement(By.cssSelector(".v-grid-body-drag-top"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragged, dropped).perform();
		System.out.println("Success");
		driver.close();
	}


	@Test
	public void successfulDragBack() {
driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		
		
		WebElement dragged = driver.findElement(By.cssSelector(".v-grid-row-dragged"));
		WebElement dropped = driver.findElement(By.cssSelector(".v-grid-row-drag-top > .v-grid-cell:nth-child(5)"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragged, dropped).perform();
		System.out.println("Success");
		driver.close();
	}


	@Test
	public void backButton() {
driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 100);
		wait5.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionID"));
		System.out.println("Success");		    
	}
	@Test
	public void testNameAutoGenerated() {

driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		assertNotNull("Textfield is empty",driver.findElement(By.cssSelector(".v-textfield")));
		System.out.println("Success");		    
	}
	@Test
	public void saveAsTest() {
driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		WebElement dragged = driver.findElement(By.cssSelector(".v-grid-row-focused"));
		WebElement dropped = driver.findElement(By.cssSelector(".v-grid-body-drag-top"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragged, dropped).perform();
		driver.findElement(By.id(".v-textfield")).sendKeys("new");
		driver.findElement(By.cssSelector(".v-slot:nth-child(7) > .v-button")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 100);
		wait5.until(ExpectedConditions.urlToBe("http://localhost:8080/#!tests"));
		System.out.println("Success");	

	}
	@Test
	public void saveAsExam() {
driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		WebElement dragged = driver.findElement(By.cssSelector(".v-grid-row-focused"));
		WebElement dropped = driver.findElement(By.cssSelector(".v-grid-body-drag-top"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragged, dropped).perform();
		driver.findElement(By.id(".v-textfield")).sendKeys("neww");
		driver.findElement(By.cssSelector(".v-slot:nth-child(9) > .v-button")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 100);
		wait5.until(ExpectedConditions.urlToBe("http://localhost:8080/#!tests"));
		System.out.println("Success");	
	}


	@Test
	public void viewQuizzes() {
driver.get("http://localhost:8080/");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("gwt-uid-3")));
		driver.findElement(By.id("gwt-uid-3")).sendKeys("nikola");
		driver.findElement(By.id("gwt-uid-5")).sendKeys("1234");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 100);
		wait6.until(ExpectedConditions.urlToBe("http://localhost:8080/#!home"));
		
		driver.findElement(By.cssSelector(".v-grid-row:nth-child(5) > .v-grid-cell")).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 100);
		wait7.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionGrid"));
		
		driver.findElement(By.cssSelector(".v-slot:nth-child(5) > .v-button")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 100);
		wait3.until(ExpectedConditions.urlToBe("http://localhost:8080/#!drag"));
		driver.findElement(By.cssSelector(".v-slot:nth-child(11) > .v-button")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 100);
		wait5.until(ExpectedConditions.urlToBe("http://localhost:8080/#!questionID"));
		System.out.println("Success");	
	}

}