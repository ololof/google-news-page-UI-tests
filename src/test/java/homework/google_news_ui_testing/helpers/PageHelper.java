package homework.google_news_ui_testing.helpers;

import homework.google_news_ui_testing.GooglePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageHelper {
    public static WebDriver initChromeDriver(WebDriver driver) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void getMainPage(GooglePageBase pageUrl, WebDriver driver) {
        driver.get(pageUrl.getMainPage());
    }
}
