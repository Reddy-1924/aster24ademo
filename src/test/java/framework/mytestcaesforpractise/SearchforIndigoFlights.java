package framework.mytestcaesforpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.framework.basePage.BaseTest;
import com.framework.basePage.BasepageKeywords;
import com.framework.basePage.findby.Homepage;

import static com.framework.basePage.BasepageKeywords.*;
import static com.framework.basePage.LocatorName.*;

public class SearchforIndigoFlights extends BaseTest {

	public void searchforflightandclickonindigoflights() throws InterruptedException {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=Cj0KCQjw097CBhDIARIsAJ3-nxfp-3HSwAVETbU3AAGv7oU97WEj4pfWAmC72qlVdHZB4WAwYUPSx8saAkG0EALw_wcB&gad_source=1&gad_campaignid=88884643&gbraid=0AAAAADu9zM3dQV32C_8Pa4414X-F1bIIP&gclid=Cj0KCQjw097CBhDIARIsAJ3-nxfp-3HSwAVETbU3AAGv7oU97WEj4pfWAmC72qlVdHZB4WAwYUPSx8saAkG0EALw_wcB");
		driver.manage().window().maximize();
		// Close the popup
		driver.findElement(By.cssSelector("div.pb-1 svg")).click();
		// click on flights link
		driver.findElement(By.cssSelector("div.euFDuA div")).click();
		System.out.println("Enter From city");
		// driver.findElement(By.cssSelector("div.field-1
		// input.c-neutral-900")).click();
		driver.findElement(By.cssSelector("div.field-1 input.c-neutral-900")).sendKeys("Hyderabad");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div.dropdown ul li:nth-child(1)")).click();

		System.out.println("Enter To city");
		// driver.findElement(By.cssSelector("div.field-2
		// input.c-neutral-900")).click();
		driver.findElement(By.cssSelector("div.field-2 input.c-neutral-900")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.dropdown ul li")).click();

		System.out.println("Select the date ");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.homeCalender div div.sc-aXZVg")).click();
		driver.findElement(By.cssSelector(
				"div.DayPicker-Month:nth-child(2) div.DayPicker-Week:nth-child(5) div.DayPicker-Day:nth-child(4)"))
				.click();
		driver.findElement(By.cssSelector("button.sc-dAlyuH")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250);");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//p[text()='Air India'])[1]")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 700);");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//p[text()='Air India Express'])[1]")).click();

		List<WebElement> IndigoFligts = driver
				.findElements(By.cssSelector("div.ms-grid-column-1 >div div p.c-neutral-900"));
		SoftAssert soft = new SoftAssert();
		for (WebElement Flights : IndigoFligts) {

			System.out.println("Name of the Flight is :" + Flights.getText());
			soft.assertTrue(Flights.getText().equalsIgnoreCase("IndiGo"));

		}

		soft.assertAll();
	}

	
	public void clickonindigoflightUsingKeywords() {
		clickonWebElements(CSSSELECTOR, "div.pb-1 svg");
		clickonWebElements(CSSSELECTOR, "div.euFDuA div");
		enterTextvaluesintoElements(CSSSELECTOR, "div.field-1 input.c-neutral-900", "Hyderabad");
		clickonWebElements(CSSSELECTOR, "div.dropdown ul li:nth-child(1)");
		enterTextvaluesintoElements(CSSSELECTOR, "div.field-2 input.c-neutral-900", "Mumbai");
	}

	@Test
	public void selectIndioFlightsusingPOM() throws InterruptedException {
		
		Homepage home = PageFactory.initElements(driver, Homepage.class);
		home.clickonClosePopup(null);
		home.enterFromCity("Mumbai");
		home.selectFromCity();
		home.enterToCity("Hyderabad");
		home.clickonCalenderforDate();
		home.selectDateFromCalender();
		home.searchBtn();
	}

}
