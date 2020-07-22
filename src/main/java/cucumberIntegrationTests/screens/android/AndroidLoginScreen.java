package cucumberIntegrationTests.screens.android;

import UITestFramework.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login Screen
 */
public class AndroidLoginScreen extends GenericMethods {

	public AndroidLoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By languageEnglish = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.ImageView[1]\n");
	//public By languageEnglish = By.className("android.widget.ImageView");
	public By signIn = By.id("in.amazon.mShop.android.shopping:id/sign_in_button");
	public By skipSignIn = By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button");
	public By searchTextBox = By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text");
	public By searchButton = By.id("in.amazon.mShop.android.shopping:id/search_right_cam_img");
	public By productList = By.className("android.view.View");
	public By pinCodeButton = By.id("in.amazon.mShop.android.shopping");
	public By pinCodeTextBox = By.id("in.amazon.mShop.android.shopping");
	public By pinCodeApplyButton = By.id("in.amazon.mShop.android.shopping");
	public By buyButton = By.id("a-autoid-1");
	//public By emailIdTextBox = By.id("ap_email_login");
	public By emailIdTextBox = By.xpath("//android.widget.EditText[@index='1']");
	public By continueButton = By.className("android.widget.Button");
	public By passwordTextBox = By.xpath("//android.widget.EditText[@index='1']");
	public By submitButton = By.className("android.widget.Button");


}

