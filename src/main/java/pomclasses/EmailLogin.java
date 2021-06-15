package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailLogin {
    WebDriver driver;
    By email = By.id("identifierId");
    By emailTitle = By.xpath("//*[@id=\"headingText\"]/span");
    By nextButtonEmail = By.id("identifierNext");

    public EmailLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage(String loginPage) {
        driver.get(loginPage);
    }

    public String getEmailTitle() {
        return driver.findElement(emailTitle).getText();
    }

    public void setEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void clickNext() {
        driver.findElement(nextButtonEmail).click();
    }

    public void enterEmail(String userEmail) {
        this.setEmail(userEmail);
        this.clickNext();
    }
}
