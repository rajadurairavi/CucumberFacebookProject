package CommonFunctions;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.events.EventFiringWebDriver;
	public class TestBase {
		
		public static WebDriver driver;
		public static Properties prop;
		public  static EventFiringWebDriver eventfiredriver;
		public static EventListner eventListner; 
		
		
		public TestBase(){
			
			try {
				prop = new Properties();
				FileInputStream io = new FileInputStream("Config.properties");
				prop.load(io);
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		public static void intialization(){
			String browserName = prop.getProperty("Browser");
			String driverpath = prop.getProperty("DriverPath");
			String url=prop.getProperty("URL");
			
			if(browserName.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver",driverpath );
				driver = new ChromeDriver();
			}else if (browserName.equals("Firefox")){
				System.setProperty("webdriver.gecko.driver",driverpath );
				driver = new FirefoxDriver();
			}
			
			eventfiredriver = new EventFiringWebDriver(driver);  	 	
			EventListner eventListner = new EventListner();  // Now create object of testDriver to register it with EventFiringWebDriver
			eventfiredriver.register(eventListner);
			driver = eventfiredriver;
			
			
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(url);
		}

	}

