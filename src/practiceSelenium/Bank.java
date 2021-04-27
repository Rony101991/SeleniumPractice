package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//alimu//IdeaProjects//SeleniumPractice//driver//chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://citibank.com");
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
       // driver.findElement(By.xpath("//a[@role='button']")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("alimurreza3215");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("alimur@gmail.com");
        driver.findElement(By.xpath("//label[@for='rememberUid']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("afmsk2135");
        driver.findElement(By.xpath("//button[@id='signInBtn']")).click();
        driver.findElement(By.xpath("//button[@id='forgotPwdLink']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='ATM/Debit or Credit Card Number']")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/nav/a[1]/img")).click();






    }
}
