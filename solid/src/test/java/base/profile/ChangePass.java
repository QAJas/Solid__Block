package base.profile;

import base.BaseTest;
import constants.HomePageLocators;
import constants.LoginLocators;
import constants.ProfieLocators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangePass extends BaseTest {
    @Test  (description = "change password ")
        public void Change(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+654@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(ProfieLocators.PASS_1);
        WaitFor.WaitFori(driver, LoginLocators.NEXT);
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, ProfieLocators.USER_ICON_IN_HEADER);
        driver.findElement(By.cssSelector(ProfieLocators.USER_ICON_IN_HEADER)).click();
        driver.findElement(By.cssSelector(ProfieLocators.PROFILE_ON_HOVER)).click();
        WaitFor.WaitFori(driver,ProfieLocators.PROFILE_SAVE).isSelected();
        driver.findElement(By.cssSelector(ProfieLocators.SECURITY)).click();
        WaitFor.WaitFori(driver, ProfieLocators.NEW_PASS).isDisplayed();
        driver.findElement(By.cssSelector(ProfieLocators.NEW_PASS)).sendKeys(ProfieLocators.PASS_2);
        driver.findElement(By.cssSelector(ProfieLocators.CONFIRM_PASS)).sendKeys(ProfieLocators.PASS_2);
        driver.findElement(By.cssSelector(ProfieLocators.OLD_PASS)).sendKeys(ProfieLocators.PASS_1);
        WaitFor.WaitFori(driver, ProfieLocators.SAVE_PASS_CHANGE).click();
        WaitFor.WaitFori(driver, (ProfieLocators.SUC_FOR_PASS)).isDisplayed();
        driver.navigate().refresh();
        WaitFor.WaitFori(driver, ProfieLocators.NEW_PASS).isDisplayed();
        driver.findElement(By.cssSelector(ProfieLocators.NEW_PASS)).sendKeys(ProfieLocators.PASS_1);
        driver.findElement(By.cssSelector(ProfieLocators.CONFIRM_PASS)).sendKeys(ProfieLocators.PASS_1);
        driver.findElement(By.cssSelector(ProfieLocators.OLD_PASS)).sendKeys(ProfieLocators.PASS_2);
        WaitFor.WaitFori(driver, ProfieLocators.SAVE_PASS_CHANGE).click();
        WaitFor.WaitFori(driver, ProfieLocators.SUC_FOR_PASS).isDisplayed();






    }}
