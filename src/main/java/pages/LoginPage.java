package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends ParentPage {

    @FindBy(xpath = "//span[text()='AGREE']")
    private WebElement buttonAgreeCookies;

    @FindBy(xpath = "//a[@href='/login/' and contains(@class, 'new-navigation-login button--alt--header button')]")
    private WebElement buttonLoginMainPage;

    @FindBy(xpath = "//input[@name='login' and contains(@placeholder, 'User name')]")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@name='password' and contains(@placeholder, 'Password')]")
    private WebElement inputPassword;

    @FindBy(xpath = "//span[@class='button-text' and text()='Log in']")
    private WebElement buttonLogIn;

    @FindBy(xpath = "//a[@qid='navbar-profile-button']")
    private WebElement avatar;

    @FindBy(xpath = "//a[@id='account-details-log-out']")
    private WebElement buttonLogOut;

    @FindBy(xpath = "//div[@class='blockMessage blockMessage--error blockMessage--iconic']")
    private WebElement errorMessageLoginPage;
    @FindBy(xpath = "//a[@href='/subscribe/']")
    private WebElement buttonSubscribe;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        openPage(BASE_URL);
    }

    public void clickOnButtonAgreeCookies() {
        clickOnElement(buttonAgreeCookies);
    }

    public void clickOnButtonLoginMainPage() {
        clickOnElement(buttonLoginMainPage);
    }

    public void enterTextIntoInputUserName(String userName) {
        enterTextIntoInput(inputUserName, userName);
    }

    public void enterTextIntoInputPassword(String password) {
        enterTextIntoInput(inputPassword, password);
    }


    public void clickOnButtonLogIn() {
        clickOnElement(buttonLogIn);
    }

    public void checkIsAvatarDisplayed() {
        checkElementDisplayed(avatar);
    }

    public void clickOnAvatar() {
        clickOnElement(avatar);
    }

    public void clickOnButtonSubscribe() {
        clickOnElement(buttonSubscribe);
    }


    public void clickOnButtonLogOut() {
        clickOnElement(buttonLogOut);
    }

    public void checkIsAvatarNotDisplayed() {
        checkElementNotDisplayed(avatar);
    }

    public void checkIsErrorMessageLoginPageDisplayed() {
        checkElementDisplayed(errorMessageLoginPage);
    }

    public void waitUntil(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickOnButtonAgreeCookiesIfExists() {
        if (isElementDisplayed(buttonAgreeCookies)) {
            clickOnElement(buttonAgreeCookies);
        } else {
            logger.info("Button 'AGREE Cookies' is not present, proceeding further.");
        }
    }
}