package constants.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MyDriver {
    private static WebDriver driver;

    public static WebDriver createDriver(String browser) {
        switch (browser) {
            case "chrome":

                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("window-size=1400,800");
                chromeOptions.addArguments("headless");
                driver= new ChromeDriver(chromeOptions);

//                WebDriver driver = new ChromeDriver(chromeOptions);
//               driver = new ChromeDriver();
//
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
//                driver = new ChromeDriver(options);


                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "Opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;


        }
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver("chrome");
        }
        return driver;


    }

}
