package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailLogin {

    WebDriver driver;
    @FindBy(id ="identifierId")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"headingText\"]/span")
    private WebElement emailTitle;
    @FindBy(id = "identifierNext")
    private WebElement nextButtonEmail;

    public EmailLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToLoginPage(String loginPage) {
        driver.get(loginPage);
    }

    public String getEmailTitle() {
        return emailTitle.getText();
    }

    public void setEmail(String userEmail) {
        email.sendKeys(userEmail);
    }

    public void clickNext() {
        nextButtonEmail.click();
    }

    public void enterEmail(String userEmail) {
        this.setEmail(userEmail);
        this.clickNext();
    }
}
