package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomResults extends AbstractPage {

    public RandomResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void showResult() {
        System.out.println("Random site is open.");
    }
}
