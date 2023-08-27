package pages;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionWithElements {
    protected WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    protected WebDriverWait webDriverWait10, webDriverWait15;
    public ActionWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

        webDriverWait10 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriverWait15 = new WebDriverWait(webDriver, Duration.ofSeconds(15));
    }


    public void openPage(String url) {
        try {
            webDriver.get(url);
            logger.info("Page was opened " + url);
        } catch (Exception e) {
            logger.info("Can not open " + url);
            Assert.fail("Can not open " + url);
        }

    }

    public void enterTextIntoInput(WebElement input, String text) {
        try {
            webDriverWait10.until(ExpectedConditions.visibilityOf(input));
            webDriverWait10.until(ExpectedConditions.elementToBeClickable(input));
            input.clear();
            input.sendKeys(text);
            logger.info(text + " was inputted into input");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void waitUntil(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickOnElement(WebElement element) {
        waitUntil(element);
        try {
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void checkElementDisplayed(WebElement element) {
        Assert.assertTrue("Element is not displayed", isElementDisplayed(element));
    }

    private void printErrorAndStopTest(Exception e) {
        System.out.println("Can not work with element" + e);
        Assert.fail("Can not work with element" + e);
    }

    public void checkElementNotDisplayed(WebElement element) {
        Assert.assertFalse("Element is displayed", isElementDisplayed(element));
    }

    public void uncheckCheckbox(WebElement checkBoxElement) {
        if (checkBoxElement.isSelected()) {
            clickOnElement(checkBoxElement);
            logger.info("Checkbox is unchecked.");
        } else {
            logger.info("Checkbox is already unchecked.");
        }

    }

    public void setCheckboxState(WebElement checkBoxElement, String state) {
        if (state.equals("check")) {
            checkCheckbox(checkBoxElement);
        } else if (state.equals("uncheck")) {
            uncheckCheckbox(checkBoxElement);
        } else {
            logger.error("Invalid state provided. Please use 'check' or 'uncheck'.");
        }
    }

    public void checkCheckbox(WebElement checkBoxElement) {
        if (!checkBoxElement.isSelected()) {
            clickOnElement(checkBoxElement);
            logger.info("Checkbox is checked.");
        } else {
            logger.info("Checkbox is already checked.");
        }
    }

    public void assertElementNotDisplayed(WebElement element) {
        Assert.assertFalse("Element is displayed", isElementDisplayed(element));
    }

    public void selectTextInDropDown(WebElement dropDown, String text) {
        try {
            Select select = new Select(dropDown);
            select.selectByVisibleText(text);
            logger.info(text + " was selected in DropDown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }
}
