package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class^='g ']")
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
        results.get(x).click();

        RandomResults randomResults = new RandomResults(driver);
        return randomResults;

    }
}
