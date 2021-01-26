package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DashboardPage {
    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

        private WebDriver driver;
        //Using By to locate dashboard elements
        private By name = By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[1]/div/input");
        private By logoutbutton = By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[1]/input");




        public void clickname() {
            //Find the louisabatte element and click on the button
            driver.findElement(name).click();
        }

        public SigninPage clickLogout() {
            //Find the logout element and click on the logout button
            driver.findElement(logoutbutton).click();
            return new SigninPage(driver);
        }
}

