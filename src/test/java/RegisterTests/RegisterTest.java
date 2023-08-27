package RegisterTests;

import Data.TestData;
import baseTest.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void ValidRegister(){
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
        pageProvider.loginPage().clickOnButtonLoginMainPage();
        pageProvider.loginPage().clickOnButtonSubscribe();
        pageProvider.registerPage().clickOnButtonRegister();
        pageProvider.registerPage().enterTextIntoInputUserName(TestData.generateRandomString(10));
        pageProvider.registerPage().enterTextIntoInputEmail(TestData.generateRandomEmail());
        pageProvider.registerPage().enterTextIntoInputPassword(TestData.generateRandomString(12));
        pageProvider.registerPage().setRegisterCheckBoxState("check");
        pageProvider.registerPage().clickOnButtonSignUp();
        pageProvider.loginPage().CheckIsAvatarDisplayed();

    }


@Test
    public void InvalidRegisterWithExistData(){
    pageProvider.loginPage().openPage();
    pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
    pageProvider.loginPage().clickOnButtonLoginMainPage();
    pageProvider.loginPage().clickOnButtonSubscribe();
    pageProvider.registerPage().clickOnButtonRegister();
    pageProvider.registerPage().enterTextIntoInputUserName(TestData.LOGIN_DEFAULT);
    pageProvider.registerPage().enterTextIntoInputEmail(TestData.EXIST_EMAIL);
    pageProvider.registerPage().enterTextIntoInputPassword(TestData.PASSWORD_DEFAULT);
    pageProvider.registerPage().setRegisterCheckBoxState("check");
    pageProvider.registerPage().clickOnButtonSignUp();
    pageProvider.registerPage().isElementDisplayedByText("User names must be unique. The specified user name is already in use.");
    pageProvider.registerPage().isElementDisplayedByText("Email addresses must be unique. The specified email address is already in use.");
    pageProvider.loginPage().checkIsAvatarNotDisplayed();
    }

    @Test
    public void InvalidRegisterWithIncorrectLogoAndPass(){
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
        pageProvider.loginPage().clickOnButtonLoginMainPage();
        pageProvider.loginPage().clickOnButtonSubscribe();
        pageProvider.registerPage().clickOnButtonRegister();
        pageProvider.registerPage().enterTextIntoInputUserName("11");
        pageProvider.registerPage().enterTextIntoInputEmail("11@gmail.com");
        pageProvider.registerPage().enterTextIntoInputPassword("11");
        pageProvider.registerPage().setRegisterCheckBoxState("check");
        pageProvider.registerPage().clickOnButtonSignUp();
        pageProvider.registerPage().isElementDisplayedByText("Please enter a name that is at least 3 characters long.");
        pageProvider.registerPage().isElementDisplayedByText("Your password must be at least 8 characters long.");
        pageProvider.loginPage().checkIsAvatarNotDisplayed();
    }


}
