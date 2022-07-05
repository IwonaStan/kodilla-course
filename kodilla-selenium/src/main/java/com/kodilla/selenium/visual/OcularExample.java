package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\codilla-course\\kodilla-selenium\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://infoludek.pl/");

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\HP\\Desktop\\KURS\\Ocular\\results"))
                .snapshotPath(Paths.get("C:\\Users\\HP\\Desktop\\KURS\\Ocular\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.compare();
        page.close();
    }
}
