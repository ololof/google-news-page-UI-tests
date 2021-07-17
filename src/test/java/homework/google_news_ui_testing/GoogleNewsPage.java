package homework.google_news_ui_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleNewsPage extends GooglePageBase {
    @FindBy(xpath = "(//*[contains(@class, 'VDXfz')])[1]")
    public WebElement firstNewsTopic;

    @FindBy(xpath = "(//*[contains(@class, 'cp7Yvc')])[2]")
    public WebElement cityWeather;

   @FindBy(xpath = "//*[contains(@class, 'NiLAwe')]")
    public List<WebElement> newsPageTopics;

    public GoogleNewsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
