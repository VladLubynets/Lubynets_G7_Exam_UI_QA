package SearchTest;


import baseTest.BaseTest;
import org.junit.Before;
import org.junit.Test;


public class SearchTest extends BaseTest {

    @Before
    public void WayToMainPage() {
        pageProvider.loginPage().openPage();
        pageProvider.loginPage().clickOnButtonAgreeCookiesIfExists();

    }

    @Test
    public void searchTest() {
        pageProvider.searchMenu().clickOnInputSearch();
        pageProvider.searchMenu().enterTextIntoInputSearch("bmw site");
        pageProvider.searchMenu().clickOnButtonSearchByUI();
        pageProvider.searchMenu().checkSearchResultIsDisplayed();
        pageProvider.searchMenu().checkIsFilterDisplayed();
        pageProvider.searchMenu().checkIsSortDisplayed();

    }
}