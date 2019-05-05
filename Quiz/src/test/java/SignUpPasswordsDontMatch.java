// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.vaadin.event.Action;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class SignUpPasswordsDontMatch {

	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void SignUpPasswordMatch() {

		driver.get("http://localhost:8080/#!signup");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".v-slot:nth-child(1) > .v-button")));

		driver.findElement(By.id("gwt-uid-3")).click();
		driver.findElement(By.id("gwt-uid-3")).sendKeys("A");
		driver.findElement(By.id("gwt-uid-5")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("A");
		driver.findElement(By.id("gwt-uid-7")).click();
		driver.findElement(By.id("gwt-uid-7")).sendKeys("A");
		driver.findElement(By.id("gwt-uid-9")).click();
		driver.findElement(By.id("gwt-uid-9")).sendKeys("A");
		driver.findElement(By.id("gwt-uid-11")).click();
		driver.findElement(By.id("gwt-uid-11")).sendKeys("a");
		driver.findElement(By.id("gwt-uid-13")).click();
		driver.findElement(By.id("gwt-uid-13")).sendKeys("b");
		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();

		driver.findElement(By.cssSelector(".v-slot:nth-child(1) > .v-button")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 5);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-errorindicator")));
	}
}

