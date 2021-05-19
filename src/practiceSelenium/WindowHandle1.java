package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentWindow= driver.getWindowHandle();
        System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());

        driver.findElement(By.xpath("//button[@id='windowButton']")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        Set<String> window=driver.getWindowHandles();
        Iterator<String> ar =window.iterator();
        while (ar.hasNext()){
            String crc= ar.next();
            if(!currentWindow.equalsIgnoreCase(crc)){
                driver.switchTo().window(crc);
                System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());

            }
        }


    }
}
