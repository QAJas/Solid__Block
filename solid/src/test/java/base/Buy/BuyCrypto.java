
package base.Buy;

        import base.BaseTest;
        import constants.GetLocators;
        import constants.HomePageLocators;
        import constants.LoginLocators;
        import constants.ProfieLocators;
        import helpers.WaitFor;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class BuyCrypto  extends BaseTest {




    @Test
    public void BuyWithCrypto(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
        driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
        WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
        driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik@gmail.com");
        driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
        driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
        Actions actions = new Actions(driver);
        WaitFor.WaitFori(driver, ProfieLocators.LDB).isDisplayed();
        actions.moveToElement(driver.findElement(By.cssSelector( ProfieLocators.LDB)));
        WebElement elementL = driver.findElement(By.cssSelector(ProfieLocators.LDB));
        JavascriptExecutor jsL= (JavascriptExecutor) driver;
        jsL.executeScript("arguments[0].click();", elementL);

        WaitFor.WaitFori(driver, GetLocators.BUY_BUTTON).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(GetLocators.BUY_BUTTON)));
        WebElement elementB = driver.findElement(By.cssSelector(GetLocators.BUY_BUTTON));
        JavascriptExecutor jsB= (JavascriptExecutor) driver;
        jsB.executeScript("arguments[0].click();", elementB);

        WaitFor.WaitFori(driver, GetLocators.CHECKOUT_CONFIRM).isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(GetLocators.CHECKOUT_CONFIRM)));
        WebElement elementC = driver.findElement(By.cssSelector(GetLocators.CHECKOUT_CONFIRM));
        JavascriptExecutor jsC= (JavascriptExecutor) driver;
        jsC.executeScript("arguments[0].click();", elementC);


        WaitFor.WaitFori(driver, GetLocators.CHECKOUT_PAYMENT_CRYPTO).click();
        JavascriptExecutor jsP= (JavascriptExecutor) driver;
        jsP.executeScript("scroll(0, 250);");
        WaitFor.WaitFori(driver, GetLocators.CONFIRM_FOR_CRYPTO).isSelected();
        WebElement elementP = driver.findElement(By.cssSelector(GetLocators.CHECKOUT_PAYMENT_CRYPTO));
        JavascriptExecutor jsp= (JavascriptExecutor) driver;
        jsp.executeScript("arguments[0].click();", elementP);
        actions.moveToElement(driver.findElement(By.cssSelector(GetLocators.CONFIRM_FOR_CRYPTO))).click().build();





        driver.getCurrentUrl().equals("https://demo.solidblock.net/confirmation");

        WaitFor.WaitFori(driver, "#root > main > div:nth-child(3) > div.confirmation-container > div.confirmation-component > div > div.confirmation-2 > button").isSelected();
        actions.moveToElement(driver.findElement(By.cssSelector(GetLocators.MY_INVESTMENT_BUTTON)));
        WebElement elementM = driver.findElement(By.cssSelector(GetLocators.MY_INVESTMENT_BUTTON));
        JavascriptExecutor jsM= (JavascriptExecutor) driver;
        jsM.executeScript("arguments[0].click();", elementM);

        driver.getCurrentUrl().equals("https://demo.solidblock.net/my-investments");
    }

}


