import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomclasses.EmailLogin;
import pomclasses.EmailPassword;

import java.time.Duration;

public class GmailLoginTest {
    public static final String driverPath = "src/main/resources/chromedriver";
    public static final String loginPage = "https://accounts.google.com/";

    WebDriver driver;

    EmailLogin objLogin;
    EmailPassword objPassword;

    @BeforeTest

    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }
    @Test
    public void test_Home_Page_Appear_Correct() {
        //Create Login Page object
        objLogin = new EmailLogin(driver);

        //Verify login page title
        objLogin.navigateToLoginPage(loginPage);
        String loginPageTitle = objLogin.getEmailTitle();
        Assert.assertTrue(loginPageTitle.contains("Увійти"));
        objLogin.enterEmail("automationtestarsi@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        objPassword = new EmailPassword(driver);
        objPassword.finishLogin("Test123!");
    }

    @Test
    public void test_Incorrect_Password() {
        objLogin = new EmailLogin(driver);
        objLogin.navigateToLoginPage(loginPage);
        objLogin.enterEmail("automationtestarsi@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        objPassword = new EmailPassword(driver);
        objPassword.finishLogin("Test123");
        String errorMessage = objPassword.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Неправильний пароль."));
    }
}


