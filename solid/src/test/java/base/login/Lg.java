package base.login;

import base.BaseTest;
import constants.HomePageLocators;
import constants.LoginLocators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseTest;

public class Lg extends BaseTest {
    @Test(groups = {"login"})

    public void loginWithValidData() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+1@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
    }

    @Test(groups = {"login"})
    public void empty() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).click();
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).click();
        WaitFor.WaitFori(driver, LoginLocators.NEXT).isEnabled();
    }

    @Test(groups = {"login"})
    public void lwid() {
        driver.get(HomePageLocators.HOME_URL);
        WebElement loga = WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WebElement z = WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);

        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tc@gmail.com");


        WebElement passField = driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD));
        passField.click();
        passField.sendKeys("654654654");
        WebElement next = driver.findElement(By.cssSelector(LoginLocators.NEXT));
        next.click();

        WebElement wm = WaitFor.WaitFori(driver, LoginLocators.WARNING_MESSAGE);

    }
}
