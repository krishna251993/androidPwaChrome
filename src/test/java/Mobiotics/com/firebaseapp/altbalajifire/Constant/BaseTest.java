package Mobiotics.com.firebaseapp.altbalajifire.Constant;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.LoginPage;
import generic.Property;
import io.appium.java_client.android.AndroidDriver;
import Mobiotics.com.firebaseapp.altbalaji.SigninUserRegister.SigninRegisterUser;


public class BaseTest implements AutomationConstants {
	public Logger log;
	//public static WebDriver driver;
	
	public static String Application_URL;
	public static String UN;
	public static String PW;
	public static String homePageURL;
	public static String loginPageURL;
	public static long timeout;
	public static String deviceName;
	public static String udid;
	public static String platformname;
	public static String platFormVersion;
	public static String appPackage;
	public static String appActivity;
	public static long IMPLICIT;
	public static long EXPLICIT;
	
	public static boolean signInStatus;
	public static boolean subscribeNowStatus;
	
	
	
	public static boolean loginRequired=true;
	public static boolean logoutRequired=true;
	
	
	
	public static java.net.URL url;
	public static AndroidDriver<WebElement> driver;
	
	
	
		
	
	public BaseTest() {
		
		log=log.getLogger("LOg_ Logger");
		PropertyConfigurator.configure("Log4j.properties");
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
	}
	
	public void initFrameWork() {
		log.info("initilizing framework");
		Application_URL=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "Application_URL");
		UN=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "UN");
		PW=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PW");
		timeout=Long.parseLong(Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "IMPLICIT"));
		timeout=Long.parseLong(Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "EXPLICIT"));
		deviceName=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "deviceName");
		udid=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "udid");
		platformname=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "platformname");
		platFormVersion=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "platFormVersion");
		appPackage=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "appPackage");
		appActivity=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "appActivity");
		
		
		
		
	}
	
	@BeforeMethod
	public void initApplication() throws Exception {
		initFrameWork();
		
		
		
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("udid", udid);
		caps.setCapability("platformName", platformname);
		caps.setCapability("platformVersion", platFormVersion);
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("appActivity", appActivity);


		url=new java.net.URL("http://0.0.0.0:4723/wd/hub");

		driver= new AndroidDriver<WebElement>(url,caps);

		
//driver.manage().window().maximize();

		preCondition();
		log.info("TimeOut:"+timeout);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		
		
		
		
	}
	
	
	public void preCondition() throws Exception {
		if(loginRequired) {
			log.info("implicit login");
			LoginPage loginpage=new LoginPage();
			
			//System.out.println(Application_URL);
			
			loginpage.enterURL(Application_URL);
			
			
			log.info("URL Has Been Entered");
			
			
			loginpage.clickToMenushow();
			
			log.info("clicked on menu");
			
			
			
			
			
			
			
			
			
			if(loginpage.isLogoDisplayed()) {
				
				loginpage.clickTosignin();
				signInStatus=true;
				log.info("clicked on sign in");
			}
			else  {
				
				
				SigninRegisterUser subscribebtn = new SigninRegisterUser();
				subscribebtn.clickTosubscribenow();
				log.info("clicked on subscribe");
				
				subscribeNowStatus=true;
			}
			
			
			
			
			
			
			
			
			
			/*
			loginpage.clickTosignin();
			
			SigninRegisterUser subscribebtn = new SigninRegisterUser();
			subscribebtn.clickTosubscribenow();
			log.info("clicked on subscribe");
				
				*/
				
				
				try {
					SigninRegisterUser selectPack =new SigninRegisterUser();
					selectPack.clickToSelectpack();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			
			
			
			
			
			loginpage.setUserName(UN);
			log.info("user id has been entered");
			
			loginpage.clickTocontinue();
			
			
			loginpage.setPassword(PW);
			log.info("password has been entered");
			
			loginpage.clickToProceed();
			
			try {
				loginpage.clickToDeviceClear();
				log.info("device has been cleared");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			log.info("navigate to home page");
			
			
			loginRequired=true;
			logoutRequired=true;
			
			
			
		}
	}
	
	@AfterMethod
	public void after_Test() 
	{
		log.info("test completed");
		driver.quit();
	}
	
	
	

}
