package Mobiotics.com.firebaseapp.altbalajifire.TestCase;

import org.testng.annotations.Test;

import Mobiotics.com.firebaseapp.altbalaji.SigninUserRegister.SigninRegisterUser;
import Mobiotics.com.firebaseapp.altbalaji.SubscribeUserSubscribed.SubscribeUserSubcribed;
import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.HomePage;
import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.LoginPage;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;




public class Subscribe extends BaseTest {
	
	@Test
	public void testC() throws Exception {
		preCondition();
		
		
		/*
		if(signInStatus==false) {
			
			LoginPage sign=new LoginPage();
			sign.clickTosignin();
			
			LoginPage lookpage=new LoginPage();
			lookpage.setUserName(UN);
			LoginPage continu=new LoginPage();
			continu.clickTocontinue();
			LoginPage pwd=new LoginPage();
			pwd.setPassword(PW);
			LoginPage proceed=new LoginPage();
			proceed.clickToProceed();
			LoginPage device=new LoginPage();
			device.clickToDeviceClear();
			
		}
		
		else if(subscribeNowStatus==true) {
			
			SigninRegisterUser subscribebtn = new SigninRegisterUser();
			subscribebtn.clickTosubscribenow();
			SigninRegisterUser selectPack =new SigninRegisterUser();
			selectPack.clickToSelectpack();
			
			LoginPage lookpage=new LoginPage();
			lookpage.setUserName(UN);
			LoginPage continu=new LoginPage();
			continu.clickTocontinue();
			LoginPage pwd=new LoginPage();
			pwd.setPassword(PW);
			LoginPage proceed=new LoginPage();
			proceed.clickToProceed();
			LoginPage device=new LoginPage();
			device.clickToDeviceClear();
			
		}
		*/

		
			preCondition();
			Thread.sleep(5000);
			SubscribeUserSubcribed subscribe=new SubscribeUserSubcribed();
			subscribe.clickTosubscribenow();
		
		

		
	}

}
