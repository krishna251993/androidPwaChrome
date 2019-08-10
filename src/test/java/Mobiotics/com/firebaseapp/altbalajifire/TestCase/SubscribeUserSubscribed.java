package Mobiotics.com.firebaseapp.altbalajifire.TestCase;

import org.testng.annotations.Test;

import Mobiotics.com.firebaseapp.altbalaji.SubscribeUserSubscribed.SubscribeUserSubcribed;
import Mobiotics.com.firebaseapp.altbalajifire.Constant.BaseTest;

public class SubscribeUserSubscribed extends BaseTest{
	
	@Test
	public void subscribedUser() throws Exception {
		preCondition();
		Thread.sleep(5000);
		SubscribeUserSubcribed subscribe=new SubscribeUserSubcribed();
		subscribe.clickTosubscribenow();
	}

}
