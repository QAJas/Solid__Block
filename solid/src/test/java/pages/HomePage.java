package pages;


import constants.HomePageLocators;
import constants.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage {
        public HomePage() {
                MyDriver.getDriver().get(HomePageLocators.HOME_URL);
        }

        public WebElement log() {
                WebElement log = MyDriver.getDriver().findElement(
                        By.cssSelector(HomePageLocators.LOGIN));
                return log;
        }
}











//
//        MyDriver.getDriver().get(HomePageLocators.HOME_URL);
//    }
//
//    public static WebElement login() {
//        WebElement login = MyDriver.getDriver().findElement(
//                By.cssSelector(HomePageLocators.LOGIN));
//        return login;
//    }
//
//    public WebElement getStarted() {
//        WebElement getStarted  = MyDriver.getDriver().findElement(
//                By.cssSelector(HomePageLocators.GET_STARTED));
//        return getStarted;
//            }
//    public WebElement aboutHeader() {
//        WebElement aboutHeader = MyDriver.getDriver().findElement(
//                By.cssSelector(HomePageLocators.ABOUT_HEADER));
//        return aboutHeader;
//    }







