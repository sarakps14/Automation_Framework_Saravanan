package cucumberIntegrationTests.stepDefinitions.common;


import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.web.WebBudgetScreen;
import logger.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BudgetSteps {

    WebBudgetScreen WebBudgetScreen;
    WebDriver driver;
    Properties configFileObject;
    BaseSteps baseStepsContext;
    Map<String,String> storedValues = new HashMap<String,String>();



    public BudgetSteps(BaseSteps baseSteps) {
        baseStepsContext = baseSteps;
        driver = baseStepsContext.driver;
        WebBudgetScreen = baseStepsContext.WebBudgetScreen;
        configFileObject = CreateSessionCucumber.localeConfigProp;
    }


    @And("User should lunch the Buget portal")
    public void lunchURL() throws Exception {
       Log.info("----------------------------------------------------------------------------------------");
       Log.info("User should lunch the Buget portal -" +configFileObject.getProperty("URL"));;
       Log.info("----------------------------------------------------------------------------------------");
       driver.get(configFileObject.getProperty("URL"));
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       WebBudgetScreen.TakenScreenshot("1");
    }

    @And("Choose Pick-Up location as \"([^\"]*)\"")
    public void enterTheLocation(String location) throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Choose Pick-Up location as "+ location);
        Log.info("----------------------------------------------------------------------------------------");
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.PicLocTextBox )).clear();
        WebElement name=driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.PicLocTextBox ));
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.PicLocTextBox )).sendKeys(location);
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.PicLocSearchList)).click();
        WebBudgetScreen.TakenScreenshot("2");
    }
    @And("Choose Pickup Date and Return Date")
    public void dateSettings() throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Choose Pickup Date and Return Date");
        Log.info("----------------------------------------------------------------------------------------");
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.FromDateTextBox)).clear();
            driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.FromDateTextBox)).sendKeys(WebBudgetScreen.DateCalculator(7));
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.ToDateTextBox)).clear();
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.ToDateTextBox)).sendKeys(WebBudgetScreen.DateCalculator(14));
        WebBudgetScreen.TakenScreenshot("3");
    }
    @Then("Click on Select My Car and validate pickup and return locations as \"([^\"]*)\"")
    public void ValidatingPickupAndReturnLocations(String location) throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Click on Select My Car and validate pickup and return locations as " +location);
        Log.info("----------------------------------------------------------------------------------------");
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.SelectMyCar)).click();
        String pickUpLocation=driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.PickUpMessage)).get(0).getText();
        String returnLocation=driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.PickUpMessage)).get(0).getText();
        storedValues.put("pickUpLocation" ,pickUpLocation);
        storedValues.put("returnLocation" ,returnLocation);
        Log.info("pickUpLocation :" +pickUpLocation);
        Log.info("returnLocation :" +returnLocation);
        Assert.assertEquals(location,  pickUpLocation);
        Assert.assertEquals(location,  returnLocation);
        WebBudgetScreen.TakenScreenshot("4");
    }

    @And ("Filter with SUV vehicles and Identify Low Price SUV vehicles and click on the Pay Now")
    public void FilterVehicles() throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Filter with SUV vehicles and Identify Low Price SUV vehicles and click on the Pay Now");
        Log.info("----------------------------------------------------------------------------------------");
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.VehiclesFilter)).click();
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.VehiclesType)).click();
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.VehiclesSort)).click();
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.VehiclesSortList)).click();
        WebBudgetScreen.TakenScreenshot("5");
    }

    @When("Checking the Vehicle Information and click on the Pay Now")
    public void CheckingVehicleInformation() throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Checking the Vehicle Information and click on the Pay Now");
        Log.info("----------------------------------------------------------------------------------------");
        List<WebElement> vehicleInformationList =driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.ViewVehicleInformation));
        Log.info("vehicleInformationList size :" +vehicleInformationList.size());
        for(int i =0;i<vehicleInformationList.size();i++)
        {
            driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.ViewVehicleInformation)).get(i).click();
            String doors=driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.ViewVehicleDoors)).get(i).getText();
            String seats=driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.ViewVehicleSeats)).get(i).getText();
            Log.info("doors :" +doors);
            Log.info("seats :" +seats);
            if (doors.equalsIgnoreCase("4 Doors") && seats.equalsIgnoreCase("5 seats"))
            {

                    String vehicleTypeInSelectCarPage = driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.VehicleTypeInSelectCarPage)).get(i).getText();
                    storedValues.put("vehicleTypeInSelectCarPage", vehicleTypeInSelectCarPage);
                    Log.info("vehicleTypeInSelectCarPage :" +vehicleTypeInSelectCarPage);
                    try {
                        String baseRateSelectCarPage = driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.BaseRateSelectCarPageOne)).getText();
                        Log.info("baseRateSelectCarPage :" +baseRateSelectCarPage);
                        storedValues.put("baseRateSelectCarPage", baseRateSelectCarPage);
                        driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.SelectButton)).get(i).click();
                        driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.PayNowButtonOne)).get(i).click();

                      }
                    catch (Exception e ){
                        System.out.println(e);
                    }
                    try{
                           String baseRateSelectCarPage = driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.BaseRateSelectCarPage)).getText();
                           Log.info("baseRateSelectCarPage :" +baseRateSelectCarPage);
                           storedValues.put("baseRateSelectCarPage", baseRateSelectCarPage);
                           driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.PayNowButton)).get(i).click();
                     }
                    catch (Exception e ){
                        System.out.println(e);
                    }
                    break;
            }

        }
        WebBudgetScreen.TakenScreenshot("6");
    }

    @And ("Capture and validate pickup and return locations from the previous page")
    public void ValidatePickupAndReturnLocations() {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Capture and validate pickup and return locations from the previous page");
        Log.info("----------------------------------------------------------------------------------------");
        Assert.assertEquals(storedValues.get("returnLocation"),  driver.findElements(WebBudgetScreen.drawMethod(WebBudgetScreen.PickUpMessage)).get(0).getText());
        Assert.assertEquals(storedValues.get("pickUpLocation"),  driver.findElements((WebBudgetScreen.PickUpMessage)).get(1).getText());
    }

    @And ("Validate Vehicle Type from chosen vehicle List")
    public void ValidateVehicleType() throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Validate Vehicle Type from chosen vehicle List");
        Log.info("----------------------------------------------------------------------------------------");
        String vehicleTypeInRentalOptionsPage=driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.VehicleTypeInRentalOptionsPage)).getText();
        Log.info("vehicleTypeInRentalOptionsPage :" +vehicleTypeInRentalOptionsPage);
        storedValues.put("vehicleTypeInRentalOptionsPage",vehicleTypeInRentalOptionsPage);
        Assert.assertEquals(storedValues.get("vehicleTypeInSelectCarPage"),  storedValues.get("vehicleTypeInRentalOptionsPage"));
        WebBudgetScreen.TakenScreenshot("7");
    }
    @And ("Capture BaseRate and Fees Taxes and validate base rate from the previous page")
    public void ValidateBaseRateAndFee() throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Validate Vehicle Type from chosen vehicle List");
        Log.info("----------------------------------------------------------------------------------------");
        String baseRateRentalOptions=driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.BaseRateRentalOptions)).getText();
        Log.info("baseRateRentalOptions :" +baseRateRentalOptions);
        storedValues.put("baseRateRentalOptions",baseRateRentalOptions);
        String feeRentalOptions=driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.FeeRentalOptions)).getText();
        Log.info("feeRentalOptions :" +feeRentalOptions);
        storedValues.put("feeRentalOptions",feeRentalOptions);
        if(storedValues.get("baseRateSelectCarPage").contains(storedValues.get("baseRateRentalOptions"))) {
            Assert.assertTrue(true);
        }else
        {
            Assert.assertTrue(false);
        }
        WebBudgetScreen.TakenScreenshot("8");
    }
    @And ("Validate estimated total and amount Prepaid")
    public void ValidateEstimatedAndPrepaidAmount() throws Exception {
        Log.info("----------------------------------------------------------------------------------------");
        Log.info("Validate estimated total and amount Prepaid");
        Log.info("----------------------------------------------------------------------------------------");
        String estimatedTotal=driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.EstimatedTotal)).getText();
        Log.info("estimatedTotal :" +estimatedTotal);
        storedValues.put("estimatedTotal",estimatedTotal);
        driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.ContinueButton)).click();
        String amountPrepaid=driver.findElement(WebBudgetScreen.drawMethod(WebBudgetScreen.AmountPrepaid)).getAttribute("innerHTML");
        Log.info("amountPrepaid :" +amountPrepaid);
        storedValues.put("amountPrepaid",amountPrepaid);
        Assert.assertEquals(storedValues.get("estimatedTotal"),  storedValues.get("amountPrepaid"));
        Log.info("Shutting down driver");
        WebBudgetScreen.TakenScreenshot("9");
        driver.quit();
    }







}
