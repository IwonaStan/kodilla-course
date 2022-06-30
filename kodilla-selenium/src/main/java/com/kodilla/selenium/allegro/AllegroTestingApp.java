package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        driver.findElement(By.cssSelector("button[class^='mgn2_14']")).click();

        WebElement webElement = driver.findElement(By.cssSelector("select[class^='mr3m_1']"));
        Select select = new Select(webElement);
        select = new Select(webElement);
        select.selectByIndex(3);

        webElement = driver.findElement(By.cssSelector("input[data-role='search-input']"));
        webElement.sendKeys("Mavic mini");
        webElement.submit();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("section>article")));
        List<WebElement> results = driver.findElements(By.cssSelector("section>article"));
        for(WebElement result : results) {
            System.out.println(result.getText());
        }
    }
}
