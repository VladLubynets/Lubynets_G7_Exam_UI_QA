package LoginAndHeaderTests;

import Data.TestData;
import baseTest.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class ManageOfAccountMenuTest extends BaseTest {

    @Before
    public void validLogin() {
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
        pageProvider.loginPage().clickOnButtonLoginMainPage();
        pageProvider.loginPage().enterTextIntoInputUserName(TestData.LOGIN_DEFAULT);
        pageProvider.loginPage().enterTextIntoInputPassword(TestData.PASSWORD_DEFAULT);
        pageProvider.loginPage().clickOnButtonLogIn();


    }

    @Test

    public void privacyTest() {
        pageProvider.manageOfAccountMenu().clickOnButtonProfile();
        pageProvider.manageOfAccountMenu().clickOnButtonAccountSettings();
        pageProvider.manageOfAccountMenu().clickOnButtonPrivacy();
        pageProvider.manageOfAccountMenu().selectValueInDropDownDetailsOnProfiePage("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyLocationPost("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyLocationProfile("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyTopicalInfoProfile("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyTopicalInfoPost("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyViewIdentities("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyPersonalConversation("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyNewsFeed("Nobody");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyPost("Nobody");
        pageProvider.manageOfAccountMenu().clickOnButtonSaveChanges();
        pageProvider.manageOfAccountMenu().clickOnButtonProfile();
        pageProvider.manageOfAccountMenu().clickOnButtonAccountSettings();
        pageProvider.manageOfAccountMenu().clickOnButtonPrivacy();
        pageProvider.manageOfAccountMenu().checkAllDropdownsHaveValue("Nobody");
        pageProvider.manageOfAccountMenu().clickOnButtonPrivacy();
        pageProvider.manageOfAccountMenu().selectValueInDropDownDetailsOnProfiePage("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyLocationPost("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyLocationProfile("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyTopicalInfoProfile("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyTopicalInfoPost("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyViewIdentities("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyPersonalConversation("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyNewsFeed("Members only");
        pageProvider.manageOfAccountMenu().selectValueInDropDownPrivacyPost("Members only");
        pageProvider.manageOfAccountMenu().clickOnButtonSaveChanges();
        pageProvider.manageOfAccountMenu().clickOnButtonProfile();
        pageProvider.manageOfAccountMenu().clickOnButtonAccountSettings();
        pageProvider.manageOfAccountMenu().clickOnButtonPrivacy();
        pageProvider.manageOfAccountMenu().checkAllDropdownsHaveValue("Members only");

    }
}
