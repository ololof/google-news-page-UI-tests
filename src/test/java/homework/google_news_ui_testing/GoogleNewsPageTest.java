package homework.google_news_ui_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homework.google_news_ui_testing.helpers.PageHelper.getMainPage;
import static homework.google_news_ui_testing.helpers.PageHelper.initChromeDriver;
import static homework.google_news_ui_testing.helpers.Utils.PREDEFINED_CITY;
import static org.testng.Assert.*;

public class GoogleNewsPageTest {
    private WebDriver driver;
    private GoogleNewsPage googleNewsPage;

    @BeforeMethod
    public void setUp() {
        driver = initChromeDriver(driver);
        googleNewsPage = new GoogleNewsPage(driver);
        getMainPage(googleNewsPage, driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void checkThatPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement firstNewsTopic = wait.until(ExpectedConditions.elementToBeClickable(googleNewsPage.firstNewsTopic));
        assertNotNull(firstNewsTopic, "First topic is not clickable, check page has been loaded");
    }

    @Test
    public void checkWeatherForPredefinedCity() {
        String currentCityWeather = googleNewsPage.cityWeather.getText();
        assertEquals(PREDEFINED_CITY, currentCityWeather, "Check that the weather is displaying for " + PREDEFINED_CITY);
    }

    @Test
    public void checkThereAreMoreThenOneNews() {
        assertTrue(googleNewsPage.newsPageTopics.size() > 1, "Check that number of news topics is more than 1");
    }
}
