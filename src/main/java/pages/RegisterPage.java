package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends ParentPage {
    @FindBy(xpath = "//a[@class='button--alt button']")
    private WebElement SignUpFreeButton;
    @FindBy(xpath = "//input[@type='text' and(@placeholder='User name')]")
    private WebElement RegisterInputUserName;
    @FindBy(xpath = "//input[@type='email' and(@placeholder='Email')]")
    private WebElement RegisterInputEmail;
    @FindBy(xpath = "//input[@type='password' and(@placeholder='Password')]")
    private WebElement RegisterInputPassword;
    @FindBy(xpath = "//span[contains(text(), 'I agree to the')]/preceding-sibling::i")
    private WebElement RegisterCheckBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SignUpButton;


    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnButtonRegister() {
        clickOnElement(SignUpFreeButton);
    }

    public void clickOnButtonSignUp() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SignUpButton));
        clickOnElement(SignUpButton);
    }

    public void enterTextIntoInputUserName(String userName) {
        enterTextIntoInput(RegisterInputUserName, userName);
    }

    public void enterTextIntoInputEmail(String email) {
        enterTextIntoInput(RegisterInputEmail, email);
    }

    public void enterTextIntoInputPassword(String password) {
        enterTextIntoInput(RegisterInputPassword, password);
    }

    public void setRegisterCheckBoxState(String state) {
        setCheckboxState(RegisterCheckBox, state);
    }

    public boolean isElementDisplayedByText(String text) {
        String xpath = String.format("//*[contains(text(), '%s')]", text);
        WebElement element = webDriver.findElement(By.xpath(xpath));
        return isElementDisplayed(element);
    }

}

