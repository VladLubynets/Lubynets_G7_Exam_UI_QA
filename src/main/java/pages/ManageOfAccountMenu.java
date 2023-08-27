package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ManageOfAccountMenu extends ParentPage {
    @FindBy(xpath = "//a[@qid='navbar-profile-button']")
    private WebElement buttonProfile;
    @FindBy(xpath = "//a[@href='/account/account-details' and @id='account-details-account-settings']")
    private WebElement buttonAccountSettings;
    @FindBy(xpath = "//a[contains(@class, 'blockLink') and contains(@href, '/account/privacy')]")
    private WebElement buttonPrivacy;
    @FindBy(name = "privacy[allow_view_profile]")
    private WebElement dropDownPrivacy;
    @FindBy(name = "privacy[allow_post_profile]")
    private WebElement dropDownPrivacyPost;
    @FindBy(name = "privacy[allow_receive_news_feed]")
    private WebElement dropDownPrivacyNewsFeed;
    @FindBy(name = "privacy[allow_send_personal_conversation]")
    private WebElement dropDownPrivacyPersonalConversation;
    @FindBy(name = "privacy[allow_view_identities]")
    private WebElement dropDownPrivacyViewIdentities;
    @FindBy(name = "privacy[allow_location_profile]")
    private WebElement dropDownPrivacyLocationProfile;
    @FindBy(name = "privacy[allow_location_post]")
    private WebElement dropDownPrivacyLocationPost;
    @FindBy(name = "privacy[allow_topical_info_profile]")
    private WebElement dropDownPrivacyTopicalInfoProfile;
    @FindBy(name = "privacy[allow_topical_info_post]")
    private WebElement dropDownPrivacyTopicalInfoPost;
    @FindBy(xpath = "//button[@type='submit' and @class='button--primary button button--icon button--icon--save']")
    private WebElement buttonSaveChanges;


    public ManageOfAccountMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnElementIfPresent(WebElement element) {
        if (isElementDisplayed(element)) {
            clickOnElement(element);
        } else {
            assertElementNotDisplayed(element);
        }
    }

    public void clickOnButtonProfile() {
        clickOnElementIfPresent(buttonProfile);
    }

    public void clickOnButtonAccountSettings() {
        clickOnElementIfPresent(buttonAccountSettings);
    }

    public void clickOnButtonPrivacy() {
        clickOnElementIfPresent(buttonPrivacy);
    }

    public void selectValueInDropDownDetailsOnProfiePage(String value) {
        selectTextInDropDown(dropDownPrivacy, value);
    }

    public void selectValueInDropDownPrivacyPost(String value) {
        selectTextInDropDown(dropDownPrivacyPost, value);
    }

    public void selectValueInDropDownPrivacyNewsFeed(String value) {
        selectTextInDropDown(dropDownPrivacyNewsFeed, value);
    }

    public void selectValueInDropDownPrivacyPersonalConversation(String value) {
        selectTextInDropDown(dropDownPrivacyPersonalConversation, value);
    }

    public void selectValueInDropDownPrivacyViewIdentities(String value) {
        selectTextInDropDown(dropDownPrivacyViewIdentities, value);
    }

    public void selectValueInDropDownPrivacyLocationProfile(String value) {
        selectTextInDropDown(dropDownPrivacyLocationProfile, value);
    }

    public void selectValueInDropDownPrivacyLocationPost(String value) {
        selectTextInDropDown(dropDownPrivacyLocationPost, value);
    }

    public void selectValueInDropDownPrivacyTopicalInfoProfile(String value) {
        selectTextInDropDown(dropDownPrivacyTopicalInfoProfile, value);
    }

    public void selectValueInDropDownPrivacyTopicalInfoPost(String value) {
        selectTextInDropDown(dropDownPrivacyTopicalInfoPost, value);
    }

    public void clickOnButtonSaveChanges() {
        waitUntil(buttonSaveChanges);
        clickOnElementIfPresent(buttonSaveChanges);
    }


    public void checkAllDropdownsHaveValue(String expectedValue) {
        checkDropdownValue(dropDownPrivacy, expectedValue);
        checkDropdownValue(dropDownPrivacyPost, expectedValue);
        checkDropdownValue(dropDownPrivacyNewsFeed, expectedValue);
        checkDropdownValue(dropDownPrivacyPersonalConversation, expectedValue);
        checkDropdownValue(dropDownPrivacyViewIdentities, expectedValue);
        checkDropdownValue(dropDownPrivacyLocationProfile, expectedValue);
        checkDropdownValue(dropDownPrivacyLocationPost, expectedValue);
        checkDropdownValue(dropDownPrivacyTopicalInfoProfile, expectedValue);
        checkDropdownValue(dropDownPrivacyTopicalInfoPost, expectedValue);
    }

    private void checkDropdownValue(WebElement dropdown, String expectedValue) {
        Select select = new Select(dropdown);
        String selectedValue = select.getFirstSelectedOption().getText();
        if (!selectedValue.equals(expectedValue)) {
            throw new AssertionError("Dropdown value is not '" + expectedValue + "' as expected.");
        }
    }
}




