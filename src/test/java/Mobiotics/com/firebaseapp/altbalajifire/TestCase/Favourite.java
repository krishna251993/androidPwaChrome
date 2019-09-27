package Mobiotics.com.firebaseapp.altbalajifire.TestCase;

import org.testng.annotations.Test;

import Mobiotics.com.firebaseapp.altbalaji.favourite.favourite;
import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.LoginPage;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;

public class Favourite extends BaseTest {
	public static String Application_URL;
	@Test
	public void Byfavourite() throws Exception {
		
		Thread.sleep(10000);
		preCondition();
		
		
		LoginPage url=new LoginPage();
		url.enterURL(Application_URL);
		
		
		favourite selectcontent=new favourite();
		selectcontent.SelectContent();
			
		favourite btnfavourite=new favourite();
		btnfavourite.favouriteIcon();
		
		
		
	}
	

}
