package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchMenu extends ParentPage {
    @FindBy(xpath = "//input[@id='search-keywords']")
    private WebElement InputSearch;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    private WebElement buttonSearchByUI;
    @FindBy(xpath = "//a[contains(@qid, 'search-results-title') and contains(@href, '/threads/bmw-new-site-for-efficient-dynamics.')]")
    private WebElement SearchResult;
    @FindBy(xpath = "//button[@type='button' and @class='filterBar-menuTrigger button menuTrigger button' and @id='advanced-search_filter-button']")
    private WebElement buttonFilter;
    @FindBy(xpath = "//button[@type='button' and @class='filterBar-menuTrigger button menuTrigger button' and @qid='search-results-sort-button']")
    private WebElement buttonSort;


    public SearchMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnInputSearch() {
        clickOnElement(InputSearch);
    }

    public void enterTextIntoInputSearch(String text) {
        enterTextIntoInput(InputSearch, text);
    }

    public void clickOnButtonSearchByUI() {
        clickOnElement(buttonSearchByUI);
    }

    public void checkSearchResultIsDisplayed() {
        checkElementDisplayed(SearchResult);
    }

    public void checkIsFilterDisplayed() {
        checkElementDisplayed(buttonFilter);

    }

    public void checkIsSortDisplayed() {
        checkElementDisplayed(buttonSort);

    }
}






