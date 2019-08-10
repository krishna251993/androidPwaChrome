package Mobiotics.com.firebaseapp.altbalaji.SubscribeUserSubscribed;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.BasePage;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;

public class SubscribeUserSubcribed extends BasePage{


		public SubscribeUserSubcribed()
		{
			PageFactory.initElements(BaseTest.driver,this);
			this.clickTosubscribenow();
		}
		
		
		@FindBy(xpath  = "//android.widget.Button[@text='SUBSCRIBE NOW']")
		private WebElement SubscribeNow;
		
		@FindBy(xpath = "//android.view.View[@text='₹100']")
		//@FindBy(xpath = "//android.view.View[@text='₹300']")
		private WebElement pack;
		

		
		public void subscribe() {
			
			waitTillElementIsClickable(SubscribeNow);
			SubscribeNow.click();
			
		}
		
		public void selectpack()
		{
			waitTillElementIsClickable(pack);
			pack.click();
		}
		
		
		
		public void clickTosubscribenow() {
			waitTillElementIsClickable(SubscribeNow);
			SubscribeNow.click();
		}
		
		public void clickToSelectpack()
		{
			waitTillElementIsClickable(pack);
			pack.click();
		}
		/*
		public void setUserName(String UserName)
		{
			waitTillElementIsVisible(lookup);
			lookup.sendKeys(UserName);
		}*/
		
		
		
		public void subscribepage()
		{
			clickTosubscribenow();
			clickToSelectpack();
			/*
			setUserName(un);
			clickTocontinue();
			setPassword(pw);
			clickToProceed();
			clickToDeviceClear();*/
		}
		
		
	


}
