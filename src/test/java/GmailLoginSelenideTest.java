import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GmailLoginSelenideTest {
    public static final String loginPage = "https://accounts.google.com/";

    @Test
    public void test_Home_Page_Appear_Correct() {
        open(loginPage);
        $(byXpath("//*[@id=\"headingText\"]/span")).shouldHave(text("Увійти"));
        $("#identifierId").val("automationtestarsi@gmail.com").pressEnter();
        $(byXpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).val("Test123!").pressEnter();
    }

    @Test
    public void test_Incorrect_Password() {
        open(loginPage);
        $("#identifierId").val("automationtestarsi@gmail.com").pressEnter();
        $(byXpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).val("Test123").pressEnter();
        $(byXpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"))
                .shouldHave(text("Неправильний пароль."));
    }
}