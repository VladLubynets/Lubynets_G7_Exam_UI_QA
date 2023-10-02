package LoginAndHeaderTests;

import Data.TestData;
import baseTest.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() {
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
        pageProvider.loginPage().clickOnButtonLoginMainPage();
        pageProvider.loginPage().enterTextIntoInputUserName(TestData.LOGIN_DEFAULT);
        pageProvider.loginPage().enterTextIntoInputPassword(TestData.PASSWORD_DEFAULT);
        pageProvider.loginPage().clickOnButtonLogIn();
        pageProvider.loginPage().checkIsAvatarDisplayed();
        pageProvider.loginPage().clickOnAvatar();
        pageProvider.loginPage().clickOnButtonLogOut();
        pageProvider.loginPage().checkIsAvatarNotDisplayed();

    }


    @Test
    public void invalidLogin() {
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
        pageProvider.loginPage().clickOnButtonLoginMainPage();
        pageProvider.loginPage().enterTextIntoInputUserName(TestData.LOGIN_INVALID);
        pageProvider.loginPage().enterTextIntoInputPassword(TestData.PASSWORD_INVALID);
        pageProvider.loginPage().clickOnButtonLogIn();
        pageProvider.loginPage().checkIsErrorMessageLoginPageDisplayed();
        pageProvider.loginPage().checkIsAvatarNotDisplayed();
    }
}


