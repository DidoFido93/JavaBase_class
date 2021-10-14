package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_class {
	
	public static WebDriver driver;
	
	public static WebDriver getbrowser(String browsername) {   //using static so the method cannot be overriden   public is used for inheritance & browsername is placed between () and if condition
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {     // equals ignore case is used for case sensitive letter.
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));   // user.dir is used for reusability when other people need to change their location of driver no need for full location 
			    driver = new ChromeDriver();  //the webdriver method will be created each timeif you want to use different browsers so when created so must make it to static above as a method
				
			}
			
			else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ("\\driver\\msedgedriver.exe"));
				driver = new EdgeDriver();
			}
			
			else {
				System.out.println("Invalid Browser"); // this statement is used if none of the browser is edge or chrome. & right click surround with and use try & catch
				
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver; // click on change return type to webdriver		
	}
            
	
	           public static  void geturl(String url) { //on driver.get (url) click on url to change in string parameter & sourround with try and catch
				try {
					driver.get(url);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
             
           /// using web elements///
             
            public static void sendkeys(WebElement element, String value) { // we are using element _> create parameter to element
            	try {
					element.sendKeys(value);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	
}
