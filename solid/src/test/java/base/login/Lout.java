package base.login;

import base.BaseTest;
import constants.HomePageLocators;
import constants.LoginLocators;
import constants.ProfieLocators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Lout extends BaseTest {
    @Test (description = "login-logout ")
    public void Logout (){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+7@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, ProfieLocators.USER_ICON_IN_HEADER);
        driver.findElement(By.cssSelector(ProfieLocators.USER_ICON_IN_HEADER)).click();
        driver.findElement(By.cssSelector(ProfieLocators.LOGOUT)).click();
    }
}
