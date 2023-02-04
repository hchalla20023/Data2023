package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class javasclasss {

    public static void main(String[] args) {

        System.out.println("Chrome browser started successfully");

        System.setProperty("webdriver.chrome.driver","D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone");

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        driver.close();

    }
}
