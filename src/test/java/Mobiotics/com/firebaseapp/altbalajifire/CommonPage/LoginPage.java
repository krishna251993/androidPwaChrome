package Mobiotics.com.firebaseapp.altbalajifire.CommonPage;

import org.apache.tools.ant.util.IdentityStack;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.*;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;



public class LoginPage extends BasePage {

	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	@FindBy(id = "com.android.chrome:id/terms_accept")
	private WebElement ChromeAccept;
	
	@FindBy(id = "com.android.chrome:id/next_button")
	private WebElement fasterBrowser;
	
	@FindBy(id = "com.android.chrome:id/positive_button")
	private WebElement btngmailcontinue;
	
	@FindBy(id = "com.android.chrome:id/positive_button")
	private WebElement btngmailokgotit;
	
	@FindBy(id = "com.android.chrome:id/search_box_text")
	private WebElement search;
	
	@FindBy(id = "com.android.chrome:id/url_bar")
	private WebElement urlEnter;
	
	
	@FindBy(id = "com.android.chrome:id/negative_button")
	private WebElement altnotification;
	
	@FindBy(id="com.android.chrome:id/infobar_close_button")
	private WebElement althomescreen;
	
	@FindBy(id="showMenu")
	private WebElement Menu;
	
	
	@FindBy(xpath ="//android.view.View[@resource-id='hamburger-signin-button']")
	private WebElement Sign;
	
	@FindBy(xpath = "//android.view.View[@resource-id='alt-container']")
	private WebElement SignALTLOGO;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='journey-email-lookup']")
	private WebElement lookup;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id='moble-email-lookup']")
	private WebElement btncotinue;
	
	@FindBy(xpath ="//android.widget.EditText[@resource-id='input-password']")
	private WebElement txtPassword;
	
	
	@FindBy(xpath="//android.widget.Button[@resource-id='login-button']")
	private WebElement btnsignin;

	@FindBy(xpath = "//android.widget.Button[@resource-id='clearDevicesButton']")
	private WebElement deviceclear;
	
	
	
	
	public void enterURL(String URL) throws InterruptedException {
		
		
		waitTillElementIsClickable(ChromeAccept);
		ChromeAccept.click();
		
		
		try {
			waitTillElementIsClickable(fasterBrowser);
			fasterBrowser.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			waitTillElementIsClickable(btngmailcontinue);
			btngmailcontinue.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
		
		
		try {
			waitTillElementIsClickable(btngmailokgotit);
			btngmailokgotit.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		waitTillElementIsClickable(search);
		search.click();
		
		
		String uRl=new String(URL);
		
		waitTillElementIsVisible(urlEnter);
		
		//System.out.println(uRl);
		
		urlEnter.sendKeys(uRl + "\n");
		
		
		
		
		//TouchAction action= new TouchAction(driver);
		
		//urlEnter.click();
		//urlEnter.sendKeys("https://altbalajifire.firebaseapp.com" + "\n");
		
		
		try {
			waitTillElementIsClickable(altnotification);
			altnotification.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		waitTillElementIsClickable(althomescreen);
		althomescreen.click();
		
		
		
	}
	
	
	public void clickToMenushow() {
		waitTillElementIsClickable(Menu);
		Menu.click();
	}
	
	public void clickTosignin() {
		waitTillElementIsClickable(Sign);
		Sign.click();
	}

	
	public void clickToSignALTlogo()
	{
		waitTillElementIsClickable(SignALTLOGO);
		
	}
	
	public void setUserName(String UserName)
	{
		waitTillElementIsVisible(lookup);
		lookup.sendKeys(UserName);
	}
	
	
	public void clickTocontinue()
	{
		driver.navigate().back();
		
		waitTillElementIsClickable(btncotinue);
		btncotinue.click();
	}
	
	
	public void setPassword(String pw)
	{
		waitTillElementIsVisible(txtPassword);
		txtPassword.sendKeys(pw);
	}
	
	public void clickToProceed() {
		
		driver.navigate().back();
		
		waitTillElementIsClickable(btnsignin);
		btnsignin.click();
	}
	
	public void clickToDeviceClear()
	{
		try {
			waitTillElementIsClickable(deviceclear);
			deviceclear.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	
	public void login(String un,String pw)
	{
		clickToMenushow();
		clickTosignin();
		setUserName(un);
		clickTocontinue();
		setPassword(pw);
		clickToProceed();
		clickToDeviceClear();
	}
	
	
	
	public boolean isLogoDisplayed() {
		
		try {
			waitTillElementIsVisible(SignALTLOGO);
			SignALTLOGO.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
	}
}
