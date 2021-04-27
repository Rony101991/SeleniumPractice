package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CvsPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://cvs.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Shop Online")).click();
        driver.findElement(By.linkText("Shop now")).click();
    }
}
