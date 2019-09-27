package Mobiotics.com.firebaseapp.altbalajifire.Constant;



import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.aspectj.lang.annotation.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import Mobiotics.com.firebaseapp.altbalajifire.CommonPage.LoginPage;
import generic.Property;
import io.appium.java_client.android.AndroidDriver;
import Mobiotics.com.firebaseapp.altbalaji.SigninUserRegister.SigninRegisterUser;
import Mobiotics.com.firebaseapp.altbalaji.favourite.favourite;




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
	public static String Age;
	
	
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
		Age=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE,"Age");
		
		
		
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

		/*
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		*/
		
//driver.manage().window().maximize();

		preCondition();
		log.info("TimeOut:"+timeout);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		
		
		
		
	}
	
	
	public void preCondition() throws Exception 
	{
		if(loginRequired) {
			log.info("implicit login");
			LoginPage loginpage=new LoginPage();
			
			//System.out.println(Application_URL);
			
			loginpage.enterURL(Application_URL);
			
			
			log.info("URL Has Been Entered");
			
			
			loginpage.clickToMenu();
			log.info("clicked on menu");
			
			loginpage.clickToShows();
			
		
			
			
			
			
			/*
			if(loginpage.isLogoDisplayed()) {
				
				loginpage.clickTosignin();
				signInStatus=true;
				log.info("clicked on sign in");
			}
			else if (signInStatus=false)
			{
				
				
				SigninRegisterUser subscribebtn = new SigninRegisterUser();
				subscribebtn.clickTosubscribenow();
				log.info("clicked on subscribe");
				
				subscribeNowStatus=true;
			}
			*/
			
			
			
			
			
			
			
	/*-------------------------------------------SIGN IN-----------------------------------------------*/	
			
			
			
			
			/*
			
			loginpage.clickTosignin();
			log.info("clicked on sign in button");
			
			
				try {
					loginpage.setUserName(UN);
					log.info("user id has been entered");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
								
				try {
					loginpage.clickTocontinue();
					log.info("clicked on continue button");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.clickToSelectpack();
					log.info("select pack");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.setPassword(PW);
					log.info("password has been entered");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.Ageicon();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.Selectage();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				
				
				try {
					loginpage.Guestcontinue();
					log.info("guest user sign up completed");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				
				try {
					loginpage.clickToProceed();
					log.info("clicked to sign in button");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.clickToSelectpack();
					log.info("select pack");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.PaytmArrow();
					loginpage.PaytmproceedBtn();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.ClickTobackarrow();
					driver.navigate().back();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				
				
				try {
					loginpage.ConfirmBtn();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				try {
					loginpage.clickToDeviceClear();
					log.info("device has been cleared");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			 */
			 
			 
			
			
			
			
			 
/*-----------------------------------------SUBSCRIBED---------------------------------------------------------------*/			 
			
			
			
			
			
			loginpage.clickTosubscribeNow();
			
					try {
						loginpage.clickToSelectpack();
						log.info("pach has been selecteed");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
				
					try {
					
						loginpage.setUserName(UN);
						log.info("user id has been entered");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					
					try {
						loginpage.clickTocontinue();
						log.info("clicked on continue button");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					
					try {
						loginpage.setPassword(PW);
						log.info("password has been entered");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					try {
						loginpage.Guestcontinue();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					try {
						loginpage.clickTosignin();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					try {
						loginpage.PaytmArrow();
						loginpage.PaytmproceedBtn();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					try {
						loginpage.ClickTobackarrow();
						driver.navigate().back();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					try {
						loginpage.ConfirmBtn();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					try {
						loginpage.clickToDeviceClear();
						log.info("device has been cleared");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					
			
			
					
					loginpage.Homeplayicon();
					log.info("click on play button");
					
					loginpage.AltPermission();
				
					
					try {
						loginpage.PlayBtn();
						log.info("click on play button");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
					loginpage.clickToPlaycontent();
					log.info("content played");
					Thread.sleep(10000);
					driver.navigate().back();
					Thread.sleep(10000);
					driver.navigate().back();
				
				
				//loginpage.Cancelsavepassword();
				
				log.info("navigate to home page");
				} 
		
		
		
		
		
		
		
		
		
/*------------------------FAVOURITE---------------------------------------------------------------*/		
		
		favourite selectcontent=new favourite();
		selectcontent.SelectContent();
			
		favourite btnfavourite=new favourite();
		btnfavourite.favouriteIcon();	
			
			
	}
	
	
	
	@AfterMethod
	public void suttdown() throws Exception {
		if(logoutRequired) {
			
			
			LoginPage loginPage=new LoginPage();
			
					
			loginPage.enterURL(Application_URL);
			
			loginPage.clickToMenu();
			loginPage.Setting();
			loginPage.SettingAccount();
			loginPage.Logoutbtn();
			
			
			log.info("clicked on menu");
			log.info("implicit logout");
			
		}
	
	
	}
}
