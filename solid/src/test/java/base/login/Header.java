package base.login;


import constants.HomePageLocators;
import helpers.WaitFor;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class Header extends BaseTest {
    @Test(groups = {"links", "header"})
    public void tm() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TEAM_HEADER).click();
        Assert.assertEquals(driver.getCurrentUrl(), HomePageLocators.TEAM_URL);
    }

    @Test(groups = {"home url", "header"})
    public void ha() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.ABOUT_HEADER).click();
        Assert.assertEquals(driver.getCurrentUrl(), HomePageLocators.ABOUT_URL);
    }


    @Test(groups = {"home url", "header"})
    public void tok() {
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.TOKEN_HEADER).click();
        Assert.assertEquals(driver.getCurrentUrl(), HomePageLocators.TOK_URL);
    }
    @Test (groups = {"home url", "header"})
    public void blog(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.BLOG_HEADER).click();
        Assert.assertEquals(driver.getCurrentUrl(), HomePageLocators.BLOG_URL);
    }
    @Test (groups = {"home url", "header"})
    public void contact (){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.CONTACT_HEADER).click();
        Assert.assertEquals(driver.getCurrentUrl(), HomePageLocators.CONTACT_URL);
    }
    @Test (groups = {"home url","header"})
    public void logo(){
        driver.get(HomePageLocators.HOME_URL);
        WaitFor.WaitFori(driver, HomePageLocators.LOGO_HEADER).click();
        Assert.assertEquals(driver.getCurrentUrl(), HomePageLocators.HOME_URL);
    }

}


