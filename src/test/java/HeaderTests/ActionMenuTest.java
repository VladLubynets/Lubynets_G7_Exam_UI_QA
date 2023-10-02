package HeaderTests;

import Data.TestData;
import baseTest.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class ActionMenuTest extends BaseTest {

    @Before
    public void ValidLogin() {
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();
        pageProvider.loginPage().clickOnButtonLoginMainPage();
        pageProvider.loginPage().enterTextIntoInputUserName(TestData.LOGIN_DEFAULT);
        pageProvider.loginPage().enterTextIntoInputPassword(TestData.PASSWORD_DEFAULT);
        pageProvider.loginPage().clickOnButtonLogIn();


    }

    @Test
    public void CheckActionMenu() {
        pageProvider.actionMenu().clickOnButtonWhatsNew();
        pageProvider.actionMenu().checkWhatsNewElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonForumListing();
        pageProvider.actionMenu().checkForumListingElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonMarketplace();
        pageProvider.actionMenu().checkMarketplaceElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonShowcase();
        pageProvider.actionMenu().checkShowcaseElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonGallery();
        pageProvider.actionMenu().checkGalleryElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonAdvancedSearch();
        pageProvider.actionMenu().checkAdvancedSearchElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonMembers();
        pageProvider.actionMenu().checkMembersElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonHelp();
        pageProvider.actionMenu().checkFaqElementsIsDisplayed();

    }

    @Test
    public void DarkModeTest() {
        pageProvider.actionMenu().clickOnDarkThemeAndCheck();

    }

}