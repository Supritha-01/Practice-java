import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supritha.h\\git\\Practice-java\\SeleniumPract\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("www.");
        
	}

}
