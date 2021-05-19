package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement web=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement web1=driver.findElement(By.xpath("//div[@id='droppable']"));
//        WebElement web3=driver.findElement(By.xpath("//iframe [@src='/resources/demos/droppable/default.html']"));

        Actions action=new Actions(driver);
        action.clickAndHold(web).moveToElement(web1).release().build().perform();
       // Thread.sleep(5000);
        //action.clickAndHold(web).moveToElement(web3).release().build().perform();


    }
}
