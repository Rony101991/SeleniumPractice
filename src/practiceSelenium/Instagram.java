package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://Instagram.com");
        driver.manage().window().maximize();
//        Thread.sleep(5000);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);

        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Phone number, username, or email']")));
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("alimurrony3177");
//        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Rony321544");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
        WebElement login= driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
        Actions a = new Actions(driver);
        a.moveToElement(login).build().perform();
        login.click();

    }
}
