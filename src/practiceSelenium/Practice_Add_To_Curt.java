package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Add_To_Curt {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://gamestop.com");
        driver.findElement(By.xpath("//img[@src='//media.gamestop.com/i/gamestop/Nav_Ps4_2.jpeg']")).click();
        driver.findElement(By.xpath("//a[@href='/video-games/playstation-4/accessories/controllers/products/sony-dualshock-4-black-wireless-controller/10136481.html']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-primary ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("VIEW CART")).click();
       // driver.findElement(By.cssSelector("button[class='view-cart-button']")).click();
        driver.findElement(By.cssSelector("a[href='https://www.gamestop.com/checkout/login/']")).click();


    }
}
