package com.framework.basePage.findby;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import com.framework.basePage.BasepageKeywords;

import static com.framework.basePage.BasepageKeywords.*;

import static com.practice.waits.WaitForElement.*;

public class Homepage {

	@FindBy(css = "div.pb-1 svg")
	WebElement closepopup;
	@FindBy(css = "div.field-1 input.c-neutral-900")
	WebElement fromtxtbox;

	@FindBy(css = "div.dropdown ul li:nth-child(1)")
	WebElement selectFromCity;

	@FindBy(css = "div.field-2 input.c-neutral-900")
	WebElement toTextBox;

	@FindBy(css = "div.dropdown ul li")
	WebElement selectToCity;

	@FindBy(css = "div.homeCalender div div.sc-aXZVg")
	WebElement clickOnCalender;

	@FindBy(css = "div.DayPicker-Month:nth-child(2) div.DayPicker-Week:nth-child(5) div.DayPicker-Day:nth-child(4)")
	WebElement selectDate;

	@FindBy(css = "button.sc-dAlyuH")
	WebElement clickonSearch;

	public void clickonClosePopup(WebElement closepopup) {
		this.closepopup.click();
		System.out.println("Successfully closed the popup");
	}

	public void enterFromCity(String cityName) {

		fromtxtbox.sendKeys(cityName);
	}

	public void selectFromCity() throws InterruptedException {
		//elementToBePresent\
		Thread.sleep(5000);
		selectFromCity.click();

	}

	public void enterToCity(String CityName) throws InterruptedException {
		Thread.sleep(5000);
		toTextBox.sendKeys(CityName);
	}

	public void selectToCity() throws InterruptedException {
		Thread.sleep(5000);
		selectToCity.click();
	}

	public void clickonCalenderforDate() {
		clickOnCalender.click();
	}

	public void selectDateFromCalender() {
		selectDate.click();
	}

	public void searchBtn() {
		clickonSearch.click();
	}
}
