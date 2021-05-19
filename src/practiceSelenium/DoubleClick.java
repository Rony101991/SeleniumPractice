package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:swisnl.github.io/jQuery-contextMenu/demo.html");

        //  driver.manage().window().maximize();  // maximize window
        driver.manage().deleteAllCookies();  // delete all cookies

        Actions actions = new Actions(driver);

        WebElement rightClick = driver.findElement(By.cssSelector(".context-menu-one"));

        actions.contextClick(rightClick).build().perform();
        Thread.sleep(3000);
        WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));

        Thread.sleep(2000);

        String copyText = copy.getText();
        Thread.sleep(2000);
        System.out.println(copy.getText());
        Thread.sleep(2000);
        copy.click();

    }
}
