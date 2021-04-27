package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://citibank.com");
        JavascriptExecutor src= (JavascriptExecutor) driver;
        Thread.sleep(3000);
        src.executeScript("window.scrollBy(0,2400);");
        driver.findElement(By.xpath("//*[@id='f899c5bd-891b-3ae2-655b-157137214b07']")).click();
        //*[@id="f899c5bd-891b-3ae2-655b-157137214b07"]

    }
}
