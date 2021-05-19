package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WayFair {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://Wayfair.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Furniture")).click();
        driver.findElement(By.linkText("Living Room Furniture")).click();
        driver.findElement(By.linkText("Sofas")).click();
        driver.findElement(By.xpath("//img[@alt='Ibiza 80.3\" Flared Arm Sofa']")).click();
//        WebElement title=driver.findElement(By.xpath("//div[@class='Grid-item--row PdpLayoutResponsive-formContents']/div/header/h1"));
        Thread.sleep(5000);

        WebElement src= driver.findElement(By.xpath("//*[@id='bd']/div[1]/div[2]/div/div[1]/div[1]/header/h1"));
        Thread.sleep(5000);
//        System.out.print(src.getText());
        Actions a = new Actions(driver);
        a.moveToElement(src).build().perform();
//        src.getText();
        System.out.println(src.getText());


    }
}
