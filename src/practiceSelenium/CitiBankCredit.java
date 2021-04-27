package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBankCredit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://citibank.com");
        driver.findElement(By.xpath("/html/body/div[1]/nav/a[1]/img")).click();
    }
}
