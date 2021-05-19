package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@ class='logo img-responsive']")).getText();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul/li[1]/a")).click();
    }
}
