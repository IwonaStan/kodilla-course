import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.RandomResults;


public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\codilla-course\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
    }
/*
    @After
    public void tearDown() {
        driver.close();
    }
*/
    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.randomResult(driver);
        RandomResults randomResults = new RandomResults(driver);
        randomResults.showResult();
    }
}
