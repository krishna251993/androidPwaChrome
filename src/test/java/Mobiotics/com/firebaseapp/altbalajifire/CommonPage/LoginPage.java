package Mobiotics.com.firebaseapp.altbalajifire.CommonPage;

import org.apache.tools.ant.util.IdentityStack;
import org.hamcrest.Factory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.AlertHandler;

import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.*;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath = "//android.widget.Button[@text='MORE']")
	private WebElement morebtn;
	
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
	
	
	@FindBy(id = "hamburger-signin-button")
	private WebElement Sign;
	
	@FindBy(xpath = "//android.view.View[@text='Or Sign in with your social account']")
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
	
	
	@FindBy(xpath = "//android.widget.Button[@text='Never']")
	private WebElement cancelsavepassword;
	
	
	@FindBy(xpath  = "//android.widget.Button[@text='SUBSCRIBE NOW']")
	private WebElement SubscribeNow;
	
	@FindBy(xpath = "//android.view.View[@text='₹100']")
	//@FindBy(xpath = "//android.view.View[@text='₹300']")
	private WebElement pack;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View")
	private WebElement ageicon;
	
	
	@FindBy(xpath ="//android.view.View[@index='0' & @text='18']")
	private WebElement selectage;
	
	@FindBy(id = "new-journey-email-signup-button")
	private WebElement guestcontinue;
	
	@FindBy(xpath = "//android.widget.Image[@text='right-arrow']")
	private WebElement paytmarrow;
	
	@FindBy(xpath ="//android.widget.Button[@text='Proceed']")
	private WebElement paytmproceedBtn;
	
	@FindBy(xpath = "//android.widget.Image[@resource-id='arrow-design']")
	private WebElement clickTobackarrow;
	
	@FindBy(xpath ="//android.widget.Button[@text='CONFIRM']" )
	private WebElement Confirmbtn;
	
	@FindBy(xpath = "//android.view.View[@text='SHOWS']")
	private WebElement show;
	
	@FindBy(xpath = "//android.view.View[@text='SETTINGS']")
	private WebElement setting;
	
	@FindBy(xpath = "//android.view.View[@text='ACCOUNT']")
	private WebElement settingAccount;
	
	@FindBy(xpath = "//android.widget.Button[@text='LOGOUT']")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "//android.widget.Image[@text='alt-poster']")
	private WebElement homeplayicon;
	
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public WebElement ALTpermission;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.ListView[4]/android.view.View/android.widget.Button")
	private WebElement playBtn;
	
	
	@FindBy(id="v-toggler")
	private WebElement playcontent;
	
	
	
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
			waitTillElementIsClickable(morebtn);
			morebtn.click();
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
		
		try {
			waitTillElementIsClickable(althomescreen);
			althomescreen.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	public void clickToMenu() {
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
	public void clickTosubscribeNow()
	{
		waitTillElementIsClickable(SubscribeNow);
		SubscribeNow.click();
	}
	
	public void clickToSelectpack()
	{
		waitTillElementIsClickable(pack);
		pack.click();
	}
	
	public void setUserName(String UserName)
	{
		waitTillElementIsVisible(lookup);
		lookup.sendKeys(UserName);
	}
	
	
	public void clickTocontinue()
	{
//		driver.navigate().back();
		
		waitTillElementIsClickable(btncotinue);
		btncotinue.click();
	}
	
	
	public void setPassword(String pw)
	{
		waitTillElementIsVisible(txtPassword);
		txtPassword.sendKeys(pw);
	}
	
	public void Ageicon()
	{
		waitTillElementIsClickable(ageicon);
		ageicon.click();;
	}
	
	public void Selectage()
	{
		waitTillElementIsClickable(selectage);
		selectage.click();
	}
	
	public void Guestcontinue() {
		waitTillElementIsClickable(guestcontinue);
		guestcontinue.click();
	}
	
	public void PaytmArrow() {
		waitTillElementIsClickable(paytmarrow);
		paytmarrow.click();
		
	}
	public void PaytmproceedBtn() {
		waitTillElementIsClickable(paytmproceedBtn);
		paytmproceedBtn.click();
	}
	
	
	public void clickToProceed() {
		
		//driver.navigate().back();
		
		waitTillElementIsClickable(btnsignin);
		btnsignin.click();
	}
	
	public void ClickTobackarrow() {
		waitTillElementIsClickable(clickTobackarrow);
		
		clickTobackarrow.click();
		
	}
	
	public void ConfirmBtn() {
		waitTillElementIsClickable(Confirmbtn);
		Confirmbtn.click();
		
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
	
	
	
	public void clickToShows() {
		waitTillElementIsClickable(show);
		show.click();
		
	}
	
	public void Setting() {
		waitTillElementIsClickable(setting);
		setting.click();
		
	}
	public void SettingAccount() {
		waitTillElementIsClickable(settingAccount);
		settingAccount.click();
		
	}
	public void Logoutbtn() {
		waitTillElementIsClickable(logoutbtn);
		logoutbtn.click();
		
	}
	
	public void Homeplayicon() {
		waitTillElementIsClickable(homeplayicon);
		homeplayicon.click();
	}
	
	public void AltPermission() {
		waitTillElementIsClickable(ALTpermission);
		ALTpermission.click();
	}
	
	public void PlayBtn() {
		waitTillElementIsClickable(playBtn);
		playBtn.click();
	}
	
	public void clickToPlaycontent() {
		waitTillElementIsClickable(playcontent);
		playcontent.click();
	}
	
	/*
	
	public void ageselect() {
		
	try{
		WebElement parentElement1 = driver.findElement(By.className("android.widget.EditText"));
		WebElement childElement1 = parentElement1.findElement(By
		.xpath("//android.widget.EditText[@index='0']"));
		childElement1.click();
		
	}catch(Exception e){
		
		System.out.println(e.getMessage());
		}
	}
	*/
	
	
	
	public void login(String un,String pw)
	{
		clickToMenu();
		clickTosignin();
		setUserName(un);
		clickTocontinue();
		clickToSelectpack();
		setPassword(pw);
		clickToProceed();
		Guestcontinue();
		ClickTobackarrow();
		PaytmArrow();
		ConfirmBtn();
		clickToDeviceClear();
		Setting();
		Logoutbtn();
	}
	
	/*
	
	public boolean isLogoDisplayed() {
		
		
		try {
			
			waitTillElementIsVisible(SignALTLOGO);
			SignALTLOGO.isDisplayed();
			return true;
			
		} 
		catch (Exception e) {
			return false;
		}
		
	}*/
}
