$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 3,
  "name": "Verify login functionality and select product in the Amazon app",
  "description": "",
  "id": "verify-login-functionality-and-select-product-in-the-amazon-app",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "Create an instance of android or ios driver before each scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User has Amazon \"android\" app",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "android",
      "offset": 17
    }
  ],
  "location": "BaseSteps.userHasAmazonApp(String)"
});
formatter.result({
  "duration": 15094021800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to login on app and add product in the list",
  "description": "",
  "id": "verify-login-functionality-and-select-product-in-the-amazon-app;user-should-be-able-to-login-on-app-and-add-product-in-the-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "taps on \"language\" image",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "taps on \"signin\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user has \"valid\" username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enters credentials and submit the button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Search the \"65 inch TV\" product in the search textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to scroll and select the product in the search list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user click the buy button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "language",
      "offset": 9
    }
  ],
  "location": "LoginSteps.tapsOnImage(String)"
});
formatter.result({
  "duration": 1404616900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signin",
      "offset": 9
    }
  ],
  "location": "LoginSteps.tapsOnButton(String)"
});
formatter.result({
  "duration": 862886500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 10
    }
  ],
  "location": "LoginSteps.usernameAndPasswordIs(String)"
});
formatter.result({
  "duration": 68100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userEntersCredentials()"
});
formatter.result({
  "duration": 17016758200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "65 inch TV",
      "offset": 12
    }
  ],
  "location": "LoginSteps.buttonShouldBeVisible(String)"
});
formatter.result({
  "duration": 25836808000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userShouldBeAbleToScroll()"
});
formatter.result({
  "duration": 3003393300,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command.\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u00271JH4XS2\u0027, ip: \u0027192.168.43.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\saravanan.kandan\\D..., appActivity: com.amazon.mShop.home.HomeA..., appPackage: in.amazon.mShop.android.sho..., automationName: UiAutomator2, databaseEnabled: false, desired: {app: C:\\Users\\saravanan.kandan\\D..., appActivity: com.amazon.mShop.home.HomeA..., appPackage: in.amazon.mShop.android.sho..., automationName: UiAutomator2, deviceName: Android Emulator, name: userHasAmazonApp, noReset: false, platformName: android}, deviceApiLevel: 29, deviceManufacturer: OnePlus, deviceModel: GM1901, deviceName: 1f68912d, deviceScreenDensity: 420, deviceScreenSize: 1080x2340, deviceUDID: 1f68912d, javascriptEnabled: true, locationContextEnabled: false, name: userHasAmazonApp, networkConnectionEnabled: true, noReset: false, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 10, statBarHeight: 80, takesScreenshot: true, viewportRect: {height: 2054, left: 0, top: 80, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 7b3c7369-1078-43bd-9953-1cd41a88acc2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat io.appium.java_client.PerformsTouchActions.performTouchAction(PerformsTouchActions.java:41)\r\n\tat io.appium.java_client.TouchAction.perform(TouchAction.java:187)\r\n\tat UITestFramework.GenericMethods.scrollDown(GenericMethods.java:385)\r\n\tat cucumberIntegrationTests.stepDefinitions.common.LoginSteps.userShouldBeAbleToScroll(LoginSteps.java:110)\r\n\tat ✽.And user should be able to scroll and select the product in the search list(LoginTest.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.clickBuyButton()"
});
formatter.result({
  "status": "skipped"
});
});