package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPassword {
    WebDriver driver;
    By emailPasswordField = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    By nextButtonPassword = By.id("passwordNext");
    By errorMessagePassword = By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span");

    public EmailPassword(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailPassword(String password) {
        driver.findElement(emailPasswordField).sendKeys(password);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessagePassword).getText();
    }

    public void clickNext() {
        driver.findElement(nextButtonPassword).click();
    }

    public void finishLogin(String password) {
        this.setEmailPassword(password);
        this.clickNext();
    }
}
