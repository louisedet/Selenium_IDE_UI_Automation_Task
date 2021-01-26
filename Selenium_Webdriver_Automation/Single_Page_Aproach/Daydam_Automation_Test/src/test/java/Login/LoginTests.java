package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;


public class LoginTests {
    //import the selenium webDriver
    private WebDriver driver;

    //import chromedriver
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //input project URL = DayDam login URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //wait for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //locate username field
        driver.findElement(By.id("username")).sendKeys("louisabatte");
        //Locate password field
        driver.findElement(By.id("password")).sendKeys("edeteyo22ozil");
        //Click on the Login button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        Thread.sleep(10000);

        // close the browser after test
        driver.quit();
    }

    //initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setup();

    }

}
