package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
    private WebDriver driver;
    //using By as a locator to identify the login fields
    private By username = By.id("username");
    private By password = By.id("password");
    private By Signin = By.xpath("button");

    public SigninPage(WebDriver driver) {

    }

    public void EnterUsername() {
        //Find the username element and enter the username
        driver.findElement(username).sendKeys("louisabatte");
    }

    public void EnterPassword() {
        //Find the username element and enter the password
        driver.findElement(password).sendKeys("leetee1000");

    }

    public DashboardPage ClickSigninbutton() {
        //Find the Signinbutton and click
        driver.findElement(Signin).click();
        return new DashboardPage (driver);
    }
}


