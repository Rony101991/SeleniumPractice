package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBankSaving {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://citibank.com");
        driver.findElement(By.xpath("//*[@id=\'mobileMenuLink\']")).click();
        driver.findElement(By.xpath("//*[@id='navcreditCardmainAnchor0']")).click();


        JavascriptExecutor ar=(JavascriptExecutor) driver;
        //down
        Thread.sleep(3000);
        ar.executeScript("window.scrollBy(0,2400)");
        //up
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='d2887411-a685-8435-55a4-7f8bf29656a4']")).click();
        driver.navigate().back();


//        Thread.sleep(3000);
//        ar.executeScript("window.scrollBy(0,-1500)");

    }
}
