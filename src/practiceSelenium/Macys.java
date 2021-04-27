package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Macys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://Macys.com/");
        driver.manage().window().maximize();

        JavascriptExecutor src= (JavascriptExecutor) driver;
        Thread.sleep(3000);
        src.executeScript("window.scrollBy(0,2400);");
        WebElement mc=driver.findElement(By.cssSelector("#footer-redesign-row-1-panels-container"));//for all footer
        System.out.println(mc.getText());
        WebElement cm=driver.findElement(By.cssSelector("#footer-redesign-row-1-panels-container > div:nth-child(1) > label"));
        //for only specific footer
        System.out.println(cm.getText());




    }

}
