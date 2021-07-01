package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPassword {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement emailPasswordField;
    @FindBy(id = "passwordNext")
    private WebElement nextButtonPassword;
    @FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")
    private WebElement errorMessagePassword;

    public EmailPassword(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setEmailPassword(String password) {
        emailPasswordField.sendKeys(password);
    }

    public String getErrorMessage() {
        return errorMessagePassword.getText();
    }

    public void clickNext() {
        nextButtonPassword.click();
    }

    public void finishLogin(String password) {
        this.setEmailPassword(password);
        this.clickNext();
    }
}
