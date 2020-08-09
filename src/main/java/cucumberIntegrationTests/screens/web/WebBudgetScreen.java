package cucumberIntegrationTests.screens.web;

import UITestFramework.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * contains all the locators present on the login Screen
 */
public class WebBudgetScreen
        extends GenericMethods {

	public WebBudgetScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By PicLocTextBox = By.id("PicLoc_value");
	public By PicLocSearchList = By.xpath("//*[@id=\"PicLoc_dropdown\"]/div[3]/div[1]/div[2]/div/div/span[1]");
	public By FromDateTextBox= By.id("from");
	public By ToDateTextBox= By.id("to");
	public By SelectMyCar= By.id("res-home-select-car");
	public By PickUpMessage= By.className("location-info");
	public By VehiclesFilter= By.id("res-vehicles-filter-by-vehicle-type");
	public By VehiclesType= By.xpath("//*[@id=\"myDiv\"]/div/div/ul/li[4]/div/img");

	public By VehiclesSort= By.id("res-vehicles-sort");
	public By VehiclesSortList= By.partialLinkText("Price (Low to High)");
	public By ViewVehicleInformation= By.id("res-vehicles-details");
	public By ViewVehicleDoors= By.className("four-door-feat");
	public By ViewVehicleSeats= By.className("four-seats-feat");
	public By SelectButton= By.xpath("//*[@id=\"reservation-partial\"]/div/div[1]/section/div[1]/*/div/section/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]");
	public By PayNowButtonOne= By.xpath("//*[@id=\"res-vehicles-pay-now\"]/div/div/div[3]");
	public By BaseRateSelectCarPageOne= By.xpath("//*[@id=\"reservation-partial\"]/div/div[1]/section/div[1]/*/div/section/div[1]/div/div[2]/div[2]/div[2]/div[1]/span");
	public By PayNowButton= By.id("res-vehicles-pay-now");
	public By VehicleTypeInSelectCarPage= By.xpath("//*[@id=\"reservation-partial\"]/div/div[1]/section/div[1]/*/div/section/div[1]/div/div[1]/div[2]/h3");
	public By VehicleTypeInRentalOptionsPage= By.className("vehicle-name");
	public By BaseRateSelectCarPage= By.xpath("//*[@id=\"reservation-partial\"]/div/div[1]/section/div[1]/*/div/section/div[1]/div/div[2]/div/*/*/price/span");
	public By BaseRateRentalOptions= By.xpath("//*[@id=\"vehicleTeaser\"]/div[2]/div/div[1]/div/section/div/div[2]/div[2]/div[2]/span[2]/span[2]");
	public By FeeRentalOptions= By.xpath("//*[@id=\"vehicleTeaser\"]/div[2]/div/div[1]/div/section/div/div[2]/div[2]/div[5]/span[2]/span[2]");
	public By EstimatedTotal = By.xpath("//*[@id=\"vehicleTeaser\"]/div[2]/div/div[1]/div/section/div/div[2]/div[2]/div[6]/span[2]/span[2]");
	public By ContinueButton= By.id("res-extras-continue-top");
	public By AmountPrepaid= By.xpath("//*[@id=\"amt-prepaid\"]/span[2]/span");















}

