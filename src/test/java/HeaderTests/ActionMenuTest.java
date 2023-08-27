package HeaderTests;

import Data.TestData;
import baseTest.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class ActionMenuTest extends BaseTest {

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
    public void checkActionMenu(){
        pageProvider.actionMenu().clickOnButtonWhatsNew();
        pageProvider.actionMenu().WhatsNewElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonForumListing();
        pageProvider.actionMenu().ForumListingElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonMarketplace();
        pageProvider.actionMenu().MarketplaceElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonShowcase();
        pageProvider.actionMenu().ShowcaseElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonGallery();
        pageProvider.actionMenu().GalleryElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonAdvancedSearch();
        pageProvider.actionMenu().AdvancedSearchElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonMembers();
        pageProvider.actionMenu().MembersElementsIsDisplayed();
        pageProvider.actionMenu().clickOnButtonHelp();
        pageProvider.actionMenu().FaqElementsIsDisplayed();

    }
    @Test
    public void DarkModeTest(){
        pageProvider.actionMenu().clickOnDarkThemeAndCheck();

    }

}