package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleAttacket {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.quit();
    }
}
