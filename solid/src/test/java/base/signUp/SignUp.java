package base.signUp;

import constants.HomePageLocators;
import constants.LoginLocators;
import helpers.Generators;
import helpers.WaitFor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseTest;

public class SignUp extends BaseTest {
    @Test(groups = {"sign up"})
    public void sign() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        WaitFor.WaitFori(driver, LoginLocators.NEXT).isSelected();
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
        WaitFor.WaitFori(driver, LoginLocators.USA);
        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
//        WebElement el = driver.findElement(By.cssSelector(LoginLocators.USA));
//        Actions builder = new Actions(driver);
//        builder.doubleClick(el).perform();
        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).click();
        WaitFor.WaitFori(driver, LoginLocators.NEXT_FINISH).click();
        driver.findElement(By.cssSelector(LoginLocators.EXIT));


    }

    @Test(groups = {"sign up"})
    public void invalidEmail() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys("kms");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).isEnabled();

    }

    @Test(groups = {"sign up"})
    public void invalidPass() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("1");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).isEnabled();

    }

    @Test(groups = {"sign up"})
    public void emaptyName() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
        WaitFor.WaitFori(driver, LoginLocators.USA);
        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();


    }

    @Test(groups = {"sign up"})
    public void emptyLastName() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        driver.findElement(By.cssSelector(LoginLocators.FIRSTNAME)).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
        WaitFor.WaitFori(driver, LoginLocators.USA);
        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();

    }

    @Test(groups = {"sign up"})
    public void withoutCountry() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();
    }

    @Test(groups = {"sign up"})
    public void withoutPhone() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
        WaitFor.WaitFori(driver, LoginLocators.USA);
        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).isEnabled();

    }

    @Test(groups = {"sign up"})
    public void nextSelected() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.GET_STARTED).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD).sendKeys(Generators.generateMail());
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys(Generators.randomeNum());
        WaitFor.WaitFori(driver, LoginLocators.NEXT);
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        WaitFor.WaitFori(driver, LoginLocators.FIRSTNAME).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.LASTNAME)).sendKeys(Generators.getUniqueId());
        driver.findElement(By.cssSelector(LoginLocators.COUNTRY)).click();
        WaitFor.WaitFori(driver, LoginLocators.USA);
        driver.findElement(By.cssSelector(LoginLocators.USA)).click();
        WaitFor.WaitFori(driver, LoginLocators.PHONE).sendKeys(Generators.phonenumer());
        WaitFor.WaitFori(driver, LoginLocators.CONFIRM);
        driver.findElement(By.cssSelector(LoginLocators.CONFIRM)).click();
        WaitFor.WaitFori(driver, LoginLocators.NEXT_FINISH).isSelected();
        driver.findElement(By.cssSelector(LoginLocators.EXIT));


        }
    }
