package cucumberIntegrationTests.stepDefinitions.common;

import cucumber.api.java.en.Given;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.CucumberRunnerUtil;
import cucumberIntegrationTests.screens.android.AndroidLoginScreen;
import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import cucumberIntegrationTests.screens.web.WebBudgetScreen;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    CreateSessionCucumber createSessionCucumber;
    WebDriver driver;
    String platform;
    AndroidLoginScreen androidLoginScreen;
    IOSLoginScreen iosLoginScreen;
    WebBudgetScreen WebBudgetScreen;


    @Given("^User has start the Driver \"([^\"]*)\" app$")
    public void userHasAmazonApp(String invokeDriver) throws Exception {

            platform = invokeDriver;
            createSessionCucumber = new CreateSessionCucumber();
            createSessionCucumber.createDriver(invokeDriver, BaseSteps.class.getDeclaredMethod("userHasAmazonApp",String.class));
            driver = createSessionCucumber.getWebDriver();
        if (invokeDriver.equalsIgnoreCase("android")) {
            androidLoginScreen = new AndroidLoginScreen(driver);
        } else if (invokeDriver.equalsIgnoreCase("iOS")) {
            iosLoginScreen = new IOSLoginScreen(driver);
        }
        else if (invokeDriver.equalsIgnoreCase("web")) {
            WebBudgetScreen = new WebBudgetScreen(driver);
        }
    }

}
