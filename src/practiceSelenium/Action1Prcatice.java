package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.*;

public class Action1Prcatice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:jqueryui.com/droppable/");
        driver.manage().window().maximize();

//        JavascriptExecutor src= (JavascriptExecutor) driver;
//        Thread.sleep(3000);
//        src.executeScript("window.scrollBy(0,2400);");
        WebDriverWait wait = new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath()))
    }
}
