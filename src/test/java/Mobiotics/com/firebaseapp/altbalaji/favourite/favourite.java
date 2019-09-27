package Mobiotics.com.firebaseapp.altbalaji.favourite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.BasePage;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;
import net.bytebuddy.implementation.bind.annotation.This;

public class favourite extends BasePage{

	public favourite() {
		
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	
	@FindBy(xpath = "//android.widget.Image[@text='alt-poster']")
	private WebElement selectContent;
	
	
	@FindBy(xpath = "//android.widget.Image[@text='fav-img']")
	private WebElement favouriteicon;
	
	
	
	public void SelectContent() {
		waitTillElementIsClickable(selectContent);
		selectContent.click();
	}
	
	
	
	public void favouriteIcon() {
		waitTillElementIsClickable(favouriteicon);
		favouriteicon.click();
	}
	
	
	
}
