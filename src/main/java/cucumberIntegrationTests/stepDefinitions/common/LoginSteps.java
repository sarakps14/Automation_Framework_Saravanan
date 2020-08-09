package cucumberIntegrationTests.stepDefinitions.common;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.android.AndroidLoginScreen;
import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Properties;

public class LoginSteps {
    AndroidLoginScreen androidLoginScreen;
    IOSLoginScreen iosLoginScreen;
    WebDriver driver;
    String userName;
    String password;
    Properties configFileObject;
    BaseSteps baseStepsContext;



    public LoginSteps(BaseSteps baseSteps) {
        baseStepsContext = baseSteps;
        driver = baseStepsContext.driver;
        androidLoginScreen = baseStepsContext.androidLoginScreen;
        iosLoginScreen = baseStepsContext.iosLoginScreen;
        configFileObject = CreateSessionCucumber.localeConfigProp;
    }



    @And("user has \"([^\"]*)\" username and password")
    public void usernameAndPasswordIs(String credentialsValidations) {
        if(credentialsValidations.equalsIgnoreCase("valid")){
            userName = configFileObject.getProperty("userName");
            password = configFileObject.getProperty("password");
        }
        else{
            userName = configFileObject.getProperty("abc@gmail.com");
            password = configFileObject.getProperty("password");
        }
    }

    @When("user enters credentials and submit the button")
    public void userEntersCredentials() throws InterruptedException {

        androidLoginScreen.waitForVisibility(androidLoginScreen.emailIdTextBox);
        androidLoginScreen.findElement(androidLoginScreen.emailIdTextBox).sendKeys("sarakps14@gmail.com");
        androidLoginScreen.findElement(androidLoginScreen.continueButton).click();
        androidLoginScreen.waitForVisibility(androidLoginScreen.passwordTextBox);
        androidLoginScreen.findElement(androidLoginScreen.passwordTextBox).sendKeys("kandan14");
        Thread.sleep(10000);
        androidLoginScreen.findElement(androidLoginScreen.submitButton).click();
    }

    @And("taps on \"([^\"]*)\" button")
    public void tapsOnButton(String arg0) throws InterruptedException {
        androidLoginScreen.waitForVisibility(androidLoginScreen.signIn);
        androidLoginScreen.findElement(androidLoginScreen.signIn).click();
    }
    @And("taps on \"([^\"]*)\" skip button")
    public void tapsOnSkipButton(String arg0) throws InterruptedException {
        androidLoginScreen.waitForVisibility(androidLoginScreen.skipSignIn);
        androidLoginScreen.findElement(androidLoginScreen.skipSignIn).click();
    }
    @And("taps on \"([^\"]*)\" Continue button")
    public void tapsOnContinueButton(String arg0) throws InterruptedException {
        androidLoginScreen.waitForVisibility(androidLoginScreen.continueButton);
        androidLoginScreen.findElement(androidLoginScreen.continueButton).click();
    }

    @Given("taps on \"([^\"]*)\" image")
    public void tapsOnImage(String arg0) {
        androidLoginScreen.waitForVisibility(androidLoginScreen.languageEnglish);
        androidLoginScreen.findElement(androidLoginScreen.languageEnglish).click();
    }

    @Then("Search the \"([^\"]*)\" product in the search textbox")
    public void buttonShouldBeVisible(String searchText) throws InterruptedException {
        androidLoginScreen.waitForVisibility(androidLoginScreen.searchTextBox);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.SEARCH));
        Thread.sleep(5000);
        androidLoginScreen.findElement(androidLoginScreen.searchTextBox).sendKeys(searchText+"\n");
        Thread.sleep(5000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    @And("user should be able to scroll and select the product in the search list")
    public void userShouldBeAbleToScroll() {
        // scroll down twice with each duration of 500 ms
        androidLoginScreen.scrollDown(2, 500);
        androidLoginScreen.findElements(androidLoginScreen.productList).get(0).click();

    }

    @And("user click the buy button and validate the response")
    public void clickBuyButton() {
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BUTTON_START));
        androidLoginScreen.scrollDown(2, 1000);
        androidLoginScreen.waitForVisibility(androidLoginScreen.buyButton);
        androidLoginScreen.findElement(androidLoginScreen.buyButton).click();
        androidLoginScreen.waitForVisibility(androidLoginScreen.productList);
        Assert.assertEquals(androidLoginScreen.findElements(androidLoginScreen.productList).get(0).getText(),"Choose your delivery options");
        androidLoginScreen.findElement(androidLoginScreen.continueButton).click();
        androidLoginScreen.waitForVisibility(androidLoginScreen.productList);
        Assert.assertEquals(androidLoginScreen.findElements(androidLoginScreen.productList).get(0).getText(),"Select a payment method");
     }
    @And("long press the search icon")
    public void longPressTheSearchIcon() {
        // long press search icon
        androidLoginScreen.longPress(androidLoginScreen.searchTextBox);
    }



}
