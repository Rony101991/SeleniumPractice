package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class GooglePractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("How Search works")).click();
        Thread.sleep(2000);
        WebElement web =driver.findElement(By.linkText("How Google Search works"));
//        WebElement src=driver.findElement(By.xpath("//div[@class='content content-hsw-overview']/div/section[1]/div[2]/div/div/div/div/h2"));
        System.out.println(web.getText());

    }
}
