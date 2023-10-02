package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionMenu extends ParentPage {
    @FindBy(xpath = "//button[@class='new-navigation vl-middle style-chooser wayfinding-4']")
    private WebElement buttonActionMenu;
    @FindBy(xpath = "//a[@href='/whats-new/posts/' and @class='menu-linkRow']")
    private WebElement buttonWhatsNew;
    @FindBy(xpath = "//a[@href='/forums/' and @class='menu-linkRow']")
    private WebElement buttonForumListing;
    @FindBy(xpath = "//a[@href='/marketplace/' and @class='menu-linkRow']")
    private WebElement buttonMarketplace;
    @FindBy(xpath = "//a[@href='/showcase/' and @class='menu-linkRow']")
    private WebElement buttonShowcase;
    @FindBy(xpath = "//a[@href='/media/' and @class='menu-linkRow']")
    private WebElement buttonGallery;
    @FindBy(xpath = "//a[@href='/search/' and @class='menu-linkRow']")
    private WebElement buttonAdvancedSearch;
    @FindBy(xpath = "//a[@href='/members/' and @class='menu-linkRow']")
    private WebElement buttonMembers;
    @FindBy(xpath = "//a[@href='/help/faq' and @class='menu-linkRow']")
    private WebElement buttonHelp;
    @FindBy(xpath = "//li[@class='california-menu-item--dark']//a[@id='kebab-menu-theme-link' and @class='menu-linkRow link-padded' and @qid='theme-popup-menu-item']")
    private WebElement buttonDarkTheme;
    @FindBy(xpath = "//li[@class='california-menu-item--light']//a[@id='kebab-menu-theme-link' and @class='menu-linkRow link-padded' and @qid='theme-popup-menu-item']")
    private WebElement buttonLightTheme;
    @FindBy(xpath = "//span[@itemprop='name' and contains(text(),'Home')]")
    private WebElement buttonHome;
    @FindBy(xpath = "//h1[@class='  ' and @qid='page-header' and contains(text(), \"What's New\")]")
    private WebElement buttonHeaderWhatsNew;
    @FindBy(xpath = "//a[@href='/whats-new/posts/' and @qid='new-post-button']")
    private WebElement buttonNewPosts;
    @FindBy(xpath = "//a[@href='/whats-new/' and @qid='popular-button']")
    private WebElement buttonPopular;
    @FindBy(xpath = "//a[@href='/whats-new/showcase-items/' and @qid='new-showcase-button']")
    private WebElement buttonNewShowcaseItems;
    @FindBy(xpath = "//a[@href='/whats-new/media/' and @qid='new-gallery-button']")
    private WebElement buttonNewGallery;
    @FindBy(xpath = "//a[@href='/whats-new/articles/' and @qid='new-articles-button']")
    private WebElement buttonNewArticles;
    @FindBy(xpath = "//a[contains(@class, 'tabs-tab') and contains(@href, '/whats-new/looking-for-replies') and contains(@qid, 'looking-for-replies-button')]")
    private WebElement buttonNewLookingForReplies;
    @FindBy(xpath = "//a[contains(@class, 'tabs-tab') and contains(@href, '/whats-new/news-feed') and contains(@qid, 'news-feed-button')]")
    private WebElement buttonNewsFeed;
    @FindBy(xpath = "//div[@class='section-header' and @qid='category-header']")
    private WebElement buttonHeaderForumListing;
    @FindBy(xpath = "//a[@href='/forums/new-member-introductions.129/']")
    private WebElement branchNewMemberIntroductions;
    @FindBy(xpath = "//a[@href='/forums/general-bmw-questions.2/' and text()='General BMW Questions']")
    private WebElement branchGeneralBMWQuestions;
    @FindBy(xpath = "//a[@href='/forums/bmw-news.47/' and text()='BMW News']")
    private WebElement branchBMWNews;
    @FindBy(xpath = "//h1[@qid='page-header' and contains(text(),'All Marketplace Listings')]")
    private WebElement buttonHeaderMarketplace;
    @FindBy(xpath = "//a[@class='filterBar-menuTrigger button' and @id='listing-filter-toggle-button']")
    private WebElement buttonFilter;
    @FindBy(xpath = "//a[@class='filterBar-menuTrigger button' and @id='listing-sorting-toggle-button']")
    private WebElement buttonSort;
    @FindBy(xpath = "//h1[@qid='page-header' and contains(text(),'Showcase')]")
    private WebElement buttonHeaderShowcase;
    @FindBy(xpath = "//a[@class='filterBar-menuTrigger filter-spacer button button--alt' and @id='filter-bar-categories']")
    private WebElement buttonFilterCategories;
    @FindBy(xpath = "//a[@class='filterBar-menuTrigger button button--alt' and @role='button']")
    private WebElement buttonFilterShowcase;
    @FindBy(xpath = "//h3[@class='block-header']")
    private WebElement buttonHeaderMedia;
    @FindBy(xpath = "//h1[@qid='page-header' and contains(text(),'Gallery')]")
    private WebElement buttonHeaderGallery;
    @FindBy(xpath = "//a[@class='categoryList-link' and contains(text(),'BMW Photos')]")
    private WebElement branchBMWPhotos;
    @FindBy(xpath = "//a[@class='blockLink' and contains(text(),'Browse albums')]")
    private WebElement branchBrowseAlbums;
    @FindBy(xpath = "//h1[@qid='page-header' and contains(text(),'Advanced Search')]")
    private WebElement buttonHeaderAdvancedSearch;
    @FindBy(xpath = "//a[@class='tabs-tab is-active' and contains(text(),'Search Discussions')]")
    private WebElement buttonSearchDiscussions;
    @FindBy(xpath = "//a[@class='tabs-tab ' and contains(text(),'Search Showcase')]")
    private WebElement buttonSearchShowcase;
    @FindBy(xpath = "//a[@class='tabs-tab ' and contains(text(),'Search Albums')]")
    private WebElement buttonSearchAlbums;
    @FindBy(xpath = "//h1[@class='p-title-value' and contains(text(),'Notable members')]")
    private WebElement buttonHeaderMembers;
    @FindBy(xpath = "//h3[@class='block-header']")
    private WebElement listOfMembers;
    @FindBy(xpath = "//a[@class='blockLink is-selected' and contains(text(),'Overview')]")
    private WebElement buttonOverview;
    @FindBy(xpath = "//h1[@qid='page-header' and contains(text(),'FAQ')]")
    private WebElement buttonHeaderFAQ;
    @FindBy(xpath = "//h2[@class='block-header']")
    private WebElement listOfFAQ;
    @FindBy(xpath = "//a[@href='/help/faq/' and @class='blockLink is-selected']")
    private WebElement buttonFAQ;
    @FindBy(xpath = "//a[@href='https://www.bimmerfest.com' and img[@alt='BimmerFest BMW Forum']]")
    private WebElement buttonBimmerfestLogo;


    public ActionMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnActionMenu() {
        clickOnElement(buttonActionMenu);
    }

    public void clickOnButtonWhatsNew() {
        clickOnActionMenu();
        clickOnElement(buttonWhatsNew);
    }

    public void clickOnButtonForumListing() {
        clickOnActionMenu();
        clickOnElement(buttonForumListing);
    }

    public void clickOnButtonMarketplace() {
        clickOnActionMenu();
        clickOnElement(buttonMarketplace);
    }

    public void clickOnButtonShowcase() {
        clickOnActionMenu();
        clickOnElement(buttonShowcase);
    }

    public void clickOnButtonGallery() {
        clickOnActionMenu();
        clickOnElement(buttonGallery);
    }

    public void clickOnButtonAdvancedSearch() {
        clickOnActionMenu();
        clickOnElement(buttonAdvancedSearch);
    }

    public void clickOnButtonMembers() {
        clickOnActionMenu();
        clickOnElement(buttonMembers);
    }

    public void clickOnButtonHelp() {
        clickOnActionMenu();
        clickOnElement(buttonHelp);
    }

    public void clickOnButtonDarkTheme() {
        clickOnElement(buttonDarkTheme);
    }

    public void clickOnButtonThemeLight() {
        clickOnElement(buttonLightTheme);
    }

    public void clickOnButtonHome() {
        clickOnElement(buttonHome);
    }

    public void clickOnButtonBimmer() {
        clickOnElement(buttonBimmerfestLogo);
    }

    public void checkWhatsNewElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderWhatsNew);
        checkElementDisplayed(buttonNewPosts);
        checkElementDisplayed(buttonPopular);
        checkElementDisplayed(buttonNewShowcaseItems);
        checkElementDisplayed(buttonNewGallery);
        checkElementDisplayed(buttonNewArticles);
        checkElementDisplayed(buttonNewLookingForReplies);
        checkElementDisplayed(buttonNewsFeed);
        checkElementDisplayed(buttonHome);

    }

    public void checkForumListingElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderForumListing);
        checkElementDisplayed(branchNewMemberIntroductions);
        checkElementDisplayed(branchGeneralBMWQuestions);


    }

    public void checkMarketplaceElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderMarketplace);
        checkElementDisplayed(buttonFilter);
        checkElementDisplayed(buttonSort);
        checkElementDisplayed(buttonHome);

    }

    public void checkShowcaseElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderShowcase);
        checkElementDisplayed(buttonFilterCategories);
        checkElementDisplayed(buttonFilterShowcase);
        checkElementDisplayed(buttonHome);

    }

    public void checkGalleryElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderGallery);
        checkElementDisplayed(buttonHeaderMedia);
        checkElementDisplayed(branchBMWPhotos);
        checkElementDisplayed(branchBrowseAlbums);
        checkElementDisplayed(buttonHome);

    }

    public void checkAdvancedSearchElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderAdvancedSearch);
        checkElementDisplayed(buttonSearchDiscussions);
        checkElementDisplayed(buttonSearchShowcase);
        checkElementDisplayed(buttonSearchAlbums);
        ;


    }

    public void checkMembersElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderMembers);
        checkElementDisplayed(listOfMembers);
        checkElementDisplayed(buttonOverview);


    }

    public void checkFaqElementsIsDisplayed() {
        checkElementDisplayed(buttonHeaderFAQ);
        checkElementDisplayed(listOfFAQ);
        checkElementDisplayed(buttonFAQ);
        checkElementDisplayed(buttonHome);

    }

    public void clickOnDarkThemeAndCheck() {
        clickOnActionMenu();
        clickOnButtonDarkTheme();
        waitForBackgroundColorChange("rgb(255, 255, 255)", 10);
        clickOnActionMenu();
        clickOnButtonThemeLight();
        waitForBackgroundColorChange("rgb(0, 0, 0)", 10);
    }

    public void waitForBackgroundColorChange(String expectedColor, int timeoutInSeconds) {
        ExpectedCondition<Boolean> colorChangeCondition = webDriver -> {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;
            String currentColor = (String) jsExecutor.executeScript("return window.getComputedStyle(document.body).backgroundColor");
            return !currentColor.equals(expectedColor);
        };

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(timeoutInSeconds));
        try {
            if (!wait.until(colorChangeCondition)) {
                throw new AssertionError("Background color did not change as expected.");
            }
        } catch (TimeoutException e) {
            throw new AssertionError("Timed out waiting for background color to change.");
        }
    }

}
