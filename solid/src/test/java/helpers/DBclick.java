package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DBclick {

    private WebDriver driver;

    public  void Double() {
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.cssSelector("selector"));
        actions.doubleClick(elementLocator).perform();


    }

}