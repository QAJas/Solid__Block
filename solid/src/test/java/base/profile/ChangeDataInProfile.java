package base.profile;

import constants.HomePageLocators;
import constants.LoginLocators;
import constants.ProfieLocators;
import helpers.Generators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.BaseTest;

public class ChangeDataInProfile extends BaseTest {



//    @BeforeMethod
    @Test(groups = {"profile"})
    public void ChangeData(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys(LoginLocators.EMAIL_VALUE);
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(LoginLocators.PASSWORD_VALUE);
        WaitFor.WaitFori(driver, LoginLocators.NEXT);
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
  WaitFor.WaitFori(driver, ProfieLocators.USER_ICON_IN_HEADER);
        driver.findElement(By.cssSelector(ProfieLocators.USER_ICON_IN_HEADER)).click();
        driver.findElement(By.cssSelector(ProfieLocators.PROFILE_ON_HOVER)).click();
        WaitFor.WaitFori(driver,ProfieLocators.PROFILE_SAVE).isSelected();
        Actions actions = new Actions(driver);
        driver.findElement(By.cssSelector(ProfieLocators.PROFILE_NAME)).click();
        WaitFor.WaitFori(driver, ProfieLocators.PROFILE_NAME).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
                WaitFor.WaitFori(driver, ProfieLocators.PROFILE_LAST_NAME).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.COUNTRY).click();
        WaitFor.WaitFori(driver, ProfieLocators.US_DROP_DOWN).click();
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.ADDRESS).click();
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.STATE).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.CITY).sendKeys(Generators.Name());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();
        WaitFor.WaitFori(driver, ProfieLocators.ZIP_CODE).sendKeys(Generators.randomeNum());
        actions.moveToElement(driver.findElement(By.cssSelector(ProfieLocators.PROFILE_SAVE))).click();


        }

    }

