package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div>a>h3")
    private List<WebElement> results;
    private RandomResults randomResults;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
    public RandomResults randomResult(WebDriver driver) {
        Random random = new Random();
        int x = random.nextInt(results.size());

        System.out.println("Random result number: " + x);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(results.get(x))).click();

        RandomResults randomResults = new RandomResults(driver);
        return randomResults;
    }
}
