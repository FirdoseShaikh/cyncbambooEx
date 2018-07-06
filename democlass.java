package Cync_Cloud.Cync_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass {
	public static String driverPath = "D:/Software/chromedriver_win32/";
	 public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		 System.out.println("launching chrome browser");
		 Thread.sleep(3000);
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
		 WebElement box=driver.findElement(By.className("gsfi"));
		 Thread.sleep(3000);
		 box.sendKeys("test");
		 Thread.sleep(3000);
		 System.out.println("Test class successfull");
		 driver.close();
		 
	}

}
