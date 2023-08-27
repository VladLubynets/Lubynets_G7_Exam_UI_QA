package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetailsMenu extends ParentPage{
    @FindBy(xpath = "//*[@id='account-details-my-profile']")
    private WebElement buttonMyProfile;
    @FindBy(xpath = "//*[@id='account-details-following']")
    private WebElement buttonFollowing;
    @FindBy(xpath = "//*[@id='account-details-alerts']")
    private WebElement buttonAlerts;
    @FindBy(xpath = "//*[@id='account-details-conversations']")
    private WebElement buttonConversations;
    @FindBy(xpath = "//*[@id='account-details-my-showcase']")
    private WebElement buttonMyShowcase;
    @FindBy(xpath = "//*[@id='account-details-account-settings']")
    private WebElement buttonAccountSettings;
    @FindBy(xpath = "//*[@id='account-details-grow-your-business']")
    private WebElement buttonGrowYourBusiness;
    @FindBy(xpath = "//*[@id='account-details-premium-subscription']")
    private WebElement buttonPremiumSubscription;
    @FindBy(xpath = "//span[@class='avatar avatar--s avatar--default avatar--default--dynamic']")
    private WebElement avatar;
    @FindBy(xpath = "//span[@itemprop='name' and contains(text(),'Home')]")
    private WebElement buttonHome;
    public AccountDetailsMenu(WebDriver webDriver) {
        super(webDriver);

    }
}
