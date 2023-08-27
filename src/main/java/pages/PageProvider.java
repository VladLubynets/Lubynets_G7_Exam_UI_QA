package pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage loginPage() {
        return new LoginPage(webDriver);
    }

    public RegisterPage registerPage() {
        return new RegisterPage(webDriver);
    }

    public ActionMenu actionMenu() {
        return new ActionMenu(webDriver);

    }

    public SearchMenu searchMenu() {
        return new SearchMenu(webDriver);

    }

    public AccountDetailsMenu accountDetailsMenu() {
        return new AccountDetailsMenu(webDriver);

    }

    public ManageOfAccountMenu manageOfAccountMenu() {
        return new ManageOfAccountMenu(webDriver);

    }

}