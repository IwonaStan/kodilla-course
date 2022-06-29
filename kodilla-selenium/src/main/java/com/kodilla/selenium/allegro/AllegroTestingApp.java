package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div[2]/button[1]")).click();

        WebElement webElement = driver.findElement(
                By.xpath("/html/body/div[3]/div[4]/div/div/div/div/div/div[3]/header/div/div/div/div/form/div[3]/div/select"));
        Select select = new Select(webElement);
        select = new Select(webElement);
        select.selectByIndex(3);

        webElement = driver.findElement(
                By.xpath("/html/body/div[3]/div[4]/div/div/div/div/div/div[3]/header/div/div/div/div/form/input"));
        webElement.sendKeys("Mavic mini");
        webElement.submit();
    }
}
