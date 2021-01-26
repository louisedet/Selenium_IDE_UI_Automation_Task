package Login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
        //import the selenium webDriver
        private WebDriver driver;

        //import chromedriver
        public void setup() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            //input project URL = DayDam login URL
            driver.get("https://monosnap.com/");
            //wait for 5 seconds
            Thread.sleep(5000);
            //maximize the window
            driver.manage().window().maximize();
            //get page title
            System.out.println(driver.getTitle());
            driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();
            //locate username field
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]")).sendKeys("louisabatte2@gmail.com");
            //Locate password field
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("arteta0022");
            //Click on the Login button
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
            Thread.sleep(10000);

            // close the browser after test
            driver.quit();
        }

        //initiate the test run command
        public static void main(String args[]) throws InterruptedException {
            Login.LoginTests test = new Login.LoginTests();
            test.setup();

        }

    }
    