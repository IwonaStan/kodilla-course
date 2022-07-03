package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class^='g ']")
    private List<WebElement> results;
    private RandomResults randomResults;
    String description;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void iSeeResults() {
        System.out.println("I see results: " + results.size());
    }
    public RandomResults randomResult(WebDriver driver) {
        int result = randomNumber();
        System.out.println("Random result number: " + result);

        saveText(result);

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(results.get(result).findElement(By.tagName("h3")))).click();

        RandomResults randomResults = new RandomResults(driver);
        return randomResults;
    }
    public int randomNumber() {
        Random random = new Random();
        int number = random.nextInt(results.size());
        return number;
    }
    public String saveText(int r) {
        description = results.get(r).findElement(By.cssSelector("a[href]")).getText();
        System.out.println("\nFrom GoogleResults.java: \n" + description);
        return description;
    }
}
