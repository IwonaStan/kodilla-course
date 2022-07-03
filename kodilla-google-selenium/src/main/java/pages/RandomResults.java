package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomResults extends AbstractPage {

    GoogleResults googleResults;

    public RandomResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String showResult() {
        String str = driver.getCurrentUrl();
        String str1 = str.substring(0,str.indexOf("/",8));
        System.out.println("\nFrom RandomResults.java: \n" + str1);
        return str1;
    }
}
